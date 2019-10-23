
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WifiEnableDisableValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WifiEnableDisableValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Enable"/&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WifiEnableDisableValues")
@XmlEnum
public enum WifiEnableDisableValues {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Enable")
    ENABLE("Enable"),
    @XmlEnumValue("Disable")
    DISABLE("Disable");
    private final String value;

    WifiEnableDisableValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WifiEnableDisableValues fromValue(String v) {
        for (WifiEnableDisableValues c: WifiEnableDisableValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
