
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GpsFileStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GpsFileStatusValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="Valid"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GpsFileStatusValues")
@XmlEnum
public enum GpsFileStatusValues {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    GpsFileStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GpsFileStatusValues fromValue(String v) {
        for (GpsFileStatusValues c: GpsFileStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
