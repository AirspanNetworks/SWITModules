
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IbBaseStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="OutOfService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IbBaseStates")
@XmlEnum
public enum IbBaseStates {

    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService");
    private final String value;

    IbBaseStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IbBaseStates fromValue(String v) {
        for (IbBaseStates c: IbBaseStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
