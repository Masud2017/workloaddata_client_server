package org.workload.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.thrift.TBase;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ClientRFD  implements Serializable {
    private double id;
    private double lastBatchId;
    private List<Double> dataSampleRequested;
    private double dataAnalytics;
}
