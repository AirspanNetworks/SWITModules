
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelaySccCaStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelaySccCaStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CaStateNull"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Deconfigured"/&gt;
 *     &lt;enumeration value="ConfiguredDeactivated"/&gt;
 *     &lt;enumeration value="ConfiguredActivated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelaySccCaStates")
@XmlEnum
public enum RelaySccCaStates {

    @XmlEnumValue("CaStateNull")
    CA_STATE_NULL("CaStateNull"),
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
