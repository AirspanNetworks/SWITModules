
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulTypeWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulTypeWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Lte"/&gt;
 *     &lt;enumeration value="Wifi"/&gt;
 *     &lt;enumeration value="Ethernet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackhaulTypeWs")
@XmlEnum
public enum BackhaulTypeWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Lte")
    LTE("Lte"),
    @XmlEnumValue("Wifi")
    WIFI("Wifi"),
    @XmlEnumValue("Ethernet")
    ETHERNET("Ethernet");
    private final String value;

    BackhaulTypeWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulTypeWs fromValue(String v) {
        for (BackhaulTypeWs c: BackhaulTypeWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
