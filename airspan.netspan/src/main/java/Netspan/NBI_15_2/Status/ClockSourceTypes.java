
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSourceTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Gps"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="ReceivedChannel"/>
 *     &lt;enumeration value="Ptp"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="DonorENodeB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClockSourceTypes")
@XmlEnum
public enum ClockSourceTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Gps")
    GPS("Gps"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("ReceivedChannel")
    RECEIVED_CHANNEL("ReceivedChannel"),
    @XmlEnumValue("Ptp")
    PTP("Ptp"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("DonorENodeB")
    DONOR_E_NODE_B("DonorENodeB");
    private final String value;

    ClockSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSourceTypes fromValue(String v) {
        for (ClockSourceTypes c: ClockSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
