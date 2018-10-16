
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaModeValues")
@XmlEnum
public enum CaModeValues {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Auto")
    AUTO("Auto");
    private final String value;

    CaModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaModeValues fromValue(String v) {
        for (CaModeValues c: CaModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
