
package Netspan.NBI_15_1.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MmeOverloadResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MmeOverloadResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reject Non-emergency MO DT"/>
 *     &lt;enumeration value="Reject RRC CR Signalling"/>
 *     &lt;enumeration value="Permit Emergency Session and Mobile Terminated Services only"/>
 *     &lt;enumeration value="Permit High Priority Session and Mobile Terminated Services only"/>
 *     &lt;enumeration value="Reject Delay Tolerant Access"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MmeOverloadResponse")
@XmlEnum
public enum MmeOverloadResponse {

    @XmlEnumValue("Reject Non-emergency MO DT")
    REJECT_NON_EMERGENCY_MO_DT("Reject Non-emergency MO DT"),
    @XmlEnumValue("Reject RRC CR Signalling")
    REJECT_RRC_CR_SIGNALLING("Reject RRC CR Signalling"),
    @XmlEnumValue("Permit Emergency Session and Mobile Terminated Services only")
    PERMIT_EMERGENCY_SESSION_AND_MOBILE_TERMINATED_SERVICES_ONLY("Permit Emergency Session and Mobile Terminated Services only"),
    @XmlEnumValue("Permit High Priority Session and Mobile Terminated Services only")
    PERMIT_HIGH_PRIORITY_SESSION_AND_MOBILE_TERMINATED_SERVICES_ONLY("Permit High Priority Session and Mobile Terminated Services only"),
    @XmlEnumValue("Reject Delay Tolerant Access")
    REJECT_DELAY_TOLERANT_ACCESS("Reject Delay Tolerant Access"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    MmeOverloadResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MmeOverloadResponse fromValue(String v) {
        for (MmeOverloadResponse c: MmeOverloadResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
