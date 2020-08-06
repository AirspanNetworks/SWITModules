
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapStatusValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ResyncInitiated"/&gt;
 *     &lt;enumeration value="NoNewTrapFound"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrapStatusValues")
@XmlEnum
public enum TrapStatusValues {

    @XmlEnumValue("ResyncInitiated")
    RESYNC_INITIATED("ResyncInitiated"),
    @XmlEnumValue("NoNewTrapFound")
    NO_NEW_TRAP_FOUND("NoNewTrapFound"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    TrapStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrapStatusValues fromValue(String v) {
        for (TrapStatusValues c: TrapStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
