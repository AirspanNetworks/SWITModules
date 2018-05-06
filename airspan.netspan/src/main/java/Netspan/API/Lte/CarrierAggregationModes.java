
package Netspan.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierAggregationModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarrierAggregationModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Contiguous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
