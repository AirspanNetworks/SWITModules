
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulSecurityTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulSecurityTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoIpSec"/>
 *     &lt;enumeration value="IpSec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
