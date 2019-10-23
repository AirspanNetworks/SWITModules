
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrueFalseStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrueFalseStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="False"/&gt;
 *     &lt;enumeration value="True"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrueFalseStates")
@XmlEnum
public enum TrueFalseStates {

    @XmlEnumValue("False")
    FALSE("False"),
    @XmlEnumValue("True")
    TRUE("True");
    private final String value;

    TrueFalseStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrueFalseStates fromValue(String v) {
        for (TrueFalseStates c: TrueFalseStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
