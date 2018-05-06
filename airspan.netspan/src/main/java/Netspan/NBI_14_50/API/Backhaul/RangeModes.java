
package Netspan.NBI_14_50.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RangeModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Very Long"/>
 *     &lt;enumeration value="Extreme"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
