
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbStatesGet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbStatesGet"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="InService"/&gt;
 *     &lt;enumeration value="OutOfService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnbStatesGet")
@XmlEnum
public enum EnbStatesGet {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService");
    private final String value;

    EnbStatesGet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbStatesGet fromValue(String v) {
        for (EnbStatesGet c: EnbStatesGet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
