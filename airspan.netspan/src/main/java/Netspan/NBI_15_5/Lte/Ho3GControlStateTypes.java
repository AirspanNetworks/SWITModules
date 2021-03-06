
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ho3gControlStateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ho3gControlStateTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Prohibited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ho3gControlStateTypes")
@XmlEnum
public enum Ho3GControlStateTypes {

    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Prohibited")
    PROHIBITED("Prohibited");
    private final String value;

    Ho3GControlStateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ho3GControlStateTypes fromValue(String v) {
        for (Ho3GControlStateTypes c: Ho3GControlStateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
