package org.workload.service;

import org.workload.worker.BinaryServer;
import org.workload.worker.JsonServer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JsonOrBinaryServerDivider {
    private ExecutorService executorService;

    public JsonOrBinaryServerDivider () {
        this.executorService = Executors.newFixedThreadPool(2);
    }

    public void start() {
        JsonServer jsonServer = new JsonServer();
        BinaryServer binaryServer = new BinaryServer();
        this.executorService.submit(jsonServer);
        this.executorService.submit(binaryServer);
    }
}
