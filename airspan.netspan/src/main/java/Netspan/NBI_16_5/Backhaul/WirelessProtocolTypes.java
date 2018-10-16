
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WirelessProtocolTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessProtocolTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="CSMA"/&gt;
 *     &lt;enumeration value="TDMA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WirelessProtocolTypes")
@XmlEnum
public enum WirelessProtocolTypes {

    @XmlEnumValue("Any")
    ANY("Any"),
    CSMA("CSMA"),
    TDMA("TDMA");
    private final String value;

    WirelessProtocolTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessProtocolTypes fromValue(String v) {
        for (WirelessProtocolTypes c: WirelessProtocolTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
