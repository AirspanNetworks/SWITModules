
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayBackhaulWifiMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayBackhaulWifiMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayBackhaulWifiMode")
@XmlEnum
public enum RelayBackhaulWifiMode {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    RelayBackhaulWifiMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayBackhaulWifiMode fromValue(String v) {
        for (RelayBackhaulWifiMode c: RelayBackhaulWifiMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
