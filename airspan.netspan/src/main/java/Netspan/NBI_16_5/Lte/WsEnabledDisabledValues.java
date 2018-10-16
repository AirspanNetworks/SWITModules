
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsEnabledDisabledValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WsEnabledDisabledValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WsEnabledDisabledValues")
@XmlEnum
public enum WsEnabledDisabledValues {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    WsEnabledDisabledValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WsEnabledDisabledValues fromValue(String v) {
        for (WsEnabledDisabledValues c: WsEnabledDisabledValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
