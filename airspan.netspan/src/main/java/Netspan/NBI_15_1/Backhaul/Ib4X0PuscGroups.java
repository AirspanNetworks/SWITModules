
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib4x0PuscGroups.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ib4x0PuscGroups">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GroupA"/>
 *     &lt;enumeration value="GroupB"/>
 *     &lt;enumeration value="GroupC"/>
 *     &lt;enumeration value="GroupAB"/>
 *     &lt;enumeration value="GroupBC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ib4x0PuscGroups")
@XmlEnum
public enum Ib4X0PuscGroups {

    @XmlEnumValue("GroupA")
    GROUP_A("GroupA"),
    @XmlEnumValue("GroupB")
    GROUP_B("GroupB"),
    @XmlEnumValue("GroupC")
    GROUP_C("GroupC"),
    @XmlEnumValue("GroupAB")
    GROUP_AB("GroupAB"),
    @XmlEnumValue("GroupBC")
    GROUP_BC("GroupBC");
    private final String value;

    Ib4X0PuscGroups(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ib4X0PuscGroups fromValue(String v) {
        for (Ib4X0PuscGroups c: Ib4X0PuscGroups.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
