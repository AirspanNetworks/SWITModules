
package Netspan.NBI_15_5.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v2C"/>
 *     &lt;enumeration value="v3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgentVersion")
@XmlEnum
public enum AgentVersion {

    @XmlEnumValue("v2C")
    V_2_C("v2C"),
    @XmlEnumValue("v3")
    V_3("v3");
    private final String value;

    AgentVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentVersion fromValue(String v) {
        for (AgentVersion c: AgentVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
