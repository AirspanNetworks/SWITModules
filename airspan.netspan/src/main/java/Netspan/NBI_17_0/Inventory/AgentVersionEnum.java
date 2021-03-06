
package Netspan.NBI_17_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentVersionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentVersionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Version1"/&gt;
 *     &lt;enumeration value="Version2C"/&gt;
 *     &lt;enumeration value="Version3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentVersionEnum")
@XmlEnum
public enum AgentVersionEnum {

    @XmlEnumValue("Version1")
    VERSION_1("Version1"),
    @XmlEnumValue("Version2C")
    VERSION_2_C("Version2C"),
    @XmlEnumValue("Version3")
    VERSION_3("Version3");
    private final String value;

    AgentVersionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentVersionEnum fromValue(String v) {
        for (AgentVersionEnum c: AgentVersionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
