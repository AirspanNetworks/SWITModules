
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtraHoTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtraHoTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Allowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UtraHoTypes")
@XmlEnum
public enum UtraHoTypes {

    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed");
    private final String value;

    UtraHoTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UtraHoTypes fromValue(String v) {
        for (UtraHoTypes c: UtraHoTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
