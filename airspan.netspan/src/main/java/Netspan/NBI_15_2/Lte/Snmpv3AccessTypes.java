
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Snmpv3AccessTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Snmpv3AccessTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReadWrite"/&gt;
 *     &lt;enumeration value="ReadOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Snmpv3AccessTypes")
@XmlEnum
public enum Snmpv3AccessTypes {

    @XmlEnumValue("ReadWrite")
    READ_WRITE("ReadWrite"),
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly");
    private final String value;

    Snmpv3AccessTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Snmpv3AccessTypes fromValue(String v) {
        for (Snmpv3AccessTypes c: Snmpv3AccessTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
