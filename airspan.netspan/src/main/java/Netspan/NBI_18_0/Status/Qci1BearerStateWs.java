
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Qci1BearerStateWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Qci1BearerStateWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NotEstablished"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Qci1BearerStateWs")
@XmlEnum
public enum Qci1BearerStateWs {

    NA("NA"),
    @XmlEnumValue("NotEstablished")
    NOT_ESTABLISHED("NotEstablished"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    Qci1BearerStateWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Qci1BearerStateWs fromValue(String v) {
        for (Qci1BearerStateWs c: Qci1BearerStateWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
