package org.workload.service;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.model.ClientRFD;

public class JsonSerializer implements  WorkLoadSerializer {
    private Logger logger = LoggerFactory.getLogger(JsonSerializer.class);

    @Override
    public Object serialize(ClientRFD clientRFD) {
        Gson clientRFDJson = new Gson();
        clientRFDJson.toJson(clientRFD);

        this.logger.info("Data of json value "+clientRFDJson.toJson(clientRFD));

        return clientRFDJson.toJson(clientRFD);
    }
}
