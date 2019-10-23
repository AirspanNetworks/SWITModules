
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsCarrierAggModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WsCarrierAggModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Non-Contiguous"/&gt;
 *     &lt;enumeration value="Contiguous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WsCarrierAggModes")
@XmlEnum
public enum WsCarrierAggModes {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Non-Contiguous")
    NON_CONTIGUOUS("Non-Contiguous"),
    @XmlEnumValue("Contiguous")
    CONTIGUOUS("Contiguous");
    private final String value;

    WsCarrierAggModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WsCarrierAggModes fromValue(String v) {
        for (WsCarrierAggModes c: WsCarrierAggModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
