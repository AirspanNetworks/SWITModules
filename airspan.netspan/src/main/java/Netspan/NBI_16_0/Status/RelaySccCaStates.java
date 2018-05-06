
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelaySccCaStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelaySccCaStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Deconfigured"/>
 *     &lt;enumeration value="ConfiguredDeactivated"/>
 *     &lt;enumeration value="ConfiguredActivated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelaySccCaStates")
@XmlEnum
public enum RelaySccCaStates {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Deconfigured")
    DECONFIGURED("Deconfigured"),
    @XmlEnumValue("ConfiguredDeactivated")
    CONFIGURED_DEACTIVATED("ConfiguredDeactivated"),
    @XmlEnumValue("ConfiguredActivated")
    CONFIGURED_ACTIVATED("ConfiguredActivated");
    private final String value;

    RelaySccCaStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelaySccCaStates fromValue(String v) {
        for (RelaySccCaStates c: RelaySccCaStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
