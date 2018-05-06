
package Netspan.NBI_15_1.Server;

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
 *     &lt;enumeration value="Version 2C"/>
 *     &lt;enumeration value="Version 3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgentVersion")
@XmlEnum
public enum AgentVersion {

    @XmlEnumValue("Version 2C")
    VERSION_2_C("Version 2C"),
    @XmlEnumValue("Version 3")
    VERSION_3("Version 3");
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
