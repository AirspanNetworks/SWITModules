
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RxNullingModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RxNullingModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NullingModeDisabled"/&gt;
 *     &lt;enumeration value="NullingModeOnRequest"/&gt;
 *     &lt;enumeration value="NullingModeContinuous"/&gt;
 *     &lt;enumeration value="NullingModeOnRequestAndSignon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RxNullingModesWs")
@XmlEnum
public enum RxNullingModesWs {

    @XmlEnumValue("NullingModeDisabled")
    NULLING_MODE_DISABLED("NullingModeDisabled"),
    @XmlEnumValue("NullingModeOnRequest")
    NULLING_MODE_ON_REQUEST("NullingModeOnRequest"),
    @XmlEnumValue("NullingModeContinuous")
    NULLING_MODE_CONTINUOUS("NullingModeContinuous"),
    @XmlEnumValue("NullingModeOnRequestAndSignon")
    NULLING_MODE_ON_REQUEST_AND_SIGNON("NullingModeOnRequestAndSignon");
    private final String value;

    RxNullingModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RxNullingModesWs fromValue(String v) {
        for (RxNullingModesWs c: RxNullingModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
