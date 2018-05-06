
package Netspan.NBI_16_0.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmHistoryChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmHistoryChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Raised"/>
 *     &lt;enumeration value="Cleared"/>
 *     &lt;enumeration value="Acknowledged"/>
 *     &lt;enumeration value="Released"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Updated"/>
 *     &lt;enumeration value="UserClear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
