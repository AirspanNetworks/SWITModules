
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulWiFiApSecurityTypeWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulWiFiApSecurityTypeWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="WPA"/&gt;
 *     &lt;enumeration value="WPA2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackhaulWiFiApSecurityTypeWs")
@XmlEnum
public enum BackhaulWiFiApSecurityTypeWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("None")
    NONE("None"),
    WPA("WPA"),
    @XmlEnumValue("WPA2")
    WPA_2("WPA2");
    private final String value;

    BackhaulWiFiApSecurityTypeWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulWiFiApSecurityTypeWs fromValue(String v) {
        for (BackhaulWiFiApSecurityTypeWs c: BackhaulWiFiApSecurityTypeWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
