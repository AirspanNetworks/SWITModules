
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PreventPnp"/&gt;
 *     &lt;enumeration value="TriggerAlarmOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PnpModeValues")
@XmlEnum
public enum PnpModeValues {

    @XmlEnumValue("PreventPnp")
    PREVENT_PNP("PreventPnp"),
    @XmlEnumValue("TriggerAlarmOnly")
    TRIGGER_ALARM_ONLY("TriggerAlarmOnly");
    private final String value;

    PnpModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpModeValues fromValue(String v) {
        for (PnpModeValues c: PnpModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
