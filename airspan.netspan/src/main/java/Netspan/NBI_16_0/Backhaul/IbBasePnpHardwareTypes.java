
package Netspan.NBI_16_0.Backhaul;

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
 *     &lt;enumeration value="IBridge400"/>
 *     &lt;enumeration value="IBridge450"/>
 *     &lt;enumeration value="IBridge460"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IbBasePnpHardwareTypes")
@XmlEnum
public enum IbBasePnpHardwareTypes {

    @XmlEnumValue("IBridge400")
    I_BRIDGE_400("IBridge400"),
    @XmlEnumValue("IBridge450")
    I_BRIDGE_450("IBridge450"),
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
