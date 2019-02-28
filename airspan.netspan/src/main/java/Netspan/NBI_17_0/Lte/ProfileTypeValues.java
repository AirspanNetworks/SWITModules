
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="defaultProfile"/&gt;
 *     &lt;enumeration value="ituTG82651"/&gt;
 *     &lt;enumeration value="defaultProfileUnicast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProfileTypeValues")
@XmlEnum
public enum ProfileTypeValues {

    @XmlEnumValue("defaultProfile")
    DEFAULT_PROFILE("defaultProfile"),
    @XmlEnumValue("ituTG82651")
    ITU_TG_82651("ituTG82651"),
    @XmlEnumValue("defaultProfileUnicast")
    DEFAULT_PROFILE_UNICAST("defaultProfileUnicast");
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
