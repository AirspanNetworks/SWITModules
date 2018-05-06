
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandPriorityValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandPriorityValuesWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SpecifiedPriority"/>
 *     &lt;enumeration value="EqualPriority"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandPriorityValuesWs")
@XmlEnum
public enum BandPriorityValuesWs {

    @XmlEnumValue("SpecifiedPriority")
    SPECIFIED_PRIORITY("SpecifiedPriority"),
    @XmlEnumValue("EqualPriority")
    EQUAL_PRIORITY("EqualPriority");
    private final String value;

    BandPriorityValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandPriorityValuesWs fromValue(String v) {
        for (BandPriorityValuesWs c: BandPriorityValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
