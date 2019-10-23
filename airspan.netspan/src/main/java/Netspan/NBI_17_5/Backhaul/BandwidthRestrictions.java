
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandwidthRestrictions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandwidthRestrictions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QosDisabled"/&gt;
 *     &lt;enumeration value="StrictRate"/&gt;
 *     &lt;enumeration value="DefinedSplit"/&gt;
 *     &lt;enumeration value="OneDirectionFixed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BandwidthRestrictions")
@XmlEnum
public enum BandwidthRestrictions {

    @XmlEnumValue("QosDisabled")
    QOS_DISABLED("QosDisabled"),
    @XmlEnumValue("StrictRate")
    STRICT_RATE("StrictRate"),
    @XmlEnumValue("DefinedSplit")
    DEFINED_SPLIT("DefinedSplit"),
    @XmlEnumValue("OneDirectionFixed")
    ONE_DIRECTION_FIXED("OneDirectionFixed");
    private final String value;

    BandwidthRestrictions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandwidthRestrictions fromValue(String v) {
        for (BandwidthRestrictions c: BandwidthRestrictions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
