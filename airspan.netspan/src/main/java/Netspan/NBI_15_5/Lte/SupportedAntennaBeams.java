
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedAntennaBeams.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedAntennaBeams">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Omni"/>
 *     &lt;enumeration value="Beam1"/>
 *     &lt;enumeration value="Beam2"/>
 *     &lt;enumeration value="Beam3"/>
 *     &lt;enumeration value="Beam4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupportedAntennaBeams")
@XmlEnum
public enum SupportedAntennaBeams {

    @XmlEnumValue("Omni")
    OMNI("Omni"),
    @XmlEnumValue("Beam1")
    BEAM_1("Beam1"),
    @XmlEnumValue("Beam2")
    BEAM_2("Beam2"),
    @XmlEnumValue("Beam3")
    BEAM_3("Beam3"),
    @XmlEnumValue("Beam4")
    BEAM_4("Beam4");
    private final String value;

    SupportedAntennaBeams(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportedAntennaBeams fromValue(String v) {
        for (SupportedAntennaBeams c: SupportedAntennaBeams.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
