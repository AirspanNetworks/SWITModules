
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbsdMeasReportTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbsdMeasReportTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="ReceivedPowerWithoutGrant"/&gt;
 *     &lt;enumeration value="ReceivedPowerWithGrant"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbsdMeasReportTypes")
@XmlEnum
public enum CbsdMeasReportTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ReceivedPowerWithoutGrant")
    RECEIVED_POWER_WITHOUT_GRANT("ReceivedPowerWithoutGrant"),
    @XmlEnumValue("ReceivedPowerWithGrant")
    RECEIVED_POWER_WITH_GRANT("ReceivedPowerWithGrant");
    private final String value;

    CbsdMeasReportTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbsdMeasReportTypes fromValue(String v) {
        for (CbsdMeasReportTypes c: CbsdMeasReportTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
