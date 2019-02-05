
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceLinkDirections.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTraceLinkDirections"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Downlink"/&gt;
 *     &lt;enumeration value="Uplink"/&gt;
 *     &lt;enumeration value="BiDirectional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallTraceLinkDirections")
@XmlEnum
public enum CallTraceLinkDirections {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Downlink")
    DOWNLINK("Downlink"),
    @XmlEnumValue("Uplink")
    UPLINK("Uplink"),
    @XmlEnumValue("BiDirectional")
    BI_DIRECTIONAL("BiDirectional");
    private final String value;

    CallTraceLinkDirections(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTraceLinkDirections fromValue(String v) {
        for (CallTraceLinkDirections c: CallTraceLinkDirections.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
