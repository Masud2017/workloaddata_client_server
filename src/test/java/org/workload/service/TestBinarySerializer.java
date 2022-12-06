package org.workload.service;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.junit.jupiter.api.Test;
import org.workload.model.ClientRFD;

import java.net.Socket;

public class TestBinarySerializer {
    private WorkLoadSerializer serializer = new BinarySerializer(new Socket());

    public TestBinarySerializer() throws TTransportException {
    }

    @Test
    public void testSerialize() {
        ClientRFD clientRFD = new ClientRFD();

        clientRFD.setId(Long.valueOf(1321));
        clientRFD.setDataAnalytics(Float.valueOf((float) 1321.54));
        clientRFD.setLastBatchId(132);

        TTransport transport = (TTransport) this.serializer.serialize(clientRFD);



    }
}
