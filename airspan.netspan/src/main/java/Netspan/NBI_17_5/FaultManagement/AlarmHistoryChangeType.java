
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmHistoryChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmHistoryChangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Raised"/&gt;
 *     &lt;enumeration value="Cleared"/&gt;
 *     &lt;enumeration value="Acknowledged"/&gt;
 *     &lt;enumeration value="Released"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="UserClear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlarmHistoryChangeType")
@XmlEnum
public enum AlarmHistoryChangeType {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Raised")
    RAISED("Raised"),
    @XmlEnumValue("Cleared")
    CLEARED("Cleared"),
    @XmlEnumValue("Acknowledged")
    ACKNOWLEDGED("Acknowledged"),
    @XmlEnumValue("Released")
    RELEASED("Released"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("UserClear")
    USER_CLEAR("UserClear");
    private final String value;

    AlarmHistoryChangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmHistoryChangeType fromValue(String v) {
        for (AlarmHistoryChangeType c: AlarmHistoryChangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
