
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierAggregationModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarrierAggregationModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *     &lt;enumeration value="Contiguous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarrierAggregationModes")
@XmlEnum
public enum CarrierAggregationModes {

    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("Contiguous")
    CONTIGUOUS("Contiguous");
    private final String value;

    CarrierAggregationModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarrierAggregationModes fromValue(String v) {
        for (CarrierAggregationModes c: CarrierAggregationModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
