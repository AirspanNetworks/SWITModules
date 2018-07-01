
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriesLte.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoriesLte">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air4G"/>
 *     &lt;enumeration value="AirSynergy"/>
 *     &lt;enumeration value="AirHarmony"/>
 *     &lt;enumeration value="AirVelocity"/>
 *     &lt;enumeration value="AirVelocityFemto"/>
 *     &lt;enumeration value="AirUnity"/>
 *     &lt;enumeration value="AirDensity"/>
 *     &lt;enumeration value="AirSpeed-Relay"/>
 *     &lt;enumeration value="AirSpeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoriesLte")
@XmlEnum
public enum CategoriesLte {

    @XmlEnumValue("Air4G")
    AIR_4_G("Air4G"),
    @XmlEnumValue("AirSynergy")
    AIR_SYNERGY("AirSynergy"),
    @XmlEnumValue("AirHarmony")
    AIR_HARMONY("AirHarmony"),
    @XmlEnumValue("AirVelocity")
    AIR_VELOCITY("AirVelocity"),
    @XmlEnumValue("AirVelocityFemto")
    AIR_VELOCITY_FEMTO("AirVelocityFemto"),
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity"),
    @XmlEnumValue("AirSpeed-Relay")
    AIR_SPEED_RELAY("AirSpeed-Relay"),
    @XmlEnumValue("AirSpeed")
    AIR_SPEED("AirSpeed");
    private final String value;

    CategoriesLte(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoriesLte fromValue(String v) {
        for (CategoriesLte c: CategoriesLte.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
