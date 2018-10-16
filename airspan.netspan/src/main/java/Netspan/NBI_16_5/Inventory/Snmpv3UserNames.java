
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Snmpv3UserNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Snmpv3UserNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReadOnly"/&gt;
 *     &lt;enumeration value="ReadWrite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Snmpv3UserNames")
@XmlEnum
public enum Snmpv3UserNames {

    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    @XmlEnumValue("ReadWrite")
    READ_WRITE("ReadWrite");
    private final String value;

    Snmpv3UserNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Snmpv3UserNames fromValue(String v) {
        for (Snmpv3UserNames c: Snmpv3UserNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
