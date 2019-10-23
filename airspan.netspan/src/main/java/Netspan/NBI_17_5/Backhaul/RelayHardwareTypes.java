
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IRelay"/&gt;
 *     &lt;enumeration value="AirUnity"/&gt;
 *     &lt;enumeration value="AirDensity"/&gt;
 *     &lt;enumeration value="AirDensityFemto"/&gt;
 *     &lt;enumeration value="AirSpeed-Relay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayHardwareTypes")
@XmlEnum
public enum RelayHardwareTypes {

    @XmlEnumValue("IRelay")
    I_RELAY("IRelay"),
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity"),
    @XmlEnumValue("AirDensityFemto")
    AIR_DENSITY_FEMTO("AirDensityFemto"),
    @XmlEnumValue("AirSpeed-Relay")
    AIR_SPEED_RELAY("AirSpeed-Relay");
    private final String value;

    RelayHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayHardwareTypes fromValue(String v) {
        for (RelayHardwareTypes c: RelayHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
