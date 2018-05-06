
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiffieHellmanGroups.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiffieHellmanGroups">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group2"/>
 *     &lt;enumeration value="Group14"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiffieHellmanGroups")
@XmlEnum
public enum DiffieHellmanGroups {

    @XmlEnumValue("Group2")
    GROUP_2("Group2"),
    @XmlEnumValue("Group14")
    GROUP_14("Group14");
    private final String value;

    DiffieHellmanGroups(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiffieHellmanGroups fromValue(String v) {
        for (DiffieHellmanGroups c: DiffieHellmanGroups.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
