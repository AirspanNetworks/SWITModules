
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriesRelay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoriesRelay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IRelay"/>
 *     &lt;enumeration value="AirUnity"/>
 *     &lt;enumeration value="AirDensity"/>
 *     &lt;enumeration value="AirSpeedRelay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoriesRelay")
@XmlEnum
public enum CategoriesRelay {

    @XmlEnumValue("IRelay")
    I_RELAY("IRelay"),
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity"),
    @XmlEnumValue("AirSpeedRelay")
    AIR_SPEED_RELAY("AirSpeedRelay");
    private final String value;

    CategoriesRelay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoriesRelay fromValue(String v) {
        for (CategoriesRelay c: CategoriesRelay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
