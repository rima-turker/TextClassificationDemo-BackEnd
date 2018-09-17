// File generated by hadoop record compiler. Do not edit.
package edu.kit.aifb.gwifi.extraction.struct;

public class ExSenseForLabel extends org.apache.hadoop.record.Record {
  private static final org.apache.hadoop.record.meta.RecordTypeInfo _rio_recTypeInfo;
  private static org.apache.hadoop.record.meta.RecordTypeInfo _rio_rtiFilter;
  private static int[] _rio_rtiFilterFields;
  static {
    _rio_recTypeInfo = new org.apache.hadoop.record.meta.RecordTypeInfo("ExSenseForLabel");
    _rio_recTypeInfo.addField("LinkOccCount", org.apache.hadoop.record.meta.TypeID.LongTypeID);
    _rio_recTypeInfo.addField("LinkDocCount", org.apache.hadoop.record.meta.TypeID.LongTypeID);
    _rio_recTypeInfo.addField("FromTitle", org.apache.hadoop.record.meta.TypeID.BoolTypeID);
    _rio_recTypeInfo.addField("FromRedirect", org.apache.hadoop.record.meta.TypeID.BoolTypeID);
  }
  
  private long LinkOccCount;
  private long LinkDocCount;
  private boolean FromTitle;
  private boolean FromRedirect;
  public ExSenseForLabel() { }
  public ExSenseForLabel(
    final long LinkOccCount,
    final long LinkDocCount,
    final boolean FromTitle,
    final boolean FromRedirect) {
    this.LinkOccCount = LinkOccCount;
    this.LinkDocCount = LinkDocCount;
    this.FromTitle = FromTitle;
    this.FromRedirect = FromRedirect;
  }
  public static org.apache.hadoop.record.meta.RecordTypeInfo getTypeInfo() {
    return _rio_recTypeInfo;
  }
  public static void setTypeFilter(org.apache.hadoop.record.meta.RecordTypeInfo rti) {
    if (null == rti) return;
    _rio_rtiFilter = rti;
    _rio_rtiFilterFields = null;
  }
  private static void setupRtiFields()
  {
    if (null == _rio_rtiFilter) return;
    // we may already have done this
    if (null != _rio_rtiFilterFields) return;
    int _rio_i, _rio_j;
    _rio_rtiFilterFields = new int [_rio_rtiFilter.getFieldTypeInfos().size()];
    for (_rio_i=0; _rio_i<_rio_rtiFilterFields.length; _rio_i++) {
      _rio_rtiFilterFields[_rio_i] = 0;
    }
    java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_itFilter = _rio_rtiFilter.getFieldTypeInfos().iterator();
    _rio_i=0;
    while (_rio_itFilter.hasNext()) {
      org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfoFilter = _rio_itFilter.next();
      java.util.Iterator<org.apache.hadoop.record.meta.FieldTypeInfo> _rio_it = _rio_recTypeInfo.getFieldTypeInfos().iterator();
      _rio_j=1;
      while (_rio_it.hasNext()) {
        org.apache.hadoop.record.meta.FieldTypeInfo _rio_tInfo = _rio_it.next();
        if (_rio_tInfo.equals(_rio_tInfoFilter)) {
          _rio_rtiFilterFields[_rio_i] = _rio_j;
          break;
        }
        _rio_j++;
      }
      _rio_i++;
    }
  }
  public long getLinkOccCount() {
    return LinkOccCount;
  }
  public void setLinkOccCount(final long LinkOccCount) {
    this.LinkOccCount=LinkOccCount;
  }
  public long getLinkDocCount() {
    return LinkDocCount;
  }
  public void setLinkDocCount(final long LinkDocCount) {
    this.LinkDocCount=LinkDocCount;
  }
  public boolean getFromTitle() {
    return FromTitle;
  }
  public void setFromTitle(final boolean FromTitle) {
    this.FromTitle=FromTitle;
  }
  public boolean getFromRedirect() {
    return FromRedirect;
  }
  public void setFromRedirect(final boolean FromRedirect) {
    this.FromRedirect=FromRedirect;
  }
  public void serialize(final org.apache.hadoop.record.RecordOutput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(this,_rio_tag);
    _rio_a.writeLong(LinkOccCount,"LinkOccCount");
    _rio_a.writeLong(LinkDocCount,"LinkDocCount");
    _rio_a.writeBool(FromTitle,"FromTitle");
    _rio_a.writeBool(FromRedirect,"FromRedirect");
    _rio_a.endRecord(this,_rio_tag);
  }
  private void deserializeWithoutFilter(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    _rio_a.startRecord(_rio_tag);
    LinkOccCount=_rio_a.readLong("LinkOccCount");
    LinkDocCount=_rio_a.readLong("LinkDocCount");
    FromTitle=_rio_a.readBool("FromTitle");
    FromRedirect=_rio_a.readBool("FromRedirect");
    _rio_a.endRecord(_rio_tag);
  }
  public void deserialize(final org.apache.hadoop.record.RecordInput _rio_a, final String _rio_tag)
  throws java.io.IOException {
    if (null == _rio_rtiFilter) {
      deserializeWithoutFilter(_rio_a, _rio_tag);
      return;
    }
    // if we're here, we need to read based on version info
    _rio_a.startRecord(_rio_tag);
    setupRtiFields();
    for (int _rio_i=0; _rio_i<_rio_rtiFilter.getFieldTypeInfos().size(); _rio_i++) {
      if (1 == _rio_rtiFilterFields[_rio_i]) {
        LinkOccCount=_rio_a.readLong("LinkOccCount");
      }
      else if (2 == _rio_rtiFilterFields[_rio_i]) {
        LinkDocCount=_rio_a.readLong("LinkDocCount");
      }
      else if (3 == _rio_rtiFilterFields[_rio_i]) {
        FromTitle=_rio_a.readBool("FromTitle");
      }
      else if (4 == _rio_rtiFilterFields[_rio_i]) {
        FromRedirect=_rio_a.readBool("FromRedirect");
      }
      else {
        java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo> typeInfos = (java.util.ArrayList<org.apache.hadoop.record.meta.FieldTypeInfo>)(_rio_rtiFilter.getFieldTypeInfos());
        org.apache.hadoop.record.meta.Utils.skip(_rio_a, typeInfos.get(_rio_i).getFieldID(), typeInfos.get(_rio_i).getTypeID());
      }
    }
    _rio_a.endRecord(_rio_tag);
  }
  public int compareTo (final Object _rio_peer_) throws ClassCastException {
    if (!(_rio_peer_ instanceof ExSenseForLabel)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    ExSenseForLabel _rio_peer = (ExSenseForLabel) _rio_peer_;
    int _rio_ret = 0;
    _rio_ret = (LinkOccCount == _rio_peer.LinkOccCount)? 0 :((LinkOccCount<_rio_peer.LinkOccCount)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (LinkDocCount == _rio_peer.LinkDocCount)? 0 :((LinkDocCount<_rio_peer.LinkDocCount)?-1:1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (FromTitle == _rio_peer.FromTitle)? 0 : (FromTitle?1:-1);
    if (_rio_ret != 0) return _rio_ret;
    _rio_ret = (FromRedirect == _rio_peer.FromRedirect)? 0 : (FromRedirect?1:-1);
    if (_rio_ret != 0) return _rio_ret;
    return _rio_ret;
  }
  public boolean equals(final Object _rio_peer_) {
    if (!(_rio_peer_ instanceof ExSenseForLabel)) {
      return false;
    }
    if (_rio_peer_ == this) {
      return true;
    }
    ExSenseForLabel _rio_peer = (ExSenseForLabel) _rio_peer_;
    boolean _rio_ret = false;
    _rio_ret = (LinkOccCount==_rio_peer.LinkOccCount);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (LinkDocCount==_rio_peer.LinkDocCount);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (FromTitle==_rio_peer.FromTitle);
    if (!_rio_ret) return _rio_ret;
    _rio_ret = (FromRedirect==_rio_peer.FromRedirect);
    if (!_rio_ret) return _rio_ret;
    return _rio_ret;
  }
  public Object clone() throws CloneNotSupportedException {
    ExSenseForLabel _rio_other = new ExSenseForLabel();
    _rio_other.LinkOccCount = this.LinkOccCount;
    _rio_other.LinkDocCount = this.LinkDocCount;
    _rio_other.FromTitle = this.FromTitle;
    _rio_other.FromRedirect = this.FromRedirect;
    return _rio_other;
  }
  public int hashCode() {
    int _rio_result = 17;
    int _rio_ret;
    _rio_ret = (int) (LinkOccCount^(LinkOccCount>>>32));
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (int) (LinkDocCount^(LinkDocCount>>>32));
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (FromTitle)?0:1;
    _rio_result = 37*_rio_result + _rio_ret;
    _rio_ret = (FromRedirect)?0:1;
    _rio_result = 37*_rio_result + _rio_ret;
    return _rio_result;
  }
  public static String signature() {
    return "LExSenseForLabel(llzz)";
  }
  public static class Comparator extends org.apache.hadoop.record.RecordComparator {
    public Comparator() {
      super(ExSenseForLabel.class);
    }
    static public int slurpRaw(byte[] b, int s, int l) {
      try {
        int os = s;
        {
          long i = org.apache.hadoop.record.Utils.readVLong(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          long i = org.apache.hadoop.record.Utils.readVLong(b, s);
          int z = org.apache.hadoop.record.Utils.getVIntSize(i);
          s+=z; l-=z;
        }
        {
          if (l<1) {
            throw new java.io.IOException("Boolean is exactly 1 byte. Provided buffer is smaller.");
          }
          s++; l--;
        }
        {
          if (l<1) {
            throw new java.io.IOException("Boolean is exactly 1 byte. Provided buffer is smaller.");
          }
          s++; l--;
        }
        return (os - s);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    static public int compareRaw(byte[] b1, int s1, int l1,
                                   byte[] b2, int s2, int l2) {
      try {
        int os1 = s1;
        {
          long i1 = org.apache.hadoop.record.Utils.readVLong(b1, s1);
          long i2 = org.apache.hadoop.record.Utils.readVLong(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          long i1 = org.apache.hadoop.record.Utils.readVLong(b1, s1);
          long i2 = org.apache.hadoop.record.Utils.readVLong(b2, s2);
          if (i1 != i2) {
            return ((i1-i2) < 0) ? -1 : 0;
          }
          int z1 = org.apache.hadoop.record.Utils.getVIntSize(i1);
          int z2 = org.apache.hadoop.record.Utils.getVIntSize(i2);
          s1+=z1; s2+=z2; l1-=z1; l2-=z2;
        }
        {
          if (l1<1 || l2<1) {
            throw new java.io.IOException("Boolean is exactly 1 byte. Provided buffer is smaller.");
          }
          if (b1[s1] != b2[s2]) {
            return (b1[s1]<b2[s2])? -1 : 0;
          }
          s1++; s2++; l1--; l2--;
        }
        {
          if (l1<1 || l2<1) {
            throw new java.io.IOException("Boolean is exactly 1 byte. Provided buffer is smaller.");
          }
          if (b1[s1] != b2[s2]) {
            return (b1[s1]<b2[s2])? -1 : 0;
          }
          s1++; s2++; l1--; l2--;
        }
        return (os1 - s1);
      } catch(java.io.IOException e) {
        throw new RuntimeException(e);
      }
    }
    public int compare(byte[] b1, int s1, int l1,
                         byte[] b2, int s2, int l2) {
      int ret = compareRaw(b1,s1,l1,b2,s2,l2);
      return (ret == -1)? -1 : ((ret==0)? 1 : 0);}
  }
  
  static {
    org.apache.hadoop.record.RecordComparator.define(ExSenseForLabel.class, new Comparator());
  }
}
