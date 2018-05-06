
package Netspan.NBI_14_50.API.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManualAutomaticValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManualAutomaticValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Automatic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManualAutomaticValues")
@XmlEnum
public enum ManualAutomaticValues {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    ManualAutomaticValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManualAutomaticValues fromValue(String v) {
        for (ManualAutomaticValues c: ManualAutomaticValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
