
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="AuthenticationOnly"/&gt;
 *     &lt;enumeration value="AuthenticationAndEncryption"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityModes")
@XmlEnum
public enum SecurityModes {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("AuthenticationOnly")
    AUTHENTICATION_ONLY("AuthenticationOnly"),
    @XmlEnumValue("AuthenticationAndEncryption")
    AUTHENTICATION_AND_ENCRYPTION("AuthenticationAndEncryption");
    private final String value;

    SecurityModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityModes fromValue(String v) {
        for (SecurityModes c: SecurityModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
