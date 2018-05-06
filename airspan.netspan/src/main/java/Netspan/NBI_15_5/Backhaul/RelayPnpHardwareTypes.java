
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayPnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayPnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IRelay460"/>
 *     &lt;enumeration value="IRelay464"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelayPnpHardwareTypes")
@XmlEnum
public enum RelayPnpHardwareTypes {

    @XmlEnumValue("IRelay460")
    I_RELAY_460("IRelay460"),
    @XmlEnumValue("IRelay464")
    I_RELAY_464("IRelay464");
    private final String value;

    RelayPnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayPnpHardwareTypes fromValue(String v) {
        for (RelayPnpHardwareTypes c: RelayPnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
