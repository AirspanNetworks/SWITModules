
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapStatusGpsComms.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapStatusGpsComms"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Resetting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrapStatusGpsComms")
@XmlEnum
public enum TrapStatusGpsComms {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Resetting")
    RESETTING("Resetting");
    private final String value;

    TrapStatusGpsComms(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrapStatusGpsComms fromValue(String v) {
        for (TrapStatusGpsComms c: TrapStatusGpsComms.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
