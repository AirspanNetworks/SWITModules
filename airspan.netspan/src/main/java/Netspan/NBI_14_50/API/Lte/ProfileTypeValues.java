
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="defaultProfile"/>
 *     &lt;enumeration value="ituTG82651"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProfileTypeValues")
@XmlEnum
public enum ProfileTypeValues {

    @XmlEnumValue("defaultProfile")
    DEFAULT_PROFILE("defaultProfile"),
    @XmlEnumValue("ituTG82651")
    ITU_TG_82651("ituTG82651");
    private final String value;

    ProfileTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileTypeValues fromValue(String v) {
        for (ProfileTypeValues c: ProfileTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
