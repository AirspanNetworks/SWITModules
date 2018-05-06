
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapStatusGpsLock.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapStatusGpsLock">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Degraded"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Lost"/>
 *     &lt;enumeration value="Init"/>
 *     &lt;enumeration value="Holdover"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrapStatusGpsLock")
@XmlEnum
public enum TrapStatusGpsLock {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Degraded")
    DEGRADED("Degraded"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Init")
    INIT("Init"),
    @XmlEnumValue("Holdover")
    HOLDOVER("Holdover");
    private final String value;

    TrapStatusGpsLock(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrapStatusGpsLock fromValue(String v) {
        for (TrapStatusGpsLock c: TrapStatusGpsLock.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
