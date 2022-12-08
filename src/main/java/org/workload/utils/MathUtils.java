package org.workload.utils;

import com.google.common.math.IntMath;
import com.google.common.math.Quantiles;
import com.google.common.math.Stats;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.print.Doc;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    private static Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static double avg(List<Document> data) {
        List<Double> convertAbleList = new ArrayList<>();

        for (Document item : data) {
            convertAbleList.add(Double.valueOf((Double) item.get("_id")));
//            convertAbleList.add((Double)item.get("_id"));
        }
        Double sum = Double.valueOf(0);
        for (double item : convertAbleList) {
            sum += item;
        }

        return sum/data.size();
    }
    public static double std(List<Document> data) {
        List<Double> convertAbleList = new ArrayList<>();

        for (Document item : data) {
//            convertAbleList.add(Double.valueOf((String) item.get("_id")));
            convertAbleList.add(Double.valueOf((Double) item.get("_id")));
        }

        return Stats.of(convertAbleList).populationStandardDeviation();
    }
    public static double max(List<Document> data) {
        List<Double> convertAbleList = new ArrayList<>();

        for (Document item : data) {
//            convertAbleList.add(Double.valueOf((String) item.get("_id")));
            convertAbleList.add(Double.valueOf((Double) item.get("_id")));
        }

        return Stats.of(convertAbleList).max();
    }
    public static double min (List<Document> data) {
        List<Double> convertAbleList = new ArrayList<>();

        for (Document item : data) {
//            convertAbleList.add(Double.valueOf((String) item.get("_id")));
            convertAbleList.add(Double.valueOf((Double) item.get("_id")));
        }

        return Stats.of(convertAbleList).min();
    }
    public static double percentile(String nthPercentile,List<Document> data) {
        List<Double> convertAbleList = new ArrayList<>();

        for (Document item : data) {
            if (item == null) {
                continue;
            }
            logger.info("item"+item.get("_id"));

//            convertAbleList.add(Double.valueOf((String) item.get("_id"))); // possible issue
            convertAbleList.add(Double.valueOf((Double) item.get("_id"))); // possible issue
        }

        String[] splitedPercentile = nthPercentile.split("p");
        Integer percentile = Integer.parseInt(splitedPercentile[0]);

        return Quantiles.percentiles().index(percentile).compute(convertAbleList);
    }
}
