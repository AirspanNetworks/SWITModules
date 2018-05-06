
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirSynergy2000"/>
 *     &lt;enumeration value="AirSynergy3000"/>
 *     &lt;enumeration value="AirHarmony1000"/>
 *     &lt;enumeration value="AirVelocity1000PoE"/>
 *     &lt;enumeration value="AirVelocity1000WiFi"/>
 *     &lt;enumeration value="AirVelocity1000GPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PnpHardwareTypes")
@XmlEnum
public enum PnpHardwareTypes {

    @XmlEnumValue("AirSynergy2000")
    AIR_SYNERGY_2000("AirSynergy2000"),
    @XmlEnumValue("AirSynergy3000")
    AIR_SYNERGY_3000("AirSynergy3000"),
    @XmlEnumValue("AirHarmony1000")
    AIR_HARMONY_1000("AirHarmony1000"),
    @XmlEnumValue("AirVelocity1000PoE")
    AIR_VELOCITY_1000_PO_E("AirVelocity1000PoE"),
    @XmlEnumValue("AirVelocity1000WiFi")
    AIR_VELOCITY_1000_WI_FI("AirVelocity1000WiFi"),
    @XmlEnumValue("AirVelocity1000GPS")
    AIR_VELOCITY_1000_GPS("AirVelocity1000GPS");
    private final String value;

    PnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpHardwareTypes fromValue(String v) {
        for (PnpHardwareTypes c: PnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
