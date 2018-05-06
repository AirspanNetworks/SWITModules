
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoAlignOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoAlignOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutoAlignDisabled"/>
 *     &lt;enumeration value="AutoAlignOnRequest"/>
 *     &lt;enumeration value="AutoAlignWithFineAlignment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoAlignOptions")
@XmlEnum
public enum AutoAlignOptions {

    @XmlEnumValue("AutoAlignDisabled")
    AUTO_ALIGN_DISABLED("AutoAlignDisabled"),
    @XmlEnumValue("AutoAlignOnRequest")
    AUTO_ALIGN_ON_REQUEST("AutoAlignOnRequest"),
    @XmlEnumValue("AutoAlignWithFineAlignment")
    AUTO_ALIGN_WITH_FINE_ALIGNMENT("AutoAlignWithFineAlignment");
    private final String value;

    AutoAlignOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoAlignOptions fromValue(String v) {
        for (AutoAlignOptions c: AutoAlignOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
