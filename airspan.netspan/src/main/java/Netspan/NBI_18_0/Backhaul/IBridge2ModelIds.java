
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2ModelIds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2ModelIds"&gt;
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
@XmlType(name = "IBridge2ModelIds")
@XmlEnum
public enum IBridge2ModelIds {

    @XmlEnumValue("IBridgeB5")
    I_BRIDGE_B_5("IBridgeB5"),
    @XmlEnumValue("IBridgeB5c")
    I_BRIDGE_B_5_C("IBridgeB5c"),
    @XmlEnumValue("IBridgeC5c")
    I_BRIDGE_C_5_C("IBridgeC5c"),
    @XmlEnumValue("IBridgeC5x")
    I_BRIDGE_C_5_X("IBridgeC5x");
    private final String value;

    IBridge2ModelIds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2ModelIds fromValue(String v) {
        for (IBridge2ModelIds c: IBridge2ModelIds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
