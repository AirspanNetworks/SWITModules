
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RxNullingModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RxNullingModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NullingModeDisabled"/>
 *     &lt;enumeration value="NullingModeOnRequest"/>
 *     &lt;enumeration value="NullingModeContinuous"/>
 *     &lt;enumeration value="NullingModeOnRequestAndSignon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RxNullingModes")
@XmlEnum
public enum RxNullingModes {

    @XmlEnumValue("NullingModeDisabled")
    NULLING_MODE_DISABLED("NullingModeDisabled"),
    @XmlEnumValue("NullingModeOnRequest")
    NULLING_MODE_ON_REQUEST("NullingModeOnRequest"),
    @XmlEnumValue("NullingModeContinuous")
    NULLING_MODE_CONTINUOUS("NullingModeContinuous"),
    @XmlEnumValue("NullingModeOnRequestAndSignon")
    NULLING_MODE_ON_REQUEST_AND_SIGNON("NullingModeOnRequestAndSignon");
    private final String value;

    RxNullingModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RxNullingModes fromValue(String v) {
        for (RxNullingModes c: RxNullingModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
