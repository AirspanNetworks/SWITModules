
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpPeristencyMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpPeristencyMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PnpPeristencyMode")
@XmlEnum
public enum PnpPeristencyMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PnpPeristencyMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpPeristencyMode fromValue(String v) {
        for (PnpPeristencyMode c: PnpPeristencyMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
