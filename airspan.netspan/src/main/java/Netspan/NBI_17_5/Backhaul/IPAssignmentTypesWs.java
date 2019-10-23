
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAssignmentTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPAssignmentTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DHCP"/&gt;
 *     &lt;enumeration value="Static"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IPAssignmentTypesWs")
@XmlEnum
public enum IPAssignmentTypesWs {

    DHCP("DHCP"),
    @XmlEnumValue("Static")
    STATIC("Static");
    private final String value;

    IPAssignmentTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPAssignmentTypesWs fromValue(String v) {
        for (IPAssignmentTypesWs c: IPAssignmentTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
