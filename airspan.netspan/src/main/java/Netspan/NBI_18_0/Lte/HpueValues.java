
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HpueValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HpueValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllUes"/&gt;
 *     &lt;enumeration value="Hpue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HpueValues")
@XmlEnum
public enum HpueValues {

    @XmlEnumValue("AllUes")
    ALL_UES("AllUes"),
    @XmlEnumValue("Hpue")
    HPUE("Hpue");
    private final String value;

    HpueValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HpueValues fromValue(String v) {
        for (HpueValues c: HpueValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
