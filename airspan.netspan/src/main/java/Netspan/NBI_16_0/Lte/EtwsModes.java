
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtwsModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EtwsModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EtwsModes")
@XmlEnum
public enum EtwsModes {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("User")
    USER("User");
    private final String value;

    EtwsModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EtwsModes fromValue(String v) {
        for (EtwsModes c: EtwsModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
