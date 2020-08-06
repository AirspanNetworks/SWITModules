
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MmeOverloadResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MmeOverloadResponse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StartRejectNonEmergencyMoDt"/&gt;
 *     &lt;enumeration value="StartRejectRrcCrSignalling"/&gt;
 *     &lt;enumeration value="StartPermitEmergencySessionandMobileTerminatedServicesOnly"/&gt;
 *     &lt;enumeration value="StartPermitHighPrioritySessionandMobileTerminatedServicesOnly"/&gt;
 *     &lt;enumeration value="StartRejectDelayTolerantAccess"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MmeOverloadResponse")
@XmlEnum
public enum MmeOverloadResponse {

    @XmlEnumValue("StartRejectNonEmergencyMoDt")
    START_REJECT_NON_EMERGENCY_MO_DT("StartRejectNonEmergencyMoDt"),
    @XmlEnumValue("StartRejectRrcCrSignalling")
    START_REJECT_RRC_CR_SIGNALLING("StartRejectRrcCrSignalling"),
    @XmlEnumValue("StartPermitEmergencySessionandMobileTerminatedServicesOnly")
    START_PERMIT_EMERGENCY_SESSIONAND_MOBILE_TERMINATED_SERVICES_ONLY("StartPermitEmergencySessionandMobileTerminatedServicesOnly"),
    @XmlEnumValue("StartPermitHighPrioritySessionandMobileTerminatedServicesOnly")
    START_PERMIT_HIGH_PRIORITY_SESSIONAND_MOBILE_TERMINATED_SERVICES_ONLY("StartPermitHighPrioritySessionandMobileTerminatedServicesOnly"),
    @XmlEnumValue("StartRejectDelayTolerantAccess")
    START_REJECT_DELAY_TOLERANT_ACCESS("StartRejectDelayTolerantAccess"),
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
