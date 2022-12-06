package org.workload.service;

import com.google.gson.Gson;
import org.workload.thriftGeneratedClasses.ClientRFW;

public class JsonDeserializer implements  WorkLoadDeserializer {

    @Override
    public Object deserialize(String jsonStr) {
        Gson gson = new Gson();

        ClientRFW targetObject = new Gson().fromJson(jsonStr, org.workload.thriftGeneratedClasses.ClientRFW.class);

        return targetObject;
    }
}
