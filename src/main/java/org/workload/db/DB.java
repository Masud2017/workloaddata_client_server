package org.workload.db;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import lombok.Setter;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("LOCAL_VARIABLE")
public class DB {
    String template = "mongodb://%s:%s@%s/workload?ssl=true&replicaSet=rs0&readpreference=%s";
    String username = "sahil";
    String password = "sahil123";
    String clusterEndpoint = "docdb-2022-12-06-21-01-00.cluster-ciyul1wnwlfq.us-east-1.docdb.amazonaws.com:27017";
    String readPreference = "secondaryPreferred";
    String connectionString = String.format(template, username, password, clusterEndpoint, readPreference); // temporary change

    MongoClientURI clientURI = new MongoClientURI(connectionString);
    //    private String uri = "mongodb://127.0.0.1:27017/?maxPoolSize=20&w=majority";
    private Logger logger = LoggerFactory.getLogger(DB.class);

    private com.mongodb.client.MongoClient mongoClient;
    private MongoDatabase dataBase;


    public DB () {
        System.setProperty("javax.net.ssl.trustStore", "/tmp/certs/rds-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "sahil123");

//        this.mongoClient = new MongoClient("localhost",27017);
//        this.mongoClient = new MongoClient(uri);
        this.mongoClient =  MongoClients.create(connectionString);


        this.dataBase =  mongoClient.getDatabase("workload");
    }

    public MongoCollection<Document> getDVDTrainingCollection () {
        return this.dataBase.getCollection("dvd_training");
    }
    public MongoCollection<Document> getDVDTestCollection () {
        return this.dataBase.getCollection("dvd_test");
    }
    public MongoCollection<Document> getNDBenchTrainingCollection() {
        return this.dataBase.getCollection("ndbench_training");
    }
    public MongoCollection<Document> getNDBenchTestCollection() {
        return this.dataBase.getCollection("ndbench_test");
    }

    public MongoDatabase getDataBase () {
        return this.dataBase;
    }

//    public MongoClient getMongoClient () {
//        return this.mongoClient;
//    }

    public List<Document> getLimitedDataFromNDBenchTest(Integer limit,String unit) {
        BasicDBObject group = new BasicDBObject();
        BasicDBObject groupParam = new BasicDBObject();
        groupParam.put("_id","$"+unit);
        group.put("$group",groupParam);
        BasicDBObject limitQuery = new BasicDBObject();
        limitQuery.put("$limit",limit);
        List<Bson> queryList = new ArrayList<>();
//        queryList.add(group); //removed
        queryList.add(limitQuery);

        AggregateIterable itter =  this.getNDBenchTestCollection().aggregate(queryList);
        List<Document> returnAbleList = new ArrayList<>();

        MongoCursor cursor = itter.iterator();
        while (cursor.hasNext()) {
            Document cursorDoc = (Document) cursor.next();
            Document unitDoc = new Document(); // added new
            unitDoc.put("_id",cursorDoc.get(unit)); //added new
            returnAbleList.add(unitDoc); // added new
        }


        return returnAbleList;
    }
    public List<Document> getLimitedDataFromNDBenchTraining(Integer limit,String unit) {
        BasicDBObject group = new BasicDBObject();
        BasicDBObject groupParam = new BasicDBObject();
        groupParam.put("_id","$"+unit);
        group.put("$group",groupParam);
        BasicDBObject limitQuery = new BasicDBObject();
        limitQuery.put("$limit",limit);
        List<Bson> queryList = new ArrayList<>();
//        queryList.add(group); // removed temporarily
        queryList.add(limitQuery);

        AggregateIterable itter =  this.getNDBenchTrainingCollection().aggregate(queryList);
        List<Document> returnAbleList = new ArrayList<>();

        MongoCursor cursor = itter.iterator();
        while (cursor.hasNext()) {
            Document cursorDoc = (Document) cursor.next();
            Document unitDoc = new Document(); // added new
            unitDoc.put("_id",cursorDoc.get(unit)); //added new
            returnAbleList.add(unitDoc); // added new
        }


        return returnAbleList;
    }

    public List<Document> getLimitedDataFromDVDTest(Integer limit,String unit) {
        BasicDBObject group = new BasicDBObject();
        BasicDBObject groupParam = new BasicDBObject();
        groupParam.put("_id","$"+unit);
        group.put("$group",groupParam);
        BasicDBObject limitQuery = new BasicDBObject();
        limitQuery.put("$limit",limit);
        List<Bson> queryList = new ArrayList<>();
//        queryList.add(group); // removed
        queryList.add(limitQuery);

        AggregateIterable itter =  this.getDVDTestCollection().aggregate(queryList);
        List<Document> returnAbleList = new ArrayList<>();

        MongoCursor cursor = itter.iterator();
        while (cursor.hasNext()) {
            Document cursorDoc = (Document) cursor.next();
            Document unitDoc = new Document(); // added new
            unitDoc.put("_id",cursorDoc.get(unit)); //added new
            returnAbleList.add(unitDoc); // added new
        }


        return returnAbleList;
    }

    public List<Document> getLimitedDataFromDVDTraining(Integer limit,String unit) {
        BasicDBObject group = new BasicDBObject();
        BasicDBObject groupParam = new BasicDBObject();
        groupParam.put("_id","$"+unit);
        group.put("$group",groupParam);
        BasicDBObject limitQuery = new BasicDBObject();
        limitQuery.put("$limit",limit);
        List<Bson> queryList = new ArrayList<>();
//        queryList.add(group); // removed
        queryList.add(limitQuery);

        AggregateIterable itter =  this.getDVDTrainingCollection().aggregate(queryList);
        List<Document> returnAbleList = new ArrayList<>();

        MongoCursor cursor = itter.iterator();
        while (cursor.hasNext()) {
            Document cursorDoc = (Document) cursor.next();
            Document unitDoc = new Document(); // added new
            unitDoc.put("_id",cursorDoc.get(unit)); //added new
            returnAbleList.add(unitDoc); // added new
        }


        return returnAbleList;
    }

    public List<List<Document>> convertListOfDocumentToBatch(List<Document> docList,Integer batchSize,Integer batchMemberCount) {
        List<List<Document>> batchList = new ArrayList<>();


        List<Document> temp = new ArrayList<>();
        for (int i = 1 ; i <= docList.size(); i++) {
            temp.add(docList.get(i - 1));
            this.logger.info("buggy place"+i);
            if ((i %batchMemberCount) == 0) {
                batchList.add(temp);
                temp = new ArrayList<>();

            }
        }

       try{
           for (List itemList : batchList) {
               for (Object item : itemList) {
                   System.out.println("visualizing" +item);
               }
               this.logger.info("000000");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
this.logger.info("New test doctList size "+docList.size());
        return batchList;
    }

}
