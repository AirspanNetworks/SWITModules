
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bands.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Bands">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dcs1800"/>
 *     &lt;enumeration value="pcs1900"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Bands")
@XmlEnum
public enum Bands {

    @XmlEnumValue("dcs1800")
    DCS_1800("dcs1800"),
    @XmlEnumValue("pcs1900")
    PCS_1900("pcs1900");
    private final String value;

    Bands(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Bands fromValue(String v) {
        for (Bands c: Bands.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
