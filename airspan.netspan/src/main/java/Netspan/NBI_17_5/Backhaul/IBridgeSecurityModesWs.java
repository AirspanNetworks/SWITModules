
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeSecurityModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeSecurityModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="AuthenticationOnly"/&gt;
 *     &lt;enumeration value="AuthenticationAndEncryption"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeSecurityModesWs")
@XmlEnum
public enum IBridgeSecurityModesWs {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("AuthenticationOnly")
    AUTHENTICATION_ONLY("AuthenticationOnly"),
    @XmlEnumValue("AuthenticationAndEncryption")
    AUTHENTICATION_AND_ENCRYPTION("AuthenticationAndEncryption");
    private final String value;

    IBridgeSecurityModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeSecurityModesWs fromValue(String v) {
        for (IBridgeSecurityModesWs c: IBridgeSecurityModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
