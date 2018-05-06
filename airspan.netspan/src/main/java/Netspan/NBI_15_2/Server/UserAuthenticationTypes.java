
package Netspan.NBI_15_2.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAuthenticationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserAuthenticationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NMS Server"/>
 *     &lt;enumeration value="Domain"/>
 *     &lt;enumeration value="LDAPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserAuthenticationTypes")
@XmlEnum
public enum UserAuthenticationTypes {

    @XmlEnumValue("NMS Server")
    NMS_SERVER("NMS Server"),
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
