package org.workload.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.model.ClientRFW;
import org.workload.service.JsonDeserializer;
import org.workload.service.JsonResponse;
import org.workload.utils.Util;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;



public class WorkloadWorker implements Callable {
    private Socket socket;
    private BufferedInputStream inpStream;
    private DataOutputStream outStream;
    private ByteArrayOutputStream bot;
    private Logger logger = LoggerFactory.getLogger(WorkloadWorker.class);

    public WorkloadWorker(Socket socket) throws IOException {
        this.socket = socket;
        this.socket.setTcpNoDelay(true);
        this.inpStream = new BufferedInputStream(this.socket.getInputStream());
        this.outStream = new DataOutputStream(this.socket.getOutputStream());
        this.bot = new ByteArrayOutputStream();
    }
    @Override
    public Object call() throws Exception {

        try {
            while (true) {
//                this.logger.info("Ip address from a client : "+this.socket.getInetAddress().getHostAddress());
                PrintWriter writer = new PrintWriter(this.socket.getOutputStream());
                int n;
                byte[] buffer = new byte[1024];
                byte[] clientReq;
                n = this.inpStream.read(buffer);
                this.bot.write(buffer,0,n);

                clientReq = this.bot.toByteArray();
                this.bot.flush();


                System.out.println(new String(clientReq, StandardCharsets.UTF_8));

//                String res = "Hello world from workload server showing response to the non browser client";
                String jsonResponse = null;

                if(!Util.sendBrowserResponseIfRequestIfFromBrowser(clientReq,writer)) {
                    // This portion will execute if the request is not from browser
                    JsonDeserializer jsonDeserializer =new JsonDeserializer();try {
                        org.workload.thriftGeneratedClasses.ClientRFW clientRFW = (org.workload.thriftGeneratedClasses.ClientRFW) jsonDeserializer.deserialize(new String(clientReq, StandardCharsets.UTF_8));
                        jsonResponse = JsonResponse.getResponse(clientRFW);
                        this.logger.info("id: "+clientRFW.getId());
                    } catch ( Exception e) {
                        e.printStackTrace();
                    }
//                    logger.info("client id ; "+clientRFW.getId());
                    writer.write(jsonResponse);
                    writer.flush();
                }

            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            this.logger.info("Closing a connection with a client...");
            this.socket.close();
            this.inpStream.close();
            this.outStream.close();
            this.bot.close();
        }

        return null;
    }
}
