
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2HardwareCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2HardwareCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="iBridgeB"/&gt;
 *     &lt;enumeration value="iBridgeC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2HardwareCategory")
@XmlEnum
public enum IBridge2HardwareCategory {

    @XmlEnumValue("iBridgeB")
    I_BRIDGE_B("iBridgeB"),
    @XmlEnumValue("iBridgeC")
    I_BRIDGE_C("iBridgeC");
    private final String value;

    IBridge2HardwareCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2HardwareCategory fromValue(String v) {
        for (IBridge2HardwareCategory c: IBridge2HardwareCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
