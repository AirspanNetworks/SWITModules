
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetspanAlarmStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetspanAlarmStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Raised"/>
 *     &lt;enumeration value="Cleared"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetspanAlarmStatus")
@XmlEnum
public enum NetspanAlarmStatus {

    @XmlEnumValue("Raised")
    RAISED("Raised"),
    @XmlEnumValue("Cleared")
    CLEARED("Cleared");
    private final String value;

    NetspanAlarmStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetspanAlarmStatus fromValue(String v) {
        for (NetspanAlarmStatus c: NetspanAlarmStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
