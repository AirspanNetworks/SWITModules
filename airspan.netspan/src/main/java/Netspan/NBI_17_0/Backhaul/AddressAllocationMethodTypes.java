
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressAllocationMethodTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressAllocationMethodTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NAS"/&gt;
 *     &lt;enumeration value="DHCP Deferred"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressAllocationMethodTypes")
@XmlEnum
public enum AddressAllocationMethodTypes {

    NAS("NAS"),
    @XmlEnumValue("DHCP Deferred")
    DHCP_DEFERRED("DHCP Deferred");
    private final String value;

    AddressAllocationMethodTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressAllocationMethodTypes fromValue(String v) {
        for (AddressAllocationMethodTypes c: AddressAllocationMethodTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
