
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceRecurrenceOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTraceRecurrenceOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Option1"/&gt;
 *     &lt;enumeration value="Option2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallTraceRecurrenceOptions")
@XmlEnum
public enum CallTraceRecurrenceOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Option1")
    OPTION_1("Option1"),
    @XmlEnumValue("Option2")
    OPTION_2("Option2");
    private final String value;

    CallTraceRecurrenceOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTraceRecurrenceOptions fromValue(String v) {
        for (CallTraceRecurrenceOptions c: CallTraceRecurrenceOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
