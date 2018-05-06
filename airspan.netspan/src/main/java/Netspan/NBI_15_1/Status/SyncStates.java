
package Netspan.NBI_15_1.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initialization"/>
 *     &lt;enumeration value="Synchronized"/>
 *     &lt;enumeration value="HoldOver"/>
 *     &lt;enumeration value="HoldOverExpired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SyncStates")
@XmlEnum
public enum SyncStates {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("Synchronized")
    SYNCHRONIZED("Synchronized"),
    @XmlEnumValue("HoldOver")
    HOLD_OVER("HoldOver"),
    @XmlEnumValue("HoldOverExpired")
    HOLD_OVER_EXPIRED("HoldOverExpired");
    private final String value;

    SyncStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncStates fromValue(String v) {
        for (SyncStates c: SyncStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
