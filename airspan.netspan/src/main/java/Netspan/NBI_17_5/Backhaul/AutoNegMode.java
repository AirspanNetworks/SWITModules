
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoNegMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoNegMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="ManualSlave"/&gt;
 *     &lt;enumeration value="ManualMaster"/&gt;
 *     &lt;enumeration value="PrefMaster"/&gt;
 *     &lt;enumeration value="PrefSlave"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoNegMode")
@XmlEnum
public enum AutoNegMode {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("ManualSlave")
    MANUAL_SLAVE("ManualSlave"),
    @XmlEnumValue("ManualMaster")
    MANUAL_MASTER("ManualMaster"),
    @XmlEnumValue("PrefMaster")
    PREF_MASTER("PrefMaster"),
    @XmlEnumValue("PrefSlave")
    PREF_SLAVE("PrefSlave");
    private final String value;

    AutoNegMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoNegMode fromValue(String v) {
        for (AutoNegMode c: AutoNegMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
