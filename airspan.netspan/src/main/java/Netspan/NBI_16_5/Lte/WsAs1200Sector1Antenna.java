
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsAs1200Sector1Antenna.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WsAs1200Sector1Antenna"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Antenna2Degrees45"/&gt;
 *     &lt;enumeration value="Antenna1Degrees135"/&gt;
 *     &lt;enumeration value="Omni"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WsAs1200Sector1Antenna")
@XmlEnum
public enum WsAs1200Sector1Antenna {

    @XmlEnumValue("Antenna2Degrees45")
    ANTENNA_2_DEGREES_45("Antenna2Degrees45"),
    @XmlEnumValue("Antenna1Degrees135")
    ANTENNA_1_DEGREES_135("Antenna1Degrees135"),
    @XmlEnumValue("Omni")
    OMNI("Omni");
    private final String value;

    WsAs1200Sector1Antenna(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WsAs1200Sector1Antenna fromValue(String v) {
        for (WsAs1200Sector1Antenna c: WsAs1200Sector1Antenna.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
