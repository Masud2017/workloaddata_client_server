package org.workload.worker;

import org.workload.service.Listener;
import org.workload.utils.Environment;

import java.io.IOException;

public class JsonServer implements Runnable {
    @Override
    public void run() {
        Environment env = null;
        try {
            env = new Environment();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Listener listener = null;
        try {
            listener = new Listener(Integer.parseInt(env.getValue("server.port")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            listener.listen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
