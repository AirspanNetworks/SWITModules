
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicRescanOptionsDaily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodicRescanOptionsDaily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="DailyOptionEveryXDay"/>
 *     &lt;enumeration value="DailyOptionEveryWeekDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodicRescanOptionsDaily")
@XmlEnum
public enum PeriodicRescanOptionsDaily {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DailyOptionEveryXDay")
    DAILY_OPTION_EVERY_X_DAY("DailyOptionEveryXDay"),
    @XmlEnumValue("DailyOptionEveryWeekDay")
    DAILY_OPTION_EVERY_WEEK_DAY("DailyOptionEveryWeekDay");
    private final String value;

    PeriodicRescanOptionsDaily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodicRescanOptionsDaily fromValue(String v) {
        for (PeriodicRescanOptionsDaily c: PeriodicRescanOptionsDaily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
