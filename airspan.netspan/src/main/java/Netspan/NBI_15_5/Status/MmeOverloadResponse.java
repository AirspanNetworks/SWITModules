
package Netspan.NBI_15_5.Status;

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
 *     &lt;enumeration value="Start Reject Non-emergency MO DT"/>
 *     &lt;enumeration value="Start Reject RRC CR Signalling"/>
 *     &lt;enumeration value="Start Permit Emergency Session and Mobile Terminated Services only"/>
 *     &lt;enumeration value="Start Permit High Priority Session and Mobile Terminated Services only"/>
 *     &lt;enumeration value="Start Reject Delay Tolerant Access"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MmeOverloadResponse")
@XmlEnum
public enum MmeOverloadResponse {

    @XmlEnumValue("Start Reject Non-emergency MO DT")
    START_REJECT_NON_EMERGENCY_MO_DT("Start Reject Non-emergency MO DT"),
    @XmlEnumValue("Start Reject RRC CR Signalling")
    START_REJECT_RRC_CR_SIGNALLING("Start Reject RRC CR Signalling"),
    @XmlEnumValue("Start Permit Emergency Session and Mobile Terminated Services only")
    START_PERMIT_EMERGENCY_SESSION_AND_MOBILE_TERMINATED_SERVICES_ONLY("Start Permit Emergency Session and Mobile Terminated Services only"),
    @XmlEnumValue("Start Permit High Priority Session and Mobile Terminated Services only")
    START_PERMIT_HIGH_PRIORITY_SESSION_AND_MOBILE_TERMINATED_SERVICES_ONLY("Start Permit High Priority Session and Mobile Terminated Services only"),
    @XmlEnumValue("Start Reject Delay Tolerant Access")
    START_REJECT_DELAY_TOLERANT_ACCESS("Start Reject Delay Tolerant Access"),
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
