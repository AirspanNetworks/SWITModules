
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnabledDisabledValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnabledDisabledValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnabledDisabledValues")
@XmlEnum
public enum EnabledDisabledValues {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    EnabledDisabledValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnabledDisabledValues fromValue(String v) {
        for (EnabledDisabledValues c: EnabledDisabledValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
