
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbTermPnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IbTermPnpHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IBridge400"/&gt;
 *     &lt;enumeration value="IBridge450"/&gt;
 *     &lt;enumeration value="IBridge460"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IbTermPnpHardwareTypes")
@XmlEnum
public enum IbTermPnpHardwareTypes {

    @XmlEnumValue("IBridge400")
    I_BRIDGE_400("IBridge400"),
    @XmlEnumValue("IBridge450")
    I_BRIDGE_450("IBridge450"),
    @XmlEnumValue("IBridge460")
    I_BRIDGE_460("IBridge460");
    private final String value;

    IbTermPnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IbTermPnpHardwareTypes fromValue(String v) {
        for (IbTermPnpHardwareTypes c: IbTermPnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
