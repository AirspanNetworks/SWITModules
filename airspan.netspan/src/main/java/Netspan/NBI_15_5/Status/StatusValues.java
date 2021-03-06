
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Abnormal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusValues")
@XmlEnum
public enum StatusValues {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Abnormal")
    ABNORMAL("Abnormal");
    private final String value;

    StatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusValues fromValue(String v) {
        for (StatusValues c: StatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
