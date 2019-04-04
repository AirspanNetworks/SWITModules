
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaxWifiThroughputTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaxWifiThroughputTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unlimited"/&gt;
 *     &lt;enumeration value="Limited"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaxWifiThroughputTypes")
@XmlEnum
public enum MaxWifiThroughputTypes {

    @XmlEnumValue("Unlimited")
    UNLIMITED("Unlimited"),
    @XmlEnumValue("Limited")
    LIMITED("Limited");
    private final String value;

    MaxWifiThroughputTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaxWifiThroughputTypes fromValue(String v) {
        for (MaxWifiThroughputTypes c: MaxWifiThroughputTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
