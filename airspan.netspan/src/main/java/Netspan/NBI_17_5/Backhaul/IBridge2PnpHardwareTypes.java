
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2PnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2PnpHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IBridgeB5"/&gt;
 *     &lt;enumeration value="IBridgeB5c"/&gt;
 *     &lt;enumeration value="IBridgeC5c"/&gt;
 *     &lt;enumeration value="IBridgeC5x"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2PnpHardwareTypes")
@XmlEnum
public enum IBridge2PnpHardwareTypes {

    @XmlEnumValue("IBridgeB5")
    I_BRIDGE_B_5("IBridgeB5"),
    @XmlEnumValue("IBridgeB5c")
    I_BRIDGE_B_5_C("IBridgeB5c"),
    @XmlEnumValue("IBridgeC5c")
    I_BRIDGE_C_5_C("IBridgeC5c"),
    @XmlEnumValue("IBridgeC5x")
    I_BRIDGE_C_5_X("IBridgeC5x");
    private final String value;

    IBridge2PnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2PnpHardwareTypes fromValue(String v) {
        for (IBridge2PnpHardwareTypes c: IBridge2PnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
