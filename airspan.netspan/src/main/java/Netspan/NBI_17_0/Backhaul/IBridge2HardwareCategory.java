
package Netspan.NBI_17_0.Backhaul;

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
 *     &lt;enumeration value="iBridge A"/&gt;
 *     &lt;enumeration value="iBridge B"/&gt;
 *     &lt;enumeration value="iBridge C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2HardwareCategory")
@XmlEnum
public enum IBridge2HardwareCategory {

    @XmlEnumValue("iBridge A")
    I_BRIDGE_A("iBridge A"),
    @XmlEnumValue("iBridge B")
    I_BRIDGE_B("iBridge B"),
    @XmlEnumValue("iBridge C")
    I_BRIDGE_C("iBridge C");
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
