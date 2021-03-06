
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Copper"/&gt;
 *     &lt;enumeration value="CopperPOE"/&gt;
 *     &lt;enumeration value="SFP"/&gt;
 *     &lt;enumeration value="Fiber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortTypes")
@XmlEnum
public enum PortTypes {

    @XmlEnumValue("Copper")
    COPPER("Copper"),
    @XmlEnumValue("CopperPOE")
    COPPER_POE("CopperPOE"),
    SFP("SFP"),
    @XmlEnumValue("Fiber")
    FIBER("Fiber");
    private final String value;

    PortTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortTypes fromValue(String v) {
        for (PortTypes c: PortTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
