
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActiveValues")
@XmlEnum
public enum ActiveValues {

    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Active")
    ACTIVE("Active");
    private final String value;

    ActiveValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActiveValues fromValue(String v) {
        for (ActiveValues c: ActiveValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
