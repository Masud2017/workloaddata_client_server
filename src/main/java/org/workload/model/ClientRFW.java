package org.workload.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ClientRFW implements Serializable {
    private double id;
    private BenchMarkType benchMarkType;
    private WorkLoadMetric workLoadMetric;
    private Integer batchUnit;
    private Integer batchId;
    private Integer batchSize;
    private QueryDataType queryDataType;
    private String dataAnalytics;
}
