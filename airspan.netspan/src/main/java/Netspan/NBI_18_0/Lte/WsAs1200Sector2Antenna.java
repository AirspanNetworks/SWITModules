
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsAs1200Sector2Antenna.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WsAs1200Sector2Antenna"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Antenna4Degrees225"/&gt;
 *     &lt;enumeration value="Antenna3Degrees315"/&gt;
 *     &lt;enumeration value="Omni"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WsAs1200Sector2Antenna")
@XmlEnum
public enum WsAs1200Sector2Antenna {

    @XmlEnumValue("Antenna4Degrees225")
    ANTENNA_4_DEGREES_225("Antenna4Degrees225"),
    @XmlEnumValue("Antenna3Degrees315")
    ANTENNA_3_DEGREES_315("Antenna3Degrees315"),
    @XmlEnumValue("Omni")
    OMNI("Omni");
    private final String value;

    WsAs1200Sector2Antenna(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WsAs1200Sector2Antenna fromValue(String v) {
        for (WsAs1200Sector2Antenna c: WsAs1200Sector2Antenna.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
