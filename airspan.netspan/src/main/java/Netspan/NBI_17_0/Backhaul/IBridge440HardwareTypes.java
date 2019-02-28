
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge440HardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge440HardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="iBridge440"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge440HardwareTypes")
@XmlEnum
public enum IBridge440HardwareTypes {

    @XmlEnumValue("iBridge440")
    I_BRIDGE_440("iBridge440");
    private final String value;

    IBridge440HardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge440HardwareTypes fromValue(String v) {
        for (IBridge440HardwareTypes c: IBridge440HardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
