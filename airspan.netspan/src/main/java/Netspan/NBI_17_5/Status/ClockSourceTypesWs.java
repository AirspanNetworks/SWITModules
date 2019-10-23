
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSourceTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSourceTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Relay(GPS)"/&gt;
 *     &lt;enumeration value="Internal"/&gt;
 *     &lt;enumeration value="ReceivedChannel"/&gt;
 *     &lt;enumeration value="IEEE1588(PTP)"/&gt;
 *     &lt;enumeration value="External"/&gt;
 *     &lt;enumeration value="DeNodeB(NDT)"/&gt;
 *     &lt;enumeration value="Relay(NDT)"/&gt;
 *     &lt;enumeration value="eNodeB(GPS)"/&gt;
 *     &lt;enumeration value="NL-Sync"/&gt;
 *     &lt;enumeration value="GPON"/&gt;
 *     &lt;enumeration value="Relay(eNodeB)"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockSourceTypesWs")
@XmlEnum
public enum ClockSourceTypesWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Relay(GPS)")
    RELAY_GPS("Relay(GPS)"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("ReceivedChannel")
    RECEIVED_CHANNEL("ReceivedChannel"),
    @XmlEnumValue("IEEE1588(PTP)")
    IEEE_1588_PTP("IEEE1588(PTP)"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("DeNodeB(NDT)")
    DE_NODE_B_NDT("DeNodeB(NDT)"),
    @XmlEnumValue("Relay(NDT)")
    RELAY_NDT("Relay(NDT)"),
    @XmlEnumValue("eNodeB(GPS)")
    E_NODE_B_GPS("eNodeB(GPS)"),
    @XmlEnumValue("NL-Sync")
    NL_SYNC("NL-Sync"),
    GPON("GPON"),
    @XmlEnumValue("Relay(eNodeB)")
    RELAY_E_NODE_B("Relay(eNodeB)");
    private final String value;

    ClockSourceTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSourceTypesWs fromValue(String v) {
        for (ClockSourceTypesWs c: ClockSourceTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
