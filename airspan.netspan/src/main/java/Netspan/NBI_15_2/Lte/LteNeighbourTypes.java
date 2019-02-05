
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNeighbourTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LteNeighbourTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LteCell"/&gt;
 *     &lt;enumeration value="BsAir4gLte"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LteNeighbourTypes")
@XmlEnum
public enum LteNeighbourTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LteCell")
    LTE_CELL("LteCell"),
    @XmlEnumValue("BsAir4gLte")
    BS_AIR_4_G_LTE("BsAir4gLte");
    private final String value;

    LteNeighbourTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LteNeighbourTypes fromValue(String v) {
        for (LteNeighbourTypes c: LteNeighbourTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
