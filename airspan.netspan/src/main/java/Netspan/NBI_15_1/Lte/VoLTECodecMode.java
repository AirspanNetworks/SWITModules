
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoLTECodecMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoLTECodecMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M0"/>
 *     &lt;enumeration value="M1"/>
 *     &lt;enumeration value="M2"/>
 *     &lt;enumeration value="M3"/>
 *     &lt;enumeration value="M4"/>
 *     &lt;enumeration value="M5"/>
 *     &lt;enumeration value="M6"/>
 *     &lt;enumeration value="M7"/>
 *     &lt;enumeration value="M8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoLTECodecMode")
@XmlEnum
public enum VoLTECodecMode {

    @XmlEnumValue("M0")
    M_0("M0"),
    @XmlEnumValue("M1")
    M_1("M1"),
    @XmlEnumValue("M2")
    M_2("M2"),
    @XmlEnumValue("M3")
    M_3("M3"),
    @XmlEnumValue("M4")
    M_4("M4"),
    @XmlEnumValue("M5")
    M_5("M5"),
    @XmlEnumValue("M6")
    M_6("M6"),
    @XmlEnumValue("M7")
    M_7("M7"),
    @XmlEnumValue("M8")
    M_8("M8");
    private final String value;

    VoLTECodecMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoLTECodecMode fromValue(String v) {
        for (VoLTECodecMode c: VoLTECodecMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
