
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailoverActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailoverActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoFailover"/>
 *     &lt;enumeration value="AlwaysRevert"/>
 *     &lt;enumeration value="RevertOnFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FailoverActionTypes")
@XmlEnum
public enum FailoverActionTypes {

    @XmlEnumValue("NoFailover")
    NO_FAILOVER("NoFailover"),
    @XmlEnumValue("AlwaysRevert")
    ALWAYS_REVERT("AlwaysRevert"),
    @XmlEnumValue("RevertOnFailure")
    REVERT_ON_FAILURE("RevertOnFailure");
    private final String value;

    FailoverActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FailoverActionTypes fromValue(String v) {
        for (FailoverActionTypes c: FailoverActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
