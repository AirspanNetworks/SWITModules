
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbsdStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbsdStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unregistered"/&gt;
 *     &lt;enumeration value="RegisteredIdle"/&gt;
 *     &lt;enumeration value="RegisteredSiSuccess"/&gt;
 *     &lt;enumeration value="RegisteredGranted"/&gt;
 *     &lt;enumeration value="RegisteredAuthorized"/&gt;
 *     &lt;enumeration value="Deregistered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbsdStates")
@XmlEnum
public enum CbsdStates {

    @XmlEnumValue("Unregistered")
    UNREGISTERED("Unregistered"),
    @XmlEnumValue("RegisteredIdle")
    REGISTERED_IDLE("RegisteredIdle"),
    @XmlEnumValue("RegisteredSiSuccess")
    REGISTERED_SI_SUCCESS("RegisteredSiSuccess"),
    @XmlEnumValue("RegisteredGranted")
    REGISTERED_GRANTED("RegisteredGranted"),
    @XmlEnumValue("RegisteredAuthorized")
    REGISTERED_AUTHORIZED("RegisteredAuthorized"),
    @XmlEnumValue("Deregistered")
    DEREGISTERED("Deregistered");
    private final String value;

    CbsdStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbsdStates fromValue(String v) {
        for (CbsdStates c: CbsdStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
