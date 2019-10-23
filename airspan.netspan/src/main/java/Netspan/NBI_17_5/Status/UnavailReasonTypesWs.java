
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnavailReasonTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnavailReasonTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NoError"/&gt;
 *     &lt;enumeration value="PhaseErrorTooLarge"/&gt;
 *     &lt;enumeration value="FreqErrorTooLarge"/&gt;
 *     &lt;enumeration value="CellSynchronizationLoss"/&gt;
 *     &lt;enumeration value="FreqAndPhaseErrorTooLarge"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnavailReasonTypesWs")
@XmlEnum
public enum UnavailReasonTypesWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NoError")
    NO_ERROR("NoError"),
    @XmlEnumValue("PhaseErrorTooLarge")
    PHASE_ERROR_TOO_LARGE("PhaseErrorTooLarge"),
    @XmlEnumValue("FreqErrorTooLarge")
    FREQ_ERROR_TOO_LARGE("FreqErrorTooLarge"),
    @XmlEnumValue("CellSynchronizationLoss")
    CELL_SYNCHRONIZATION_LOSS("CellSynchronizationLoss"),
    @XmlEnumValue("FreqAndPhaseErrorTooLarge")
    FREQ_AND_PHASE_ERROR_TOO_LARGE("FreqAndPhaseErrorTooLarge"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");
    private final String value;

    UnavailReasonTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnavailReasonTypesWs fromValue(String v) {
        for (UnavailReasonTypesWs c: UnavailReasonTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
