
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSourcesSync.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSourcesSync"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NTP"/&gt;
 *     &lt;enumeration value="IEEE1588"/&gt;
 *     &lt;enumeration value="GNSS"/&gt;
 *     &lt;enumeration value="NLM"/&gt;
 *     &lt;enumeration value="ExternalClock"/&gt;
 *     &lt;enumeration value="PPS"/&gt;
 *     &lt;enumeration value="FreeRunning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockSourcesSync")
@XmlEnum
public enum ClockSourcesSync {

    NTP("NTP"),
    @XmlEnumValue("IEEE1588")
    IEEE_1588("IEEE1588"),
    GNSS("GNSS"),
    NLM("NLM"),
    @XmlEnumValue("ExternalClock")
    EXTERNAL_CLOCK("ExternalClock"),
    PPS("PPS"),
    @XmlEnumValue("FreeRunning")
    FREE_RUNNING("FreeRunning");
    private final String value;

    ClockSourcesSync(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSourcesSync fromValue(String v) {
        for (ClockSourcesSync c: ClockSourcesSync.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
