
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SonAnrStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SonAnrStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="HoMeasurement"/>
 *     &lt;enumeration value="PeriodicalMeasurement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SonAnrStates")
@XmlEnum
public enum SonAnrStates {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("HoMeasurement")
    HO_MEASUREMENT("HoMeasurement"),
    @XmlEnumValue("PeriodicalMeasurement")
    PERIODICAL_MEASUREMENT("PeriodicalMeasurement");
    private final String value;

    SonAnrStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SonAnrStates fromValue(String v) {
        for (SonAnrStates c: SonAnrStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
