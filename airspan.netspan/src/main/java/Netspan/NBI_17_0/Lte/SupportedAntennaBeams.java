
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedAntennaBeams.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedAntennaBeams"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Omni"/&gt;
 *     &lt;enumeration value="Beam1"/&gt;
 *     &lt;enumeration value="Beam2"/&gt;
 *     &lt;enumeration value="Beam3"/&gt;
 *     &lt;enumeration value="Beam4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
