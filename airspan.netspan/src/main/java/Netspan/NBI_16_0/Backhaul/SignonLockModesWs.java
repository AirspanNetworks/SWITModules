
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonLockModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignonLockModesWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LockModePermanent"/>
 *     &lt;enumeration value="LockModeTimerBased"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignonLockModesWs")
@XmlEnum
public enum SignonLockModesWs {

    @XmlEnumValue("LockModePermanent")
    LOCK_MODE_PERMANENT("LockModePermanent"),
    @XmlEnumValue("LockModeTimerBased")
    LOCK_MODE_TIMER_BASED("LockModeTimerBased");
    private final String value;

    SignonLockModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignonLockModesWs fromValue(String v) {
        for (SignonLockModesWs c: SignonLockModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
