package org.workload;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.model.ClientRFD;
import org.workload.service.JsonOrBinaryServerDivider;
import org.workload.service.Listener;
import org.workload.thriftGeneratedClasses.ClientRFDService;
import org.workload.thriftGeneratedClasses.ClientRFDServiceImpl;
import org.workload.utils.Environment;

import java.io.IOException;

public class App
{
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws IOException, TException {
        JsonOrBinaryServerDivider jsonOrBinaryServerDivider = new JsonOrBinaryServerDivider();
        jsonOrBinaryServerDivider.start();
    }
}
