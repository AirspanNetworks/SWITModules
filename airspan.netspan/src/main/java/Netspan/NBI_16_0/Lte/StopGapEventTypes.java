
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopGapEventTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopGapEventTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopGapEventTypes")
@XmlEnum
public enum StopGapEventTypes {

    @XmlEnumValue("A1")
    A_1("A1");
    private final String value;

    StopGapEventTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopGapEventTypes fromValue(String v) {
        for (StopGapEventTypes c: StopGapEventTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
