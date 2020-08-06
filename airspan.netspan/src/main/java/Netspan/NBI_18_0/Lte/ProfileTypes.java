
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="UserDefined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProfileTypes")
@XmlEnum
public enum ProfileTypes {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined");
    private final String value;

    ProfileTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileTypes fromValue(String v) {
        for (ProfileTypes c: ProfileTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
