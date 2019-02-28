
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib4x0PuscGroupsWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ib4x0PuscGroupsWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GroupA"/&gt;
 *     &lt;enumeration value="GroupB"/&gt;
 *     &lt;enumeration value="GroupC"/&gt;
 *     &lt;enumeration value="GroupAB"/&gt;
 *     &lt;enumeration value="GroupBC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Ib4x0PuscGroupsWs")
@XmlEnum
public enum Ib4X0PuscGroupsWs {

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

    Ib4X0PuscGroupsWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ib4X0PuscGroupsWs fromValue(String v) {
        for (Ib4X0PuscGroupsWs c: Ib4X0PuscGroupsWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
