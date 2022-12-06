package org.workload.thriftGeneratedClasses;

import org.apache.thrift.TException;
import org.workload.service.DataService;

public class ClientRFDServiceImpl implements  ClientRFDService.Iface {
    @Override
    public void sayHello() throws TException {
        System.out.println("Hello world this is our sayHello rpc procedure call!!! from client");
    }

    @Override
    public ClientRFD getClientRFD(ClientRFW clientRFW) throws ClientRFDException, TException {
        DataService service = new DataService();

        return service.processClientRFWAndGetClientRFD(clientRFW);
    }
}
