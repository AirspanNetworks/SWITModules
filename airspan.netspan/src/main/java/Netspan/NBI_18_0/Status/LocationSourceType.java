
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Configured"/&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationSourceType")
@XmlEnum
public enum LocationSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Configured")
    CONFIGURED("Configured"),
    GPS("GPS");
    private final String value;

    LocationSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationSourceType fromValue(String v) {
        for (LocationSourceType c: LocationSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
