
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSourceStatusWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSourceStatusWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="N/A"/&gt;
 *     &lt;enumeration value="Stabilizing"/&gt;
 *     &lt;enumeration value="Standby"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockSourceStatusWs")
@XmlEnum
public enum ClockSourceStatusWs {

    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("N/A")
    N_A("N/A"),
    @XmlEnumValue("Stabilizing")
    STABILIZING("Stabilizing"),
    @XmlEnumValue("Standby")
    STANDBY("Standby"),
    @XmlEnumValue("Active")
    ACTIVE("Active");
    private final String value;

    ClockSourceStatusWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSourceStatusWs fromValue(String v) {
        for (ClockSourceStatusWs c: ClockSourceStatusWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
