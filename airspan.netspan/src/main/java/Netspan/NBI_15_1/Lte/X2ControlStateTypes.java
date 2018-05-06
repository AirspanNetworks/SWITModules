
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X2ControlStateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="X2ControlStateTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="NotAllowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "X2ControlStateTypes")
@XmlEnum
public enum X2ControlStateTypes {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("NotAllowed")
    NOT_ALLOWED("NotAllowed");
    private final String value;

    X2ControlStateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static X2ControlStateTypes fromValue(String v) {
        for (X2ControlStateTypes c: X2ControlStateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
