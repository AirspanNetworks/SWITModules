
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WiFiAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccessPointReset"/>
 *     &lt;enumeration value="AccessPointResetToDefault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WiFiAction")
@XmlEnum
public enum WiFiAction {

    @XmlEnumValue("AccessPointReset")
    ACCESS_POINT_RESET("AccessPointReset"),
    @XmlEnumValue("AccessPointResetToDefault")
    ACCESS_POINT_RESET_TO_DEFAULT("AccessPointResetToDefault");
    private final String value;

    WiFiAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WiFiAction fromValue(String v) {
        for (WiFiAction c: WiFiAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
