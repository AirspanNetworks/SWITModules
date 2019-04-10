
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoAlignOptionsWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoAlignOptionsWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AutoAlignDisabled"/&gt;
 *     &lt;enumeration value="AutoAlignOnRequest"/&gt;
 *     &lt;enumeration value="AutoAlignWithFineAlignment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoAlignOptionsWs")
@XmlEnum
public enum AutoAlignOptionsWs {

    @XmlEnumValue("AutoAlignDisabled")
    AUTO_ALIGN_DISABLED("AutoAlignDisabled"),
    @XmlEnumValue("AutoAlignOnRequest")
    AUTO_ALIGN_ON_REQUEST("AutoAlignOnRequest"),
    @XmlEnumValue("AutoAlignWithFineAlignment")
    AUTO_ALIGN_WITH_FINE_ALIGNMENT("AutoAlignWithFineAlignment");
    private final String value;

    AutoAlignOptionsWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoAlignOptionsWs fromValue(String v) {
        for (AutoAlignOptionsWs c: AutoAlignOptionsWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
