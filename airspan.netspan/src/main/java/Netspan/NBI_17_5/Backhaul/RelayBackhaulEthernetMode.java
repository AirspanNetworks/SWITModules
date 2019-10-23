
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayBackhaulEthernetMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayBackhaulEthernetMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="LAN"/&gt;
 *     &lt;enumeration value="WAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayBackhaulEthernetMode")
@XmlEnum
public enum RelayBackhaulEthernetMode {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    LAN("LAN"),
    WAN("WAN");
    private final String value;

    RelayBackhaulEthernetMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayBackhaulEthernetMode fromValue(String v) {
        for (RelayBackhaulEthernetMode c: RelayBackhaulEthernetMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
