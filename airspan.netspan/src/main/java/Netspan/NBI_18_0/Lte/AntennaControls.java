
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AntennaControls.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AntennaControls"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="LSBA"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AntennaControls")
@XmlEnum
public enum AntennaControls {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    LSBA("LSBA"),
    RET("RET");
    private final String value;

    AntennaControls(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntennaControls fromValue(String v) {
        for (AntennaControls c: AntennaControls.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
