/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.workload.thriftGeneratedClasses;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-25")
public class ClientRFD implements org.apache.thrift.TBase<ClientRFD, ClientRFD._Fields>, java.io.Serializable, Cloneable, Comparable<ClientRFD> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientRFD");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_BATCH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastBatchId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_SAMPLE_REQUESTED_FIELD_DESC = new org.apache.thrift.protocol.TField("dataSampleRequested", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_ANALYTICS_FIELD_DESC = new org.apache.thrift.protocol.TField("dataAnalytics", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClientRFDStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClientRFDTupleSchemeFactory();

  public double id; // required
  public int lastBatchId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> dataSampleRequested; // required
  public double dataAnalytics; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    LAST_BATCH_ID((short)2, "lastBatchId"),
    DATA_SAMPLE_REQUESTED((short)3, "dataSampleRequested"),
    DATA_ANALYTICS((short)4, "dataAnalytics");

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
        case 2: // LAST_BATCH_ID
          return LAST_BATCH_ID;
        case 3: // DATA_SAMPLE_REQUESTED
          return DATA_SAMPLE_REQUESTED;
        case 4: // DATA_ANALYTICS
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
  private static final int __LASTBATCHID_ISSET_ID = 1;
  private static final int __DATAANALYTICS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LAST_BATCH_ID, new org.apache.thrift.meta_data.FieldMetaData("lastBatchId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.DATA_SAMPLE_REQUESTED, new org.apache.thrift.meta_data.FieldMetaData("dataSampleRequested", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.DATA_ANALYTICS, new org.apache.thrift.meta_data.FieldMetaData("dataAnalytics", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientRFD.class, metaDataMap);
  }

  public ClientRFD() {
  }

  public ClientRFD(
    double id,
    int lastBatchId,
    java.util.List<java.lang.Double> dataSampleRequested,
    double dataAnalytics)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.lastBatchId = lastBatchId;
    setLastBatchIdIsSet(true);
    this.dataSampleRequested = dataSampleRequested;
    this.dataAnalytics = dataAnalytics;
    setDataAnalyticsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientRFD(ClientRFD other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.lastBatchId = other.lastBatchId;
    if (other.isSetDataSampleRequested()) {
      java.util.List<java.lang.Double> __this__dataSampleRequested = new java.util.ArrayList<java.lang.Double>(other.dataSampleRequested);
      this.dataSampleRequested = __this__dataSampleRequested;
    }
    this.dataAnalytics = other.dataAnalytics;
  }

  @Override
  public ClientRFD deepCopy() {
    return new ClientRFD(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0.0;
    setLastBatchIdIsSet(false);
    this.lastBatchId = 0;
    this.dataSampleRequested = null;
    setDataAnalyticsIsSet(false);
    this.dataAnalytics = 0.0;
  }

  public double getId() {
    return this.id;
  }

  public ClientRFD setId(double id) {
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

  public int getLastBatchId() {
    return this.lastBatchId;
  }

  public ClientRFD setLastBatchId(int lastBatchId) {
    this.lastBatchId = lastBatchId;
    setLastBatchIdIsSet(true);
    return this;
  }

  public void unsetLastBatchId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTBATCHID_ISSET_ID);
  }

  /** Returns true if field lastBatchId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastBatchId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTBATCHID_ISSET_ID);
  }

  public void setLastBatchIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTBATCHID_ISSET_ID, value);
  }

  public int getDataSampleRequestedSize() {
    return (this.dataSampleRequested == null) ? 0 : this.dataSampleRequested.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Double> getDataSampleRequestedIterator() {
    return (this.dataSampleRequested == null) ? null : this.dataSampleRequested.iterator();
  }

  public void addToDataSampleRequested(double elem) {
    if (this.dataSampleRequested == null) {
      this.dataSampleRequested = new java.util.ArrayList<java.lang.Double>();
    }
    this.dataSampleRequested.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Double> getDataSampleRequested() {
    return this.dataSampleRequested;
  }

  public ClientRFD setDataSampleRequested(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> dataSampleRequested) {
    this.dataSampleRequested = dataSampleRequested;
    return this;
  }

  public void unsetDataSampleRequested() {
    this.dataSampleRequested = null;
  }

  /** Returns true if field dataSampleRequested is set (has been assigned a value) and false otherwise */
  public boolean isSetDataSampleRequested() {
    return this.dataSampleRequested != null;
  }

  public void setDataSampleRequestedIsSet(boolean value) {
    if (!value) {
      this.dataSampleRequested = null;
    }
  }

  public double getDataAnalytics() {
    return this.dataAnalytics;
  }

  public ClientRFD setDataAnalytics(double dataAnalytics) {
    this.dataAnalytics = dataAnalytics;
    setDataAnalyticsIsSet(true);
    return this;
  }

  public void unsetDataAnalytics() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DATAANALYTICS_ISSET_ID);
  }

  /** Returns true if field dataAnalytics is set (has been assigned a value) and false otherwise */
  public boolean isSetDataAnalytics() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DATAANALYTICS_ISSET_ID);
  }

  public void setDataAnalyticsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DATAANALYTICS_ISSET_ID, value);
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

    case LAST_BATCH_ID:
      if (value == null) {
        unsetLastBatchId();
      } else {
        setLastBatchId((java.lang.Integer)value);
      }
      break;

    case DATA_SAMPLE_REQUESTED:
      if (value == null) {
        unsetDataSampleRequested();
      } else {
        setDataSampleRequested((java.util.List<java.lang.Double>)value);
      }
      break;

    case DATA_ANALYTICS:
      if (value == null) {
        unsetDataAnalytics();
      } else {
        setDataAnalytics((java.lang.Double)value);
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

    case LAST_BATCH_ID:
      return getLastBatchId();

    case DATA_SAMPLE_REQUESTED:
      return getDataSampleRequested();

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
    case LAST_BATCH_ID:
      return isSetLastBatchId();
    case DATA_SAMPLE_REQUESTED:
      return isSetDataSampleRequested();
    case DATA_ANALYTICS:
      return isSetDataAnalytics();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ClientRFD)
      return this.equals((ClientRFD)that);
    return false;
  }

  public boolean equals(ClientRFD that) {
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

    boolean this_present_lastBatchId = true;
    boolean that_present_lastBatchId = true;
    if (this_present_lastBatchId || that_present_lastBatchId) {
      if (!(this_present_lastBatchId && that_present_lastBatchId))
        return false;
      if (this.lastBatchId != that.lastBatchId)
        return false;
    }

    boolean this_present_dataSampleRequested = true && this.isSetDataSampleRequested();
    boolean that_present_dataSampleRequested = true && that.isSetDataSampleRequested();
    if (this_present_dataSampleRequested || that_present_dataSampleRequested) {
      if (!(this_present_dataSampleRequested && that_present_dataSampleRequested))
        return false;
      if (!this.dataSampleRequested.equals(that.dataSampleRequested))
        return false;
    }

    boolean this_present_dataAnalytics = true;
    boolean that_present_dataAnalytics = true;
    if (this_present_dataAnalytics || that_present_dataAnalytics) {
      if (!(this_present_dataAnalytics && that_present_dataAnalytics))
        return false;
      if (this.dataAnalytics != that.dataAnalytics)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + lastBatchId;

    hashCode = hashCode * 8191 + ((isSetDataSampleRequested()) ? 131071 : 524287);
    if (isSetDataSampleRequested())
      hashCode = hashCode * 8191 + dataSampleRequested.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(dataAnalytics);

    return hashCode;
  }

  @Override
  public int compareTo(ClientRFD other) {
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
    lastComparison = java.lang.Boolean.compare(isSetLastBatchId(), other.isSetLastBatchId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastBatchId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastBatchId, other.lastBatchId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDataSampleRequested(), other.isSetDataSampleRequested());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataSampleRequested()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataSampleRequested, other.dataSampleRequested);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientRFD(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastBatchId:");
    sb.append(this.lastBatchId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataSampleRequested:");
    if (this.dataSampleRequested == null) {
      sb.append("null");
    } else {
      sb.append(this.dataSampleRequested);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataAnalytics:");
    sb.append(this.dataAnalytics);
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

  private static class ClientRFDStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ClientRFDStandardScheme getScheme() {
      return new ClientRFDStandardScheme();
    }
  }

  private static class ClientRFDStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClientRFD> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientRFD struct) throws org.apache.thrift.TException {
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
          case 2: // LAST_BATCH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastBatchId = iprot.readI32();
              struct.setLastBatchIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_SAMPLE_REQUESTED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.dataSampleRequested = new java.util.ArrayList<java.lang.Double>(_list0.size);
                double _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readDouble();
                  struct.dataSampleRequested.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setDataSampleRequestedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_ANALYTICS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.dataAnalytics = iprot.readDouble();
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientRFD struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeDouble(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_BATCH_ID_FIELD_DESC);
      oprot.writeI32(struct.lastBatchId);
      oprot.writeFieldEnd();
      if (struct.dataSampleRequested != null) {
        oprot.writeFieldBegin(DATA_SAMPLE_REQUESTED_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.dataSampleRequested.size()));
          for (double _iter3 : struct.dataSampleRequested)
          {
            oprot.writeDouble(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DATA_ANALYTICS_FIELD_DESC);
      oprot.writeDouble(struct.dataAnalytics);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientRFDTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ClientRFDTupleScheme getScheme() {
      return new ClientRFDTupleScheme();
    }
  }

  private static class ClientRFDTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClientRFD> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientRFD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetLastBatchId()) {
        optionals.set(1);
      }
      if (struct.isSetDataSampleRequested()) {
        optionals.set(2);
      }
      if (struct.isSetDataAnalytics()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeDouble(struct.id);
      }
      if (struct.isSetLastBatchId()) {
        oprot.writeI32(struct.lastBatchId);
      }
      if (struct.isSetDataSampleRequested()) {
        {
          oprot.writeI32(struct.dataSampleRequested.size());
          for (double _iter4 : struct.dataSampleRequested)
          {
            oprot.writeDouble(_iter4);
          }
        }
      }
      if (struct.isSetDataAnalytics()) {
        oprot.writeDouble(struct.dataAnalytics);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientRFD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readDouble();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lastBatchId = iprot.readI32();
        struct.setLastBatchIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.DOUBLE);
          struct.dataSampleRequested = new java.util.ArrayList<java.lang.Double>(_list5.size);
          double _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readDouble();
            struct.dataSampleRequested.add(_elem6);
          }
        }
        struct.setDataSampleRequestedIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dataAnalytics = iprot.readDouble();
        struct.setDataAnalyticsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

