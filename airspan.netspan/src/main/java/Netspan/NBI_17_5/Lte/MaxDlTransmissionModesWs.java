
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaxDlTransmissionModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaxDlTransmissionModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unrestricted"/&gt;
 *     &lt;enumeration value="TM8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaxDlTransmissionModesWs")
@XmlEnum
public enum MaxDlTransmissionModesWs {

    @XmlEnumValue("Unrestricted")
    UNRESTRICTED("Unrestricted"),
    @XmlEnumValue("TM8")
    TM_8("TM8");
    private final String value;

    MaxDlTransmissionModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaxDlTransmissionModesWs fromValue(String v) {
        for (MaxDlTransmissionModesWs c: MaxDlTransmissionModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
