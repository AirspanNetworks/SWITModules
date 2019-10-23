
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulWiFiIpModeWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulWiFiIpModeWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Static"/&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackhaulWiFiIpModeWs")
@XmlEnum
public enum BackhaulWiFiIpModeWs {

    @XmlEnumValue("Static")
    STATIC("Static"),
    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic");
    private final String value;

    BackhaulWiFiIpModeWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulWiFiIpModeWs fromValue(String v) {
        for (BackhaulWiFiIpModeWs c: BackhaulWiFiIpModeWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
