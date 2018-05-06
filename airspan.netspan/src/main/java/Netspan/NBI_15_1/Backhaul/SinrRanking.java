
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinrRanking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SinrRanking">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SINR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SinrRanking")
@XmlEnum
public enum SinrRanking {

    SE,
    SINR;

    public String value() {
        return name();
    }

    public static SinrRanking fromValue(String v) {
        return valueOf(v);
    }

}
