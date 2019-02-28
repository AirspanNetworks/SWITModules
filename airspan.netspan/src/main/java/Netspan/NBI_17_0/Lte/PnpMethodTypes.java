
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpMethodTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpMethodTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DHCP"/&gt;
 *     &lt;enumeration value="DNS-SD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PnpMethodTypes")
@XmlEnum
public enum PnpMethodTypes {

    @XmlEnumValue("None")
    NONE("None"),
    DHCP("DHCP"),
    @XmlEnumValue("DNS-SD")
    DNS_SD("DNS-SD");
    private final String value;

    PnpMethodTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpMethodTypes fromValue(String v) {
        for (PnpMethodTypes c: PnpMethodTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
