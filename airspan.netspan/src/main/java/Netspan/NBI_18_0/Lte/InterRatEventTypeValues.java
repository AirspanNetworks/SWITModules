
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterRatEventTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterRatEventTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B1"/&gt;
 *     &lt;enumeration value="B2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterRatEventTypeValues")
@XmlEnum
public enum InterRatEventTypeValues {

    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2");
    private final String value;

    InterRatEventTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterRatEventTypeValues fromValue(String v) {
        for (InterRatEventTypeValues c: InterRatEventTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
