
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="VeryLong"/&gt;
 *     &lt;enumeration value="Extreme"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RangeModesWs")
@XmlEnum
public enum RangeModesWs {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("VeryLong")
    VERY_LONG("VeryLong"),
    @XmlEnumValue("Extreme")
    EXTREME("Extreme");
    private final String value;

    RangeModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeModesWs fromValue(String v) {
        for (RangeModesWs c: RangeModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
