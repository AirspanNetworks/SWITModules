
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapStatusGpsLock.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapStatusGpsLock"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *     &lt;enumeration value="Degraded"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *     &lt;enumeration value="Init"/&gt;
 *     &lt;enumeration value="Holdover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
