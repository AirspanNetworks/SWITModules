
package Netspan.NBI_15_1.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="B3"/>
 *     &lt;enumeration value="B4"/>
 *     &lt;enumeration value="B5"/>
 *     &lt;enumeration value="B6"/>
 *     &lt;enumeration value="B7"/>
 *     &lt;enumeration value="B8"/>
 *     &lt;enumeration value="B12"/>
 *     &lt;enumeration value="B13"/>
 *     &lt;enumeration value="B20"/>
 *     &lt;enumeration value="B25"/>
 *     &lt;enumeration value="B26"/>
 *     &lt;enumeration value="B29"/>
 *     &lt;enumeration value="B30"/>
 *     &lt;enumeration value="B41H"/>
 *     &lt;enumeration value="B41L"/>
 *     &lt;enumeration value="BALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandValues")
@XmlEnum
public enum BandValues {

    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2"),
    @XmlEnumValue("B3")
    B_3("B3"),
    @XmlEnumValue("B4")
    B_4("B4"),
    @XmlEnumValue("B5")
    B_5("B5"),
    @XmlEnumValue("B6")
    B_6("B6"),
    @XmlEnumValue("B7")
    B_7("B7"),
    @XmlEnumValue("B8")
    B_8("B8"),
    @XmlEnumValue("B12")
    B_12("B12"),
    @XmlEnumValue("B13")
    B_13("B13"),
    @XmlEnumValue("B20")
    B_20("B20"),
    @XmlEnumValue("B25")
    B_25("B25"),
    @XmlEnumValue("B26")
    B_26("B26"),
    @XmlEnumValue("B29")
    B_29("B29"),
    @XmlEnumValue("B30")
    B_30("B30"),
    @XmlEnumValue("B41H")
    B_41_H("B41H"),
    @XmlEnumValue("B41L")
    B_41_L("B41L"),
    BALL("BALL");
    private final String value;

    BandValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandValues fromValue(String v) {
        for (BandValues c: BandValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
