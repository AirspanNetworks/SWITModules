
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdminStatuses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdminStatuses"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Up"/&gt;
 *     &lt;enumeration value="Down"/&gt;
 *     &lt;enumeration value="Testing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdminStatuses")
@XmlEnum
public enum AdminStatuses {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Up")
    UP("Up"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Testing")
    TESTING("Testing");
    private final String value;

    AdminStatuses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdminStatuses fromValue(String v) {
        for (AdminStatuses c: AdminStatuses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
