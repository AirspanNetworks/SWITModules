
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAuthenticationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserAuthenticationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NMSServer"/&gt;
 *     &lt;enumeration value="Domain"/&gt;
 *     &lt;enumeration value="LDAPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserAuthenticationTypes")
@XmlEnum
public enum UserAuthenticationTypes {

    @XmlEnumValue("NMSServer")
    NMS_SERVER("NMSServer"),
    @XmlEnumValue("Domain")
    DOMAIN("Domain"),
    LDAPS("LDAPS");
    private final String value;

    UserAuthenticationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserAuthenticationTypes fromValue(String v) {
        for (UserAuthenticationTypes c: UserAuthenticationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
