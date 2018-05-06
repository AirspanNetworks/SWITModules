
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeFrameModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeFrameModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullChannel"/>
 *     &lt;enumeration value="Segmented"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IBridgeFrameModes")
@XmlEnum
public enum IBridgeFrameModes {

    @XmlEnumValue("FullChannel")
    FULL_CHANNEL("FullChannel"),
    @XmlEnumValue("Segmented")
    SEGMENTED("Segmented");
    private final String value;

    IBridgeFrameModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeFrameModes fromValue(String v) {
        for (IBridgeFrameModes c: IBridgeFrameModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
