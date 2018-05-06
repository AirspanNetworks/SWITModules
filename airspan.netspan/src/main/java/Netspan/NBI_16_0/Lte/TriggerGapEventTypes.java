
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerGapEventTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerGapEventTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerGapEventTypes")
@XmlEnum
public enum TriggerGapEventTypes {

    @XmlEnumValue("A2")
    A_2("A2");
    private final String value;

    TriggerGapEventTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerGapEventTypes fromValue(String v) {
        for (TriggerGapEventTypes c: TriggerGapEventTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
