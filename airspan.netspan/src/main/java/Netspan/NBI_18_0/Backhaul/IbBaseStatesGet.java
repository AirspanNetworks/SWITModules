
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseStatesGet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IbBaseStatesGet"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="InService"/&gt;
 *     &lt;enumeration value="OutOfService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IbBaseStatesGet")
@XmlEnum
public enum IbBaseStatesGet {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService");
    private final String value;

    IbBaseStatesGet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IbBaseStatesGet fromValue(String v) {
        for (IbBaseStatesGet c: IbBaseStatesGet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
