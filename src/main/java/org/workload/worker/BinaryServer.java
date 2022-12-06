package org.workload.worker;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.thriftGeneratedClasses.ClientRFDService;
import org.workload.thriftGeneratedClasses.ClientRFDServiceImpl;

import java.net.InetSocketAddress;

public class BinaryServer implements Runnable {
    private Logger logger = LoggerFactory.getLogger(BinaryServer.class);
    @Override
    public void run() {
        TServerSocket socket = null;
        try {
            socket = new TServerSocket(4445);
        } catch (TTransportException e) {
            throw new RuntimeException(e);
        }
        TSimpleServer server = new TSimpleServer(new TServer.Args(socket)
                .processor(new ClientRFDService.Processor<>(new ClientRFDServiceImpl())));
        this.logger.info("Starting the rpc server at port 4445");
        System.out.println("Starting the rpc server at port 4445");
        server.serve();
        this.logger.info("Ending the rpc server .. ");
    }
}
