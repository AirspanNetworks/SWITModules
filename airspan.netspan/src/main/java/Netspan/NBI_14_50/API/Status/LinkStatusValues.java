
package Netspan.NBI_14_50.API.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkStatusValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Up"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkStatusValues")
@XmlEnum
public enum LinkStatusValues {

    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    LinkStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkStatusValues fromValue(String v) {
        for (LinkStatusValues c: LinkStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
