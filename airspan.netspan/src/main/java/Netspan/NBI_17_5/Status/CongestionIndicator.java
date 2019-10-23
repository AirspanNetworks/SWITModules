
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CongestionIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CpuLoad"/&gt;
 *     &lt;enumeration value="S1TunnelLoad"/&gt;
 *     &lt;enumeration value="GbrPrbLoad"/&gt;
 *     &lt;enumeration value="NonGbrPrbLoad"/&gt;
 *     &lt;enumeration value="TotalPrbLoad"/&gt;
 *     &lt;enumeration value="CompositeLoad"/&gt;
 *     &lt;enumeration value="VolteLoad"/&gt;
 *     &lt;enumeration value="RrcFailureRate"/&gt;
 *     &lt;enumeration value="ConnectedUesLoad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CongestionIndicator")
@XmlEnum
public enum CongestionIndicator {

    @XmlEnumValue("CpuLoad")
    CPU_LOAD("CpuLoad"),
    @XmlEnumValue("S1TunnelLoad")
    S_1_TUNNEL_LOAD("S1TunnelLoad"),
    @XmlEnumValue("GbrPrbLoad")
    GBR_PRB_LOAD("GbrPrbLoad"),
    @XmlEnumValue("NonGbrPrbLoad")
    NON_GBR_PRB_LOAD("NonGbrPrbLoad"),
    @XmlEnumValue("TotalPrbLoad")
    TOTAL_PRB_LOAD("TotalPrbLoad"),
    @XmlEnumValue("CompositeLoad")
    COMPOSITE_LOAD("CompositeLoad"),
    @XmlEnumValue("VolteLoad")
    VOLTE_LOAD("VolteLoad"),
    @XmlEnumValue("RrcFailureRate")
    RRC_FAILURE_RATE("RrcFailureRate"),
    @XmlEnumValue("ConnectedUesLoad")
    CONNECTED_UES_LOAD("ConnectedUesLoad");
    private final String value;

    CongestionIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionIndicator fromValue(String v) {
        for (CongestionIndicator c: CongestionIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
