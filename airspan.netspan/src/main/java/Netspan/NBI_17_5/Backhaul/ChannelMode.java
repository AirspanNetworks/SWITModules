
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cm1x"/&gt;
 *     &lt;enumeration value="Cm2x"/&gt;
 *     &lt;enumeration value="Cm1xFD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelMode")
@XmlEnum
public enum ChannelMode {

    @XmlEnumValue("Cm1x")
    CM_1_X("Cm1x"),
    @XmlEnumValue("Cm2x")
    CM_2_X("Cm2x"),
    @XmlEnumValue("Cm1xFD")
    CM_1_X_FD("Cm1xFD");
    private final String value;

    ChannelMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelMode fromValue(String v) {
        for (ChannelMode c: ChannelMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
