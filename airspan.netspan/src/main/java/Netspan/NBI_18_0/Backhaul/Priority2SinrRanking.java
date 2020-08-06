
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Priority2SinrRanking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Priority2SinrRanking"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="RSRP"/&gt;
 *     &lt;enumeration value="RSSI"/&gt;
 *     &lt;enumeration value="RSRQ"/&gt;
 *     &lt;enumeration value="SINR"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Priority2SinrRanking")
@XmlEnum
public enum Priority2SinrRanking {

    @XmlEnumValue("None")
    NONE("None"),
    RSRP("RSRP"),
    RSSI("RSSI"),
    RSRQ("RSRQ"),
    SINR("SINR"),
    SE("SE");
    private final String value;

    Priority2SinrRanking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Priority2SinrRanking fromValue(String v) {
        for (Priority2SinrRanking c: Priority2SinrRanking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
