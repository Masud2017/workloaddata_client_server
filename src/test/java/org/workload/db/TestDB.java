package org.workload.db;

import org.bson.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestDB {
    @Test
    public void testGetLimitedDataFromNDBenchTest () {

        DB db = new DB();
        List<Document> list = db.getLimitedDataFromNDBenchTest(4,"CPUUtilization_Average");
        Integer expectedSize = 4;

        Integer size = list.size();

        Assertions.assertEquals(expectedSize,size);
    }

    @Test
    public void testConvertListOfDocumentToBatch () {
        DB db = new DB();

        List<List<Document>> batchList = db.convertListOfDocumentToBatch(db.getLimitedDataFromDVDTest(10,"CPUUtilization_Average"),5,2);
        Integer expectedSize = 5;
        Integer size = batchList.size();
        Assertions.assertEquals(expectedSize,size);
    }

}
