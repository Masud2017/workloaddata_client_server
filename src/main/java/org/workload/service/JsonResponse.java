package org.workload.service;

import com.google.gson.Gson;
import org.workload.thriftGeneratedClasses.ClientRFW;
import org.workload.thriftGeneratedClasses.QueryDataType;

public class JsonResponse {
    private static DataService dataService = new DataService();


    public static String getResponse(ClientRFW clientRFW) {
        Gson gson = new Gson();

        return gson.toJson(dataService.processClientRFWAndGetClientRFD(clientRFW));
    }
}
