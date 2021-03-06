
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsgMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CsgMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CsgMode")
@XmlEnum
public enum CsgMode {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    CsgMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CsgMode fromValue(String v) {
        for (CsgMode c: CsgMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
