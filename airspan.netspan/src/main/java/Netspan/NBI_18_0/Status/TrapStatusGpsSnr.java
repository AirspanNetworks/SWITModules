
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapStatusGpsSnr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapStatusGpsSnr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrapStatusGpsSnr")
@XmlEnum
public enum TrapStatusGpsSnr {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    TrapStatusGpsSnr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrapStatusGpsSnr fromValue(String v) {
        for (TrapStatusGpsSnr c: TrapStatusGpsSnr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
