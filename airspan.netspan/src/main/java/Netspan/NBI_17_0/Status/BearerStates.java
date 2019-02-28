
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BearerStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BearerStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="NoAnswer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BearerStates")
@XmlEnum
public enum BearerStates {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("NoAnswer")
    NO_ANSWER("NoAnswer");
    private final String value;

    BearerStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BearerStates fromValue(String v) {
        for (BearerStates c: BearerStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
