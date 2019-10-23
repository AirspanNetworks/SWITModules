
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtpPhaseCorrectionUsages.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PtpPhaseCorrectionUsages"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AutomaticallyChoose"/&gt;
 *     &lt;enumeration value="NoPhaseCorrection"/&gt;
 *     &lt;enumeration value="DoPhaseCorrection"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PtpPhaseCorrectionUsages")
@XmlEnum
public enum PtpPhaseCorrectionUsages {

    @XmlEnumValue("AutomaticallyChoose")
    AUTOMATICALLY_CHOOSE("AutomaticallyChoose"),
    @XmlEnumValue("NoPhaseCorrection")
    NO_PHASE_CORRECTION("NoPhaseCorrection"),
    @XmlEnumValue("DoPhaseCorrection")
    DO_PHASE_CORRECTION("DoPhaseCorrection");
    private final String value;

    PtpPhaseCorrectionUsages(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PtpPhaseCorrectionUsages fromValue(String v) {
        for (PtpPhaseCorrectionUsages c: PtpPhaseCorrectionUsages.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
