
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourEnbTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NeighbourEnbTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Macro"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NeighbourEnbTypes")
@XmlEnum
public enum NeighbourEnbTypes {

    @XmlEnumValue("Macro")
    MACRO("Macro"),
    @XmlEnumValue("Home")
    HOME("Home");
    private final String value;

    NeighbourEnbTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NeighbourEnbTypes fromValue(String v) {
        for (NeighbourEnbTypes c: NeighbourEnbTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
