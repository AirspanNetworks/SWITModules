
package Netspan.NBI_14_50.API.Backhaul;

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
 *     &lt;enumeration value="B41H"/>
 *     &lt;enumeration value="B41L"/>
 *     &lt;enumeration value="B25"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandValuesWs")
@XmlEnum
public enum BandValuesWs {

    @XmlEnumValue("B41H")
    B_41_H("B41H"),
    @XmlEnumValue("B41L")
    B_41_L("B41L"),
    @XmlEnumValue("B25")
    B_25("B25");
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
