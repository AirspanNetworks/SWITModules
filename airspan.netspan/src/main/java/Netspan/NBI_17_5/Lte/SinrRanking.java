
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinrRanking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SinrRanking"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SINR"/&gt;
 *     &lt;enumeration value="NoAverageDRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SinrRanking")
@XmlEnum
public enum SinrRanking {

    SE("SE"),
    SINR("SINR"),
    @XmlEnumValue("NoAverageDRM")
    NO_AVERAGE_DRM("NoAverageDRM");
    private final String value;

    SinrRanking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SinrRanking fromValue(String v) {
        for (SinrRanking c: SinrRanking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
