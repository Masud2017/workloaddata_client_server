package org.workload.util;

import org.bson.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.workload.db.DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathUtils {
    @Test
    public void testPercentile() {
        List<Document> given = new ArrayList<>();
        Document doc = new Document();
        doc.put("_id","10");
        given.add(doc);
        Document doc2 = new Document();
        doc.put("_id","20");
        given.add(doc2);
        Document doc3 = new Document();
        doc.put("_id","30");
        given.add(doc3);

        DB db = new DB();


        double expected10Percentile = 32.9;
        double tenpercentile = org.workload.utils.MathUtils.percentile("10p",db.getLimitedDataFromNDBenchTest(2,"CPUUtilization_Average"));
        System.out.println(tenpercentile);

        Assertions.assertEquals(expected10Percentile,tenpercentile);
    }
}
