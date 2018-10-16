
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeFrameModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeFrameModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullChannel"/&gt;
 *     &lt;enumeration value="Segmented"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeFrameModesWs")
@XmlEnum
public enum IBridgeFrameModesWs {

    @XmlEnumValue("FullChannel")
    FULL_CHANNEL("FullChannel"),
    @XmlEnumValue("Segmented")
    SEGMENTED("Segmented");
    private final String value;

    IBridgeFrameModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeFrameModesWs fromValue(String v) {
        for (IBridgeFrameModesWs c: IBridgeFrameModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
