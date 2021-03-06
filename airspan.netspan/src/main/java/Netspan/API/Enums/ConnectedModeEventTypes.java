
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedModeEventTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectedModeEventTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A3"/&gt;
 *     &lt;enumeration value="A4"/&gt;
 *     &lt;enumeration value="A5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectedModeEventTypes")
@XmlEnum
public enum ConnectedModeEventTypes {

    @XmlEnumValue("A3")
    A_3("A3"),
    @XmlEnumValue("A4")
    A_4("A4"),
    @XmlEnumValue("A5")
    A_5("A5");
    private final String value;

    ConnectedModeEventTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectedModeEventTypes fromValue(String v) {
        for (ConnectedModeEventTypes c: ConnectedModeEventTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
