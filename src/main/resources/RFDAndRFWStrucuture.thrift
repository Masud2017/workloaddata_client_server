namespace java org.workload.thriftGeneratedClasses

typedef i32 int 

exception ClientRFWException {
   1: int code,
   2:string description
}

enum BenchMarkType {
    DVD = 0,
    NDBench = 1
}

enum WorkLoadMetric {
    CPU,
    NETWORK_IN,
    NETWORK_OUT,
    MEMORY,
    FINAL_TARGET
}

enum QueryDataType {
    TRAINING_DATA,
    TESTING_DATA
}

struct ClientRFW {
    1:double id,
    2:BenchMarkType benchMarkType,
    3:WorkLoadMetric workLoadMetric,
    4:int batchUnit,
    5:int batchId,
    6:int batchSize,
    7:QueryDataType queryDataType,
    8:string dataAnalytics
}

// ClientRFD section started
exception ClientRFDException {
    1:int code;
    2:string description;
}

struct ClientRFD {
    1:double id,
    2:int lastBatchId,
    3:list<double> dataSampleRequested,
    4:double dataAnalytics
}

service ClientRFDService {
    void sayHello(),// for testing the connection similar to ping()
    ClientRFD getClientRFD(1:ClientRFW clientRFW) throws(1:ClientRFDException e ),
}
