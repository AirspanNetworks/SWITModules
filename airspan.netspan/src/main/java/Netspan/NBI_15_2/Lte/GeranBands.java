
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeranBands.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeranBands"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gsm850"/&gt;
 *     &lt;enumeration value="gsm900"/&gt;
 *     &lt;enumeration value="dcs1800"/&gt;
 *     &lt;enumeration value="pcs1900"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeranBands")
@XmlEnum
public enum GeranBands {

    @XmlEnumValue("gsm850")
    GSM_850("gsm850"),
    @XmlEnumValue("gsm900")
    GSM_900("gsm900"),
    @XmlEnumValue("dcs1800")
    DCS_1800("dcs1800"),
    @XmlEnumValue("pcs1900")
    PCS_1900("pcs1900");
    private final String value;

    GeranBands(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeranBands fromValue(String v) {
        for (GeranBands c: GeranBands.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
