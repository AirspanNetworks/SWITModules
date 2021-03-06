
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessDeviceTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessDeviceTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enb"/&gt;
 *     &lt;enumeration value="Wifi"/&gt;
 *     &lt;enumeration value="Blocked"/&gt;
 *     &lt;enumeration value="Lan"/&gt;
 *     &lt;enumeration value="Usb"/&gt;
 *     &lt;enumeration value="Avc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessDeviceTypesWs")
@XmlEnum
public enum AccessDeviceTypesWs {

    @XmlEnumValue("Enb")
    ENB("Enb"),
    @XmlEnumValue("Wifi")
    WIFI("Wifi"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Lan")
    LAN("Lan"),
    @XmlEnumValue("Usb")
    USB("Usb"),
    @XmlEnumValue("Avc")
    AVC("Avc");
    private final String value;

    AccessDeviceTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessDeviceTypesWs fromValue(String v) {
        for (AccessDeviceTypesWs c: AccessDeviceTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
