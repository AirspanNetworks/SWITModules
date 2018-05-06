
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSources.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSources">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GNSS"/>
 *     &lt;enumeration value="IEEE1588"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClockSources")
@XmlEnum
public enum ClockSources {

    @XmlEnumValue("None")
    NONE("None"),
    GNSS("GNSS"),
    @XmlEnumValue("IEEE1588")
    IEEE_1588("IEEE1588");
    private final String value;

    ClockSources(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSources fromValue(String v) {
        for (ClockSources c: ClockSources.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
