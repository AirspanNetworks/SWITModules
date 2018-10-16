
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicRescanOptionsMonthly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodicRescanOptionsMonthly"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DateOfEveryXMonths"/&gt;
 *     &lt;enumeration value="DayWeekOfEveryYMonths"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodicRescanOptionsMonthly")
@XmlEnum
public enum PeriodicRescanOptionsMonthly {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DateOfEveryXMonths")
    DATE_OF_EVERY_X_MONTHS("DateOfEveryXMonths"),
    @XmlEnumValue("DayWeekOfEveryYMonths")
    DAY_WEEK_OF_EVERY_Y_MONTHS("DayWeekOfEveryYMonths");
    private final String value;

    PeriodicRescanOptionsMonthly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodicRescanOptionsMonthly fromValue(String v) {
        for (PeriodicRescanOptionsMonthly c: PeriodicRescanOptionsMonthly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
