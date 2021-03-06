
package Netspan.NBI_14_50.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBasePnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IbBasePnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IBridge440"/>
 *     &lt;enumeration value="IBridge400"/>
 *     &lt;enumeration value="IBridge460"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IbBasePnpHardwareTypes")
@XmlEnum
public enum IbBasePnpHardwareTypes {

    @XmlEnumValue("IBridge440")
    I_BRIDGE_440("IBridge440"),
    @XmlEnumValue("IBridge400")
    I_BRIDGE_400("IBridge400"),
    @XmlEnumValue("IBridge460")
    I_BRIDGE_460("IBridge460");
    private final String value;

    IbBasePnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IbBasePnpHardwareTypes fromValue(String v) {
        for (IbBasePnpHardwareTypes c: IbBasePnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
