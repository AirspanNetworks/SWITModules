
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="EnabledFirstTime"/>
 *     &lt;enumeration value="EnabledAlways"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PnpModes")
@XmlEnum
public enum PnpModes {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("EnabledFirstTime")
    ENABLED_FIRST_TIME("EnabledFirstTime"),
    @XmlEnumValue("EnabledAlways")
    ENABLED_ALWAYS("EnabledAlways");
    private final String value;

    PnpModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpModes fromValue(String v) {
        for (PnpModes c: PnpModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
