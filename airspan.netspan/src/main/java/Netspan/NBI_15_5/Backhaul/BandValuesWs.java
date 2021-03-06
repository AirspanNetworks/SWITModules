
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandValuesWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="B3"/>
 *     &lt;enumeration value="B4"/>
 *     &lt;enumeration value="B5"/>
 *     &lt;enumeration value="B6"/>
 *     &lt;enumeration value="B7"/>
 *     &lt;enumeration value="B8"/>
 *     &lt;enumeration value="B9"/>
 *     &lt;enumeration value="B12"/>
 *     &lt;enumeration value="B13"/>
 *     &lt;enumeration value="B17"/>
 *     &lt;enumeration value="B18"/>
 *     &lt;enumeration value="B19"/>
 *     &lt;enumeration value="B20"/>
 *     &lt;enumeration value="B21"/>
 *     &lt;enumeration value="B25"/>
 *     &lt;enumeration value="B26"/>
 *     &lt;enumeration value="B28"/>
 *     &lt;enumeration value="B29"/>
 *     &lt;enumeration value="B30"/>
 *     &lt;enumeration value="B38"/>
 *     &lt;enumeration value="B39"/>
 *     &lt;enumeration value="B40"/>
 *     &lt;enumeration value="B41H"/>
 *     &lt;enumeration value="B41L"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandValuesWs")
@XmlEnum
public enum BandValuesWs {

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
    @XmlEnumValue("B9")
    B_9("B9"),
    @XmlEnumValue("B12")
    B_12("B12"),
    @XmlEnumValue("B13")
    B_13("B13"),
    @XmlEnumValue("B17")
    B_17("B17"),
    @XmlEnumValue("B18")
    B_18("B18"),
    @XmlEnumValue("B19")
    B_19("B19"),
    @XmlEnumValue("B20")
    B_20("B20"),
    @XmlEnumValue("B21")
    B_21("B21"),
    @XmlEnumValue("B25")
    B_25("B25"),
    @XmlEnumValue("B26")
    B_26("B26"),
    @XmlEnumValue("B28")
    B_28("B28"),
    @XmlEnumValue("B29")
    B_29("B29"),
    @XmlEnumValue("B30")
    B_30("B30"),
    @XmlEnumValue("B38")
    B_38("B38"),
    @XmlEnumValue("B39")
    B_39("B39"),
    @XmlEnumValue("B40")
    B_40("B40"),
    @XmlEnumValue("B41H")
    B_41_H("B41H"),
    @XmlEnumValue("B41L")
    B_41_L("B41L");
    private final String value;

    BandValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandValuesWs fromValue(String v) {
        for (BandValuesWs c: BandValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
