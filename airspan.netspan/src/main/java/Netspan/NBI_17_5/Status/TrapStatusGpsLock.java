
package Netspan.NBI_17_5.Status;

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
 *     &lt;enumeration value="N/A"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *     &lt;enumeration value="Degraded"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="N/A"/&gt;
 *     &lt;enumeration value="Lost"/&gt;
 *     &lt;enumeration value="Initialising"/&gt;
 *     &lt;enumeration value="Holdover"/&gt;
 *     &lt;enumeration value="NotLocked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrapStatusGpsLock")
@XmlEnum
public enum TrapStatusGpsLock {

    @XmlEnumValue("N/A")
    N_A("N/A"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Degraded")
    DEGRADED("Degraded"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Lost")
    LOST("Lost"),
    @XmlEnumValue("Initialising")
    INITIALISING("Initialising"),
    @XmlEnumValue("Holdover")
    HOLDOVER("Holdover"),
    @XmlEnumValue("NotLocked")
    NOT_LOCKED("NotLocked");
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
