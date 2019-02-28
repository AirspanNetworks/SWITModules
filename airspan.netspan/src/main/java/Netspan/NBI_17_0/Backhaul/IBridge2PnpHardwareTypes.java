
package Netspan.NBI_17_0.Backhaul;

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
 *     &lt;enumeration value="IBridgeMmA5"/&gt;
 *     &lt;enumeration value="IBridgeMmA5c"/&gt;
 *     &lt;enumeration value="IBridgeMmB5"/&gt;
 *     &lt;enumeration value="IBridgeMmB5c"/&gt;
 *     &lt;enumeration value="IBridgeMmB11"/&gt;
 *     &lt;enumeration value="IBridgeMmB24"/&gt;
 *     &lt;enumeration value="IBridgeMmC5c"/&gt;
 *     &lt;enumeration value="IBridgeMmC5x"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2PnpHardwareTypes")
@XmlEnum
public enum IBridge2PnpHardwareTypes {

    @XmlEnumValue("IBridgeMmA5")
    I_BRIDGE_MM_A_5("IBridgeMmA5"),
    @XmlEnumValue("IBridgeMmA5c")
    I_BRIDGE_MM_A_5_C("IBridgeMmA5c"),
    @XmlEnumValue("IBridgeMmB5")
    I_BRIDGE_MM_B_5("IBridgeMmB5"),
    @XmlEnumValue("IBridgeMmB5c")
    I_BRIDGE_MM_B_5_C("IBridgeMmB5c"),
    @XmlEnumValue("IBridgeMmB11")
    I_BRIDGE_MM_B_11("IBridgeMmB11"),
    @XmlEnumValue("IBridgeMmB24")
    I_BRIDGE_MM_B_24("IBridgeMmB24"),
    @XmlEnumValue("IBridgeMmC5c")
    I_BRIDGE_MM_C_5_C("IBridgeMmC5c"),
    @XmlEnumValue("IBridgeMmC5x")
    I_BRIDGE_MM_C_5_X("IBridgeMmC5x");
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
