
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayBands.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayBands"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Bband1"/&gt;
 *     &lt;enumeration value="Bband2"/&gt;
 *     &lt;enumeration value="Bband3"/&gt;
 *     &lt;enumeration value="Bband4"/&gt;
 *     &lt;enumeration value="Bband5"/&gt;
 *     &lt;enumeration value="Bband6"/&gt;
 *     &lt;enumeration value="Bband7"/&gt;
 *     &lt;enumeration value="Bband8"/&gt;
 *     &lt;enumeration value="Bband12"/&gt;
 *     &lt;enumeration value="Band13"/&gt;
 *     &lt;enumeration value="Band20"/&gt;
 *     &lt;enumeration value="Band25"/&gt;
 *     &lt;enumeration value="Band26"/&gt;
 *     &lt;enumeration value="Band29"/&gt;
 *     &lt;enumeration value="Band30"/&gt;
 *     &lt;enumeration value="Band41"/&gt;
 *     &lt;enumeration value="BandAll"/&gt;
 *     &lt;enumeration value="Band41H"/&gt;
 *     &lt;enumeration value="Band41L"/&gt;
 *     &lt;enumeration value="Band42"/&gt;
 *     &lt;enumeration value="Band43"/&gt;
 *     &lt;enumeration value="Band44"/&gt;
 *     &lt;enumeration value="Band45"/&gt;
 *     &lt;enumeration value="Band46"/&gt;
 *     &lt;enumeration value="Band47"/&gt;
 *     &lt;enumeration value="Band48"/&gt;
 *     &lt;enumeration value="Band65"/&gt;
 *     &lt;enumeration value="Band66"/&gt;
 *     &lt;enumeration value="Band67"/&gt;
 *     &lt;enumeration value="Band68"/&gt;
 *     &lt;enumeration value="Band69"/&gt;
 *     &lt;enumeration value="Band70"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayBands")
@XmlEnum
public enum RelayBands {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Bband1")
    BBAND_1("Bband1"),
    @XmlEnumValue("Bband2")
    BBAND_2("Bband2"),
    @XmlEnumValue("Bband3")
    BBAND_3("Bband3"),
    @XmlEnumValue("Bband4")
    BBAND_4("Bband4"),
    @XmlEnumValue("Bband5")
    BBAND_5("Bband5"),
    @XmlEnumValue("Bband6")
    BBAND_6("Bband6"),
    @XmlEnumValue("Bband7")
    BBAND_7("Bband7"),
    @XmlEnumValue("Bband8")
    BBAND_8("Bband8"),
    @XmlEnumValue("Bband12")
    BBAND_12("Bband12"),
    @XmlEnumValue("Band13")
    BAND_13("Band13"),
    @XmlEnumValue("Band20")
    BAND_20("Band20"),
    @XmlEnumValue("Band25")
    BAND_25("Band25"),
    @XmlEnumValue("Band26")
    BAND_26("Band26"),
    @XmlEnumValue("Band29")
    BAND_29("Band29"),
    @XmlEnumValue("Band30")
    BAND_30("Band30"),
    @XmlEnumValue("Band41")
    BAND_41("Band41"),
    @XmlEnumValue("BandAll")
    BAND_ALL("BandAll"),
    @XmlEnumValue("Band41H")
    BAND_41_H("Band41H"),
    @XmlEnumValue("Band41L")
    BAND_41_L("Band41L"),
    @XmlEnumValue("Band42")
    BAND_42("Band42"),
    @XmlEnumValue("Band43")
    BAND_43("Band43"),
    @XmlEnumValue("Band44")
    BAND_44("Band44"),
    @XmlEnumValue("Band45")
    BAND_45("Band45"),
    @XmlEnumValue("Band46")
    BAND_46("Band46"),
    @XmlEnumValue("Band47")
    BAND_47("Band47"),
    @XmlEnumValue("Band48")
    BAND_48("Band48"),
    @XmlEnumValue("Band65")
    BAND_65("Band65"),
    @XmlEnumValue("Band66")
    BAND_66("Band66"),
    @XmlEnumValue("Band67")
    BAND_67("Band67"),
    @XmlEnumValue("Band68")
    BAND_68("Band68"),
    @XmlEnumValue("Band69")
    BAND_69("Band69"),
    @XmlEnumValue("Band70")
    BAND_70("Band70");
    private final String value;

    RelayBands(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayBands fromValue(String v) {
        for (RelayBands c: RelayBands.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
