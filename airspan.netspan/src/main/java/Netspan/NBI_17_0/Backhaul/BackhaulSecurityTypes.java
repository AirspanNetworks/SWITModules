
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulSecurityTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulSecurityTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoIpSec"/&gt;
 *     &lt;enumeration value="IpSec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackhaulSecurityTypes")
@XmlEnum
public enum BackhaulSecurityTypes {

    @XmlEnumValue("NoIpSec")
    NO_IP_SEC("NoIpSec"),
    @XmlEnumValue("IpSec")
    IP_SEC("IpSec");
    private final String value;

    BackhaulSecurityTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulSecurityTypes fromValue(String v) {
        for (BackhaulSecurityTypes c: BackhaulSecurityTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
