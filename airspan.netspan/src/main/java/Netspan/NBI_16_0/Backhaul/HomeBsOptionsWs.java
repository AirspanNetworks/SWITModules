
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomeBsOptionsWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HomeBsOptionsWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="UseLocalWebConfig"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HomeBsOptionsWs")
@XmlEnum
public enum HomeBsOptionsWs {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("UseLocalWebConfig")
    USE_LOCAL_WEB_CONFIG("UseLocalWebConfig");
    private final String value;

    HomeBsOptionsWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HomeBsOptionsWs fromValue(String v) {
        for (HomeBsOptionsWs c: HomeBsOptionsWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
