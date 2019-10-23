
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AlarmNotFound"/&gt;
 *     &lt;enumeration value="AlarmError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlarmResultValues")
@XmlEnum
public enum AlarmResultValues {

    OK("OK"),
    @XmlEnumValue("AlarmNotFound")
    ALARM_NOT_FOUND("AlarmNotFound"),
    @XmlEnumValue("AlarmError")
    ALARM_ERROR("AlarmError");
    private final String value;

    AlarmResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmResultValues fromValue(String v) {
        for (AlarmResultValues c: AlarmResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
