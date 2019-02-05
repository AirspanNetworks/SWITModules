
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessDeviceTypeIdsWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessDeviceTypeIdsWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enb1"/&gt;
 *     &lt;enumeration value="Enb2"/&gt;
 *     &lt;enumeration value="Wifi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessDeviceTypeIdsWs")
@XmlEnum
public enum AccessDeviceTypeIdsWs {

    @XmlEnumValue("Enb1")
    ENB_1("Enb1"),
    @XmlEnumValue("Enb2")
    ENB_2("Enb2"),
    @XmlEnumValue("Wifi")
    WIFI("Wifi");
    private final String value;

    AccessDeviceTypeIdsWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessDeviceTypeIdsWs fromValue(String v) {
        for (AccessDeviceTypeIdsWs c: AccessDeviceTypeIdsWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
