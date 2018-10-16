
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementActivationModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagementActivationModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Profile"/&gt;
 *     &lt;enumeration value="OnTheFly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManagementActivationModesWs")
@XmlEnum
public enum ManagementActivationModesWs {

    @XmlEnumValue("Profile")
    PROFILE("Profile"),
    @XmlEnumValue("OnTheFly")
    ON_THE_FLY("OnTheFly");
    private final String value;

    ManagementActivationModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagementActivationModesWs fromValue(String v) {
        for (ManagementActivationModesWs c: ManagementActivationModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
