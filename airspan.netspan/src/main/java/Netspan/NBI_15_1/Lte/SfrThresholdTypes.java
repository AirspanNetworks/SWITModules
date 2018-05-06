
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SfrThresholdTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SfrThresholdTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Static"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SfrThresholdTypes")
@XmlEnum
public enum SfrThresholdTypes {

    @XmlEnumValue("Static")
    STATIC("Static");
    private final String value;

    SfrThresholdTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SfrThresholdTypes fromValue(String v) {
        for (SfrThresholdTypes c: SfrThresholdTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
