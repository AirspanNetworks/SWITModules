
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Very Long"/&gt;
 *     &lt;enumeration value="Extreme"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RangeModes")
@XmlEnum
public enum RangeModes {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Very Long")
    VERY_LONG("Very Long"),
    @XmlEnumValue("Extreme")
    EXTREME("Extreme");
    private final String value;

    RangeModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeModes fromValue(String v) {
        for (RangeModes c: RangeModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
