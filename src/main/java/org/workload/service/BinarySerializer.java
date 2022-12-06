package org.workload.service;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TMemoryBuffer;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.model.ClientRFD;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * A class that serialize the model classes to the binary form.
 * This class is an implementation of apache thrift library.
 * */
public class BinarySerializer implements WorkLoadSerializer {
    private Logger logger = LoggerFactory.getLogger(BinarySerializer.class);
    private TProtocol protocol;
    private TSocket thirftSocket;
    private Socket systemNetworkScoket;

    public BinarySerializer(Socket systemNetworkScoket) throws TTransportException {
        this.systemNetworkScoket = systemNetworkScoket;
        this.thirftSocket = new TSocket(this.systemNetworkScoket);
        this.protocol = new TBinaryProtocol(this.thirftSocket);
    }

    @Override
    public Object serialize(ClientRFD clientRFD) {

        return null;

    }
}
