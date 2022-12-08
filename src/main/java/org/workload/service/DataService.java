package org.workload.service;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.workload.db.DB;
import org.workload.thriftGeneratedClasses.*;
import org.workload.utils.MathUtils;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private DB db;
    private Logger logger = LoggerFactory.getLogger(DataService.class);

    public DataService () {
        db = new DB();
    }
    public ClientRFD processClientRFWAndGetClientRFD(ClientRFW clientRFW) {
        Integer batchSize = clientRFW.getBatchSize();
        Integer batchMember = clientRFW.getBatchUnit();
        Integer batchLimit = batchMember * batchSize;

        List<Document> limitedData = null;


        if (clientRFW.getBenchMarkType() == BenchMarkType.NDBench) {
            if (clientRFW.getQueryDataType() == QueryDataType.TESTING_DATA) {
                if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.CPU) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"CPUUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.MEMORY) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"MemoryUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_IN) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"NetworkIn_Average");


                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_OUT) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"NetworkOut_Average");

                }  else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.FINAL_TARGET) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"Final_target");

                }
            } else if (clientRFW.getQueryDataType() == QueryDataType.TRAINING_DATA) {
                if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.CPU) {
                    limitedData = this.db.getLimitedDataFromNDBenchTraining(batchLimit,"CPUUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.MEMORY) {
                    limitedData = this.db.getLimitedDataFromNDBenchTraining(batchLimit,"MemoryUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_IN) {
                    limitedData = this.db.getLimitedDataFromNDBenchTraining(batchLimit,"NetworkIn_Average");


                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_OUT) {
                    limitedData = this.db.getLimitedDataFromNDBenchTraining(batchLimit,"NetworkOut_Average");

                }  else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.FINAL_TARGET) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"Final_Target");

                }
            }

        } else if (clientRFW.getBenchMarkType() == BenchMarkType.DVD) {
            if (clientRFW.getQueryDataType() == QueryDataType.TESTING_DATA) {
                if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.CPU) {
                    limitedData = this.db.getLimitedDataFromDVDTest(batchLimit,"CPUUtilization_Average");


                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.MEMORY) {
                    limitedData = this.db.getLimitedDataFromDVDTest(batchLimit,"MemoryUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_IN) {
                    limitedData = this.db.getLimitedDataFromDVDTest(batchLimit,"NetworkIn_Average");


                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_OUT) {
                    limitedData = this.db.getLimitedDataFromDVDTest(batchLimit,"NetworkOut_Average");

                }  else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.FINAL_TARGET) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"Final_Target");

                }
            } else if (clientRFW.getQueryDataType() == QueryDataType.TRAINING_DATA){

                if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.CPU) {
                    limitedData = this.db.getLimitedDataFromDVDTraining(batchLimit,"CPUUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.MEMORY) {
                    limitedData = this.db.getLimitedDataFromDVDTraining(batchLimit,"MemoryUtilization_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_IN) {
                    limitedData = this.db.getLimitedDataFromDVDTraining(batchLimit,"NetworkIn_Average");


                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.NETWORK_OUT) {
                    limitedData = this.db.getLimitedDataFromDVDTraining(batchLimit,"NetworkOut_Average");

                } else if (clientRFW.getWorkLoadMetric() == WorkLoadMetric.FINAL_TARGET) {
                    limitedData = this.db.getLimitedDataFromNDBenchTest(batchLimit,"Final_Targets");

                }
            }
        }

        List<List<Document>> batchList = this.db.convertListOfDocumentToBatch(limitedData,batchSize,batchMember);
        this.logger.info("size of list : "+batchList.size());
this.logger.info("batch id ; "+clientRFW.getBatchId());
        List<Document> selectedBatch = batchList.get(clientRFW.getBatchId() - 1);

        double analytics = this.getDataAnalytics(clientRFW,selectedBatch);

        ClientRFD clientRFD = new ClientRFD();

        clientRFD.setId(clientRFW.getId());
        clientRFD.setDataAnalytics(analytics);
        clientRFD.setLastBatchId(batchSize);
        clientRFD.setDataSampleRequested(this.convertDocumentListToDoubleList(selectedBatch));

        return clientRFD;
    }

    protected double getDataAnalytics (ClientRFW clientRFW,List<Document> selectedBatch) {
        if(clientRFW.getDataAnalytics().equalsIgnoreCase("avg")) {
            return MathUtils.avg(selectedBatch);
        } else if (clientRFW.getDataAnalytics().equalsIgnoreCase("std")) {
            return MathUtils.std(selectedBatch);
        } else if (clientRFW.getDataAnalytics().equalsIgnoreCase("min")) {
            return MathUtils.min(selectedBatch);
        } else if(clientRFW.getDataAnalytics().equalsIgnoreCase("max")) {
            return MathUtils.max(selectedBatch);
        } else {
            return MathUtils.percentile(clientRFW.getDataAnalytics(),selectedBatch);
        }
    }

    protected List<Double> convertDocumentListToDoubleList(List<Document> converteAbleList) {
        List<Double> convertedList = new ArrayList<>();
        for (Document item : converteAbleList) {
            convertedList.add(Double.valueOf((Integer)item.get("_id")));
        }
        return convertedList;
    }

}
