
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrenceOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Option1"/>
 *     &lt;enumeration value="Option2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurrenceOptions")
@XmlEnum
public enum RecurrenceOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Option1")
    OPTION_1("Option1"),
    @XmlEnumValue("Option2")
    OPTION_2("Option2");
    private final String value;

    RecurrenceOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrenceOptions fromValue(String v) {
        for (RecurrenceOptions c: RecurrenceOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
