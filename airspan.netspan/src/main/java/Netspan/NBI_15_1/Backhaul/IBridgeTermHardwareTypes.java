
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeTermHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirSynergy"/>
 *     &lt;enumeration value="IB400"/>
 *     &lt;enumeration value="IB460"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IBridgeTermHardwareTypes")
@XmlEnum
public enum IBridgeTermHardwareTypes {

    @XmlEnumValue("AirSynergy")
    AIR_SYNERGY("AirSynergy"),
    @XmlEnumValue("IB400")
    IB_400("IB400"),
    @XmlEnumValue("IB460")
    IB_460("IB460");
    private final String value;

    IBridgeTermHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeTermHardwareTypes fromValue(String v) {
        for (IBridgeTermHardwareTypes c: IBridgeTermHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
