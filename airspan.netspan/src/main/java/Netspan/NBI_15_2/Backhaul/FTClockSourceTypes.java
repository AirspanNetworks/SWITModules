
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTClockSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FTClockSourceTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReceivedChannel"/&gt;
 *     &lt;enumeration value="Gps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FTClockSourceTypes")
@XmlEnum
public enum FTClockSourceTypes {

    @XmlEnumValue("ReceivedChannel")
    RECEIVED_CHANNEL("ReceivedChannel"),
    @XmlEnumValue("Gps")
    GPS("Gps");
    private final String value;

    FTClockSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FTClockSourceTypes fromValue(String v) {
        for (FTClockSourceTypes c: FTClockSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
