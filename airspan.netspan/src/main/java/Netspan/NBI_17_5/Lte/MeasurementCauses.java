
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementCauses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementCauses"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RadioReason"/&gt;
 *     &lt;enumeration value="TimeCritical"/&gt;
 *     &lt;enumeration value="ResourceOptimization"/&gt;
 *     &lt;enumeration value="ReduceLoad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementCauses")
@XmlEnum
public enum MeasurementCauses {

    @XmlEnumValue("RadioReason")
    RADIO_REASON("RadioReason"),
    @XmlEnumValue("TimeCritical")
    TIME_CRITICAL("TimeCritical"),
    @XmlEnumValue("ResourceOptimization")
    RESOURCE_OPTIMIZATION("ResourceOptimization"),
    @XmlEnumValue("ReduceLoad")
    REDUCE_LOAD("ReduceLoad");
    private final String value;

    MeasurementCauses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementCauses fromValue(String v) {
        for (MeasurementCauses c: MeasurementCauses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
