
package Netspan.NBI_15_2.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetspanAlarmStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetspanAlarmStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Raised"/&gt;
 *     &lt;enumeration value="Cleared"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
