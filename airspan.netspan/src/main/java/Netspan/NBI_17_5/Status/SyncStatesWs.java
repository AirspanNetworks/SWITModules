
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncStatesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncStatesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialization"/&gt;
 *     &lt;enumeration value="Synchronized"/&gt;
 *     &lt;enumeration value="HoldOver"/&gt;
 *     &lt;enumeration value="HoldOverExpired"/&gt;
 *     &lt;enumeration value="N/A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncStatesWs")
@XmlEnum
public enum SyncStatesWs {

    @XmlEnumValue("Initialization")
    INITIALIZATION("Initialization"),
    @XmlEnumValue("Synchronized")
    SYNCHRONIZED("Synchronized"),
    @XmlEnumValue("HoldOver")
    HOLD_OVER("HoldOver"),
    @XmlEnumValue("HoldOverExpired")
    HOLD_OVER_EXPIRED("HoldOverExpired"),
    @XmlEnumValue("N/A")
    N_A("N/A");
    private final String value;

    SyncStatesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncStatesWs fromValue(String v) {
        for (SyncStatesWs c: SyncStatesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
