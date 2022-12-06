package org.workload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.worker.WorkloadWorker;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Listener {
    private ServerSocket socket;
    private Integer port;
    private ExecutorService executorService;
    private List<CompletableFuture> completableFutureList;
    private BlockingQueue<Runnable> queue;
    private Logger logger = LoggerFactory.getLogger(Listener.class);


    public Listener(Integer port) throws IOException {
        this.queue = new ArrayBlockingQueue<>(100);
        this.port = port;
        this.socket = new ServerSocket(this.port);
//        this.socket.bind(new InetSocketAddress("192.168.0.6",this.port));
        this.socket.bind(new InetSocketAddress("3.80.36.12",this.port));
        this.executorService = new ThreadPoolExecutor(10,20,5,TimeUnit.MINUTES,this.queue);
        this.completableFutureList = new ArrayList<>();
    }

    public void listen() throws IOException {
        try {
            while (true) {

                this.logger.info("Listening to the port : " + this.port);
                Socket newSock = this.socket.accept();

//                RecieverWorker recieverWorker = new RecieverWorker(newSock);
//                SenderWorker senderWorker = new SenderWorker(newSock);
                WorkloadWorker workloadWorker = new WorkloadWorker(newSock);

//                this.completableFutureList.add(Futurity.shift(this.executorService.submit(recieverWorker))); // using Futurity::shift(Future) to convert a standard Future class instance to CompleteableFuture instance
//                this.completableFutureList.add(Futurity.shift(this.executorService.submit(senderWorker)));
//                this.completableFutureList.get(0).thenAccept(item -> System.out.println("Hello wworld "+item));
                this.executorService.submit(workloadWorker);


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.socket.close();
        }
    }
}
