
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrencePatterns.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrencePatterns">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Yearly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurrencePatterns")
@XmlEnum
public enum RecurrencePatterns {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    RecurrencePatterns(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrencePatterns fromValue(String v) {
        for (RecurrencePatterns c: RecurrencePatterns.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
