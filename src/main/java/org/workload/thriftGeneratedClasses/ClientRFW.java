/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.workload.thriftGeneratedClasses;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-25")
public class ClientRFW implements org.apache.thrift.TBase<ClientRFW, ClientRFW._Fields>, java.io.Serializable, Cloneable, Comparable<ClientRFW> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientRFW");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField BENCH_MARK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("benchMarkType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField WORK_LOAD_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("workLoadMetric", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BATCH_UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("batchUnit", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField BATCH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("batchId", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField BATCH_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("batchSize", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField QUERY_DATA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("queryDataType", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField DATA_ANALYTICS_FIELD_DESC = new org.apache.thrift.protocol.TField("dataAnalytics", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClientRFWStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClientRFWTupleSchemeFactory();

  public double id; // required
  /**
   * 
   * @see BenchMarkType
   */
  public @org.apache.thrift.annotation.Nullable BenchMarkType benchMarkType; // required
  /**
   * 
   * @see WorkLoadMetric
   */
  public @org.apache.thrift.annotation.Nullable WorkLoadMetric workLoadMetric; // required
  public int batchUnit; // required
  public int batchId; // required
  public int batchSize; // required
  /**
   * 
   * @see QueryDataType
   */
  public @org.apache.thrift.annotation.Nullable QueryDataType queryDataType; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String dataAnalytics; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    /**
     * 
     * @see BenchMarkType
     */
    BENCH_MARK_TYPE((short)2, "benchMarkType"),
    /**
     * 
     * @see WorkLoadMetric
     */
    WORK_LOAD_METRIC((short)3, "workLoadMetric"),
    BATCH_UNIT((short)4, "batchUnit"),
    BATCH_ID((short)5, "batchId"),
    BATCH_SIZE((short)6, "batchSize"),
    /**
     * 
     * @see QueryDataType
     */
    QUERY_DATA_TYPE((short)7, "queryDataType"),
    DATA_ANALYTICS((short)8, "dataAnalytics");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // BENCH_MARK_TYPE
          return BENCH_MARK_TYPE;
        case 3: // WORK_LOAD_METRIC
          return WORK_LOAD_METRIC;
        case 4: // BATCH_UNIT
          return BATCH_UNIT;
        case 5: // BATCH_ID
          return BATCH_ID;
        case 6: // BATCH_SIZE
          return BATCH_SIZE;
        case 7: // QUERY_DATA_TYPE
          return QUERY_DATA_TYPE;
        case 8: // DATA_ANALYTICS
          return DATA_ANALYTICS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __BATCHUNIT_ISSET_ID = 1;
  private static final int __BATCHID_ISSET_ID = 2;
  private static final int __BATCHSIZE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.BENCH_MARK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("benchMarkType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BenchMarkType.class)));
    tmpMap.put(_Fields.WORK_LOAD_METRIC, new org.apache.thrift.meta_data.FieldMetaData("workLoadMetric", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, WorkLoadMetric.class)));
    tmpMap.put(_Fields.BATCH_UNIT, new org.apache.thrift.meta_data.FieldMetaData("batchUnit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.BATCH_ID, new org.apache.thrift.meta_data.FieldMetaData("batchId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.BATCH_SIZE, new org.apache.thrift.meta_data.FieldMetaData("batchSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.QUERY_DATA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("queryDataType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, QueryDataType.class)));
    tmpMap.put(_Fields.DATA_ANALYTICS, new org.apache.thrift.meta_data.FieldMetaData("dataAnalytics", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientRFW.class, metaDataMap);
  }

  public ClientRFW() {
  }

  public ClientRFW(
    double id,
    BenchMarkType benchMarkType,
    WorkLoadMetric workLoadMetric,
    int batchUnit,
    int batchId,
    int batchSize,
    QueryDataType queryDataType,
    java.lang.String dataAnalytics)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.benchMarkType = benchMarkType;
    this.workLoadMetric = workLoadMetric;
    this.batchUnit = batchUnit;
    setBatchUnitIsSet(true);
    this.batchId = batchId;
    setBatchIdIsSet(true);
    this.batchSize = batchSize;
    setBatchSizeIsSet(true);
    this.queryDataType = queryDataType;
    this.dataAnalytics = dataAnalytics;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientRFW(ClientRFW other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetBenchMarkType()) {
      this.benchMarkType = other.benchMarkType;
    }
    if (other.isSetWorkLoadMetric()) {
      this.workLoadMetric = other.workLoadMetric;
    }
    this.batchUnit = other.batchUnit;
    this.batchId = other.batchId;
    this.batchSize = other.batchSize;
    if (other.isSetQueryDataType()) {
      this.queryDataType = other.queryDataType;
    }
    if (other.isSetDataAnalytics()) {
      this.dataAnalytics = other.dataAnalytics;
    }
  }

  @Override
  public ClientRFW deepCopy() {
    return new ClientRFW(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0.0;
    this.benchMarkType = null;
    this.workLoadMetric = null;
    setBatchUnitIsSet(false);
    this.batchUnit = 0;
    setBatchIdIsSet(false);
    this.batchId = 0;
    setBatchSizeIsSet(false);
    this.batchSize = 0;
    this.queryDataType = null;
    this.dataAnalytics = null;
  }

  public double getId() {
    return this.id;
  }

  public ClientRFW setId(double id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  /**
   * 
   * @see BenchMarkType
   */
  @org.apache.thrift.annotation.Nullable
  public BenchMarkType getBenchMarkType() {
    return this.benchMarkType;
  }

  /**
   * 
   * @see BenchMarkType
   */
  public ClientRFW setBenchMarkType(@org.apache.thrift.annotation.Nullable BenchMarkType benchMarkType) {
    this.benchMarkType = benchMarkType;
    return this;
  }

  public void unsetBenchMarkType() {
    this.benchMarkType = null;
  }

  /** Returns true if field benchMarkType is set (has been assigned a value) and false otherwise */
  public boolean isSetBenchMarkType() {
    return this.benchMarkType != null;
  }

  public void setBenchMarkTypeIsSet(boolean value) {
    if (!value) {
      this.benchMarkType = null;
    }
  }

  /**
   * 
   * @see WorkLoadMetric
   */
  @org.apache.thrift.annotation.Nullable
  public WorkLoadMetric getWorkLoadMetric() {
    return this.workLoadMetric;
  }

  /**
   * 
   * @see WorkLoadMetric
   */
  public ClientRFW setWorkLoadMetric(@org.apache.thrift.annotation.Nullable WorkLoadMetric workLoadMetric) {
    this.workLoadMetric = workLoadMetric;
    return this;
  }

  public void unsetWorkLoadMetric() {
    this.workLoadMetric = null;
  }

  /** Returns true if field workLoadMetric is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkLoadMetric() {
    return this.workLoadMetric != null;
  }

  public void setWorkLoadMetricIsSet(boolean value) {
    if (!value) {
      this.workLoadMetric = null;
    }
  }

  public int getBatchUnit() {
    return this.batchUnit;
  }

  public ClientRFW setBatchUnit(int batchUnit) {
    this.batchUnit = batchUnit;
    setBatchUnitIsSet(true);
    return this;
  }

  public void unsetBatchUnit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BATCHUNIT_ISSET_ID);
  }

  /** Returns true if field batchUnit is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchUnit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BATCHUNIT_ISSET_ID);
  }

  public void setBatchUnitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BATCHUNIT_ISSET_ID, value);
  }

  public int getBatchId() {
    return this.batchId;
  }

  public ClientRFW setBatchId(int batchId) {
    this.batchId = batchId;
    setBatchIdIsSet(true);
    return this;
  }

  public void unsetBatchId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BATCHID_ISSET_ID);
  }

  /** Returns true if field batchId is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BATCHID_ISSET_ID);
  }

  public void setBatchIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BATCHID_ISSET_ID, value);
  }

  public int getBatchSize() {
    return this.batchSize;
  }

  public ClientRFW setBatchSize(int batchSize) {
    this.batchSize = batchSize;
    setBatchSizeIsSet(true);
    return this;
  }

  public void unsetBatchSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BATCHSIZE_ISSET_ID);
  }

  /** Returns true if field batchSize is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BATCHSIZE_ISSET_ID);
  }

  public void setBatchSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BATCHSIZE_ISSET_ID, value);
  }

  /**
   * 
   * @see QueryDataType
   */
  @org.apache.thrift.annotation.Nullable
  public QueryDataType getQueryDataType() {
    return this.queryDataType;
  }

  /**
   * 
   * @see QueryDataType
   */
  public ClientRFW setQueryDataType(@org.apache.thrift.annotation.Nullable QueryDataType queryDataType) {
    this.queryDataType = queryDataType;
    return this;
  }

  public void unsetQueryDataType() {
    this.queryDataType = null;
  }

  /** Returns true if field queryDataType is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryDataType() {
    return this.queryDataType != null;
  }

  public void setQueryDataTypeIsSet(boolean value) {
    if (!value) {
      this.queryDataType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDataAnalytics() {
    return this.dataAnalytics;
  }

  public ClientRFW setDataAnalytics(@org.apache.thrift.annotation.Nullable java.lang.String dataAnalytics) {
    this.dataAnalytics = dataAnalytics;
    return this;
  }

  public void unsetDataAnalytics() {
    this.dataAnalytics = null;
  }

  /** Returns true if field dataAnalytics is set (has been assigned a value) and false otherwise */
  public boolean isSetDataAnalytics() {
    return this.dataAnalytics != null;
  }

  public void setDataAnalyticsIsSet(boolean value) {
    if (!value) {
      this.dataAnalytics = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Double)value);
      }
      break;

    case BENCH_MARK_TYPE:
      if (value == null) {
        unsetBenchMarkType();
      } else {
        setBenchMarkType((BenchMarkType)value);
      }
      break;

    case WORK_LOAD_METRIC:
      if (value == null) {
        unsetWorkLoadMetric();
      } else {
        setWorkLoadMetric((WorkLoadMetric)value);
      }
      break;

    case BATCH_UNIT:
      if (value == null) {
        unsetBatchUnit();
      } else {
        setBatchUnit((java.lang.Integer)value);
      }
      break;

    case BATCH_ID:
      if (value == null) {
        unsetBatchId();
      } else {
        setBatchId((java.lang.Integer)value);
      }
      break;

    case BATCH_SIZE:
      if (value == null) {
        unsetBatchSize();
      } else {
        setBatchSize((java.lang.Integer)value);
      }
      break;

    case QUERY_DATA_TYPE:
      if (value == null) {
        unsetQueryDataType();
      } else {
        setQueryDataType((QueryDataType)value);
      }
      break;

    case DATA_ANALYTICS:
      if (value == null) {
        unsetDataAnalytics();
      } else {
        setDataAnalytics((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case BENCH_MARK_TYPE:
      return getBenchMarkType();

    case WORK_LOAD_METRIC:
      return getWorkLoadMetric();

    case BATCH_UNIT:
      return getBatchUnit();

    case BATCH_ID:
      return getBatchId();

    case BATCH_SIZE:
      return getBatchSize();

    case QUERY_DATA_TYPE:
      return getQueryDataType();

    case DATA_ANALYTICS:
      return getDataAnalytics();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case BENCH_MARK_TYPE:
      return isSetBenchMarkType();
    case WORK_LOAD_METRIC:
      return isSetWorkLoadMetric();
    case BATCH_UNIT:
      return isSetBatchUnit();
    case BATCH_ID:
      return isSetBatchId();
    case BATCH_SIZE:
      return isSetBatchSize();
    case QUERY_DATA_TYPE:
      return isSetQueryDataType();
    case DATA_ANALYTICS:
      return isSetDataAnalytics();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ClientRFW)
      return this.equals((ClientRFW)that);
    return false;
  }

  public boolean equals(ClientRFW that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_benchMarkType = true && this.isSetBenchMarkType();
    boolean that_present_benchMarkType = true && that.isSetBenchMarkType();
    if (this_present_benchMarkType || that_present_benchMarkType) {
      if (!(this_present_benchMarkType && that_present_benchMarkType))
        return false;
      if (!this.benchMarkType.equals(that.benchMarkType))
        return false;
    }

    boolean this_present_workLoadMetric = true && this.isSetWorkLoadMetric();
    boolean that_present_workLoadMetric = true && that.isSetWorkLoadMetric();
    if (this_present_workLoadMetric || that_present_workLoadMetric) {
      if (!(this_present_workLoadMetric && that_present_workLoadMetric))
        return false;
      if (!this.workLoadMetric.equals(that.workLoadMetric))
        return false;
    }

    boolean this_present_batchUnit = true;
    boolean that_present_batchUnit = true;
    if (this_present_batchUnit || that_present_batchUnit) {
      if (!(this_present_batchUnit && that_present_batchUnit))
        return false;
      if (this.batchUnit != that.batchUnit)
        return false;
    }

    boolean this_present_batchId = true;
    boolean that_present_batchId = true;
    if (this_present_batchId || that_present_batchId) {
      if (!(this_present_batchId && that_present_batchId))
        return false;
      if (this.batchId != that.batchId)
        return false;
    }

    boolean this_present_batchSize = true;
    boolean that_present_batchSize = true;
    if (this_present_batchSize || that_present_batchSize) {
      if (!(this_present_batchSize && that_present_batchSize))
        return false;
      if (this.batchSize != that.batchSize)
        return false;
    }

    boolean this_present_queryDataType = true && this.isSetQueryDataType();
    boolean that_present_queryDataType = true && that.isSetQueryDataType();
    if (this_present_queryDataType || that_present_queryDataType) {
      if (!(this_present_queryDataType && that_present_queryDataType))
        return false;
      if (!this.queryDataType.equals(that.queryDataType))
        return false;
    }

    boolean this_present_dataAnalytics = true && this.isSetDataAnalytics();
    boolean that_present_dataAnalytics = true && that.isSetDataAnalytics();
    if (this_present_dataAnalytics || that_present_dataAnalytics) {
      if (!(this_present_dataAnalytics && that_present_dataAnalytics))
        return false;
      if (!this.dataAnalytics.equals(that.dataAnalytics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetBenchMarkType()) ? 131071 : 524287);
    if (isSetBenchMarkType())
      hashCode = hashCode * 8191 + benchMarkType.getValue();

    hashCode = hashCode * 8191 + ((isSetWorkLoadMetric()) ? 131071 : 524287);
    if (isSetWorkLoadMetric())
      hashCode = hashCode * 8191 + workLoadMetric.getValue();

    hashCode = hashCode * 8191 + batchUnit;

    hashCode = hashCode * 8191 + batchId;

    hashCode = hashCode * 8191 + batchSize;

    hashCode = hashCode * 8191 + ((isSetQueryDataType()) ? 131071 : 524287);
    if (isSetQueryDataType())
      hashCode = hashCode * 8191 + queryDataType.getValue();

    hashCode = hashCode * 8191 + ((isSetDataAnalytics()) ? 131071 : 524287);
    if (isSetDataAnalytics())
      hashCode = hashCode * 8191 + dataAnalytics.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClientRFW other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBenchMarkType(), other.isSetBenchMarkType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBenchMarkType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.benchMarkType, other.benchMarkType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWorkLoadMetric(), other.isSetWorkLoadMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkLoadMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workLoadMetric, other.workLoadMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBatchUnit(), other.isSetBatchUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchUnit, other.batchUnit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBatchId(), other.isSetBatchId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchId, other.batchId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBatchSize(), other.isSetBatchSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchSize, other.batchSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryDataType(), other.isSetQueryDataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryDataType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryDataType, other.queryDataType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDataAnalytics(), other.isSetDataAnalytics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataAnalytics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataAnalytics, other.dataAnalytics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientRFW(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("benchMarkType:");
    if (this.benchMarkType == null) {
      sb.append("null");
    } else {
      sb.append(this.benchMarkType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workLoadMetric:");
    if (this.workLoadMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.workLoadMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("batchUnit:");
    sb.append(this.batchUnit);
    first = false;
    if (!first) sb.append(", ");
    sb.append("batchId:");
    sb.append(this.batchId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("batchSize:");
    sb.append(this.batchSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryDataType:");
    if (this.queryDataType == null) {
      sb.append("null");
    } else {
      sb.append(this.queryDataType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataAnalytics:");
    if (this.dataAnalytics == null) {
      sb.append("null");
    } else {
      sb.append(this.dataAnalytics);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClientRFWStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ClientRFWStandardScheme getScheme() {
      return new ClientRFWStandardScheme();
    }
  }

  private static class ClientRFWStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClientRFW> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientRFW struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.id = iprot.readDouble();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BENCH_MARK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.benchMarkType = org.workload.thriftGeneratedClasses.BenchMarkType.findByValue(iprot.readI32());
              struct.setBenchMarkTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WORK_LOAD_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.workLoadMetric = org.workload.thriftGeneratedClasses.WorkLoadMetric.findByValue(iprot.readI32());
              struct.setWorkLoadMetricIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BATCH_UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchUnit = iprot.readI32();
              struct.setBatchUnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BATCH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchId = iprot.readI32();
              struct.setBatchIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BATCH_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchSize = iprot.readI32();
              struct.setBatchSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // QUERY_DATA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.queryDataType = org.workload.thriftGeneratedClasses.QueryDataType.findByValue(iprot.readI32());
              struct.setQueryDataTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // DATA_ANALYTICS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataAnalytics = iprot.readString();
              struct.setDataAnalyticsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientRFW struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeDouble(struct.id);
      oprot.writeFieldEnd();
      if (struct.benchMarkType != null) {
        oprot.writeFieldBegin(BENCH_MARK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.benchMarkType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.workLoadMetric != null) {
        oprot.writeFieldBegin(WORK_LOAD_METRIC_FIELD_DESC);
        oprot.writeI32(struct.workLoadMetric.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BATCH_UNIT_FIELD_DESC);
      oprot.writeI32(struct.batchUnit);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BATCH_ID_FIELD_DESC);
      oprot.writeI32(struct.batchId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BATCH_SIZE_FIELD_DESC);
      oprot.writeI32(struct.batchSize);
      oprot.writeFieldEnd();
      if (struct.queryDataType != null) {
        oprot.writeFieldBegin(QUERY_DATA_TYPE_FIELD_DESC);
        oprot.writeI32(struct.queryDataType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.dataAnalytics != null) {
        oprot.writeFieldBegin(DATA_ANALYTICS_FIELD_DESC);
        oprot.writeString(struct.dataAnalytics);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientRFWTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ClientRFWTupleScheme getScheme() {
      return new ClientRFWTupleScheme();
    }
  }

  private static class ClientRFWTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClientRFW> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientRFW struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetBenchMarkType()) {
        optionals.set(1);
      }
      if (struct.isSetWorkLoadMetric()) {
        optionals.set(2);
      }
      if (struct.isSetBatchUnit()) {
        optionals.set(3);
      }
      if (struct.isSetBatchId()) {
        optionals.set(4);
      }
      if (struct.isSetBatchSize()) {
        optionals.set(5);
      }
      if (struct.isSetQueryDataType()) {
        optionals.set(6);
      }
      if (struct.isSetDataAnalytics()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeDouble(struct.id);
      }
      if (struct.isSetBenchMarkType()) {
        oprot.writeI32(struct.benchMarkType.getValue());
      }
      if (struct.isSetWorkLoadMetric()) {
        oprot.writeI32(struct.workLoadMetric.getValue());
      }
      if (struct.isSetBatchUnit()) {
        oprot.writeI32(struct.batchUnit);
      }
      if (struct.isSetBatchId()) {
        oprot.writeI32(struct.batchId);
      }
      if (struct.isSetBatchSize()) {
        oprot.writeI32(struct.batchSize);
      }
      if (struct.isSetQueryDataType()) {
        oprot.writeI32(struct.queryDataType.getValue());
      }
      if (struct.isSetDataAnalytics()) {
        oprot.writeString(struct.dataAnalytics);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientRFW struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readDouble();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.benchMarkType = org.workload.thriftGeneratedClasses.BenchMarkType.findByValue(iprot.readI32());
        struct.setBenchMarkTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.workLoadMetric = org.workload.thriftGeneratedClasses.WorkLoadMetric.findByValue(iprot.readI32());
        struct.setWorkLoadMetricIsSet(true);
      }
      if (incoming.get(3)) {
        struct.batchUnit = iprot.readI32();
        struct.setBatchUnitIsSet(true);
      }
      if (incoming.get(4)) {
        struct.batchId = iprot.readI32();
        struct.setBatchIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.batchSize = iprot.readI32();
        struct.setBatchSizeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.queryDataType = org.workload.thriftGeneratedClasses.QueryDataType.findByValue(iprot.readI32());
        struct.setQueryDataTypeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.dataAnalytics = iprot.readString();
        struct.setDataAnalyticsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

