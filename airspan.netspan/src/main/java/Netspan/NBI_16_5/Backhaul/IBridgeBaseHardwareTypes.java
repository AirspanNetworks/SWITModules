
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeBaseHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirSynergy"/&gt;
 *     &lt;enumeration value="IB400"/&gt;
 *     &lt;enumeration value="IB460"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeBaseHardwareTypes")
@XmlEnum
public enum IBridgeBaseHardwareTypes {

    @XmlEnumValue("AirSynergy")
    AIR_SYNERGY("AirSynergy"),
    @XmlEnumValue("IB400")
    IB_400("IB400"),
    @XmlEnumValue("IB460")
    IB_460("IB460");
    private final String value;

    IBridgeBaseHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeBaseHardwareTypes fromValue(String v) {
        for (IBridgeBaseHardwareTypes c: IBridgeBaseHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
