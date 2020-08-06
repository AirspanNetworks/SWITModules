
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ldleMode"/&gt;
 *     &lt;enumeration value="ConnectedMode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScanModeType")
@XmlEnum
public enum ScanModeType {

    @XmlEnumValue("ldleMode")
    LDLE_MODE("ldleMode"),
    @XmlEnumValue("ConnectedMode")
    CONNECTED_MODE("ConnectedMode");
    private final String value;

    ScanModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScanModeType fromValue(String v) {
        for (ScanModeType c: ScanModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
