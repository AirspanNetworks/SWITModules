
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandoverTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandoverTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S1Only"/&gt;
 *     &lt;enumeration value="TriggerX2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandoverTypes")
@XmlEnum
public enum HandoverTypes {

    @XmlEnumValue("S1Only")
    S_1_ONLY("S1Only"),
    @XmlEnumValue("TriggerX2")
    TRIGGER_X_2("TriggerX2");
    private final String value;

    HandoverTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandoverTypes fromValue(String v) {
        for (HandoverTypes c: HandoverTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
