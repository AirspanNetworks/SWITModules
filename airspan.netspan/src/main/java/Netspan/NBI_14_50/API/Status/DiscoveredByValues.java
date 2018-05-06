
package Netspan.NBI_14_50.API.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveredByValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscoveredByValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anr"/>
 *     &lt;enumeration value="Nms"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscoveredByValues")
@XmlEnum
public enum DiscoveredByValues {

    @XmlEnumValue("Anr")
    ANR("Anr"),
    @XmlEnumValue("Nms")
    NMS("Nms"),
    NA("NA");
    private final String value;

    DiscoveredByValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscoveredByValues fromValue(String v) {
        for (DiscoveredByValues c: DiscoveredByValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
