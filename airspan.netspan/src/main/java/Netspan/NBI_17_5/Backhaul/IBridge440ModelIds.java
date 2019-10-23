
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge440ModelIds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge440ModelIds"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IBridge440Lite"/&gt;
 *     &lt;enumeration value="IBridge440_283"/&gt;
 *     &lt;enumeration value="IBridge440_281"/&gt;
 *     &lt;enumeration value="IBridge440_223"/&gt;
 *     &lt;enumeration value="IBridge440_221"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge440ModelIds")
@XmlEnum
public enum IBridge440ModelIds {

    @XmlEnumValue("IBridge440Lite")
    I_BRIDGE_440_LITE("IBridge440Lite"),
    @XmlEnumValue("IBridge440_283")
    I_BRIDGE_440_283("IBridge440_283"),
    @XmlEnumValue("IBridge440_281")
    I_BRIDGE_440_281("IBridge440_281"),
    @XmlEnumValue("IBridge440_223")
    I_BRIDGE_440_223("IBridge440_223"),
    @XmlEnumValue("IBridge440_221")
    I_BRIDGE_440_221("IBridge440_221");
    private final String value;

    IBridge440ModelIds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge440ModelIds fromValue(String v) {
        for (IBridge440ModelIds c: IBridge440ModelIds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
