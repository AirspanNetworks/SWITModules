
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbrsStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbrsStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unregistered"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Granted"/>
 *     &lt;enumeration value="Transmission"/>
 *     &lt;enumeration value="Suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CbrsStates")
@XmlEnum
public enum CbrsStates {

    @XmlEnumValue("Unregistered")
    UNREGISTERED("Unregistered"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Granted")
    GRANTED("Granted"),
    @XmlEnumValue("Transmission")
    TRANSMISSION("Transmission"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    CbrsStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbrsStates fromValue(String v) {
        for (CbrsStates c: CbrsStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
