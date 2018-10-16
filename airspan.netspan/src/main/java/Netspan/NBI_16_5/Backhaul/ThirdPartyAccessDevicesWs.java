
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAccessDevicesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyAccessDevicesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyAccessDevicesWs")
@XmlEnum
public enum ThirdPartyAccessDevicesWs {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    ThirdPartyAccessDevicesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThirdPartyAccessDevicesWs fromValue(String v) {
        for (ThirdPartyAccessDevicesWs c: ThirdPartyAccessDevicesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
