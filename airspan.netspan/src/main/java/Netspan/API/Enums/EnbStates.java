
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InService"/&gt;
 *     &lt;enumeration value="OutOfService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnbStates")
@XmlEnum
public enum EnbStates {

    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService");
    private final String value;

    EnbStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbStates fromValue(String v) {
        for (EnbStates c: EnbStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

