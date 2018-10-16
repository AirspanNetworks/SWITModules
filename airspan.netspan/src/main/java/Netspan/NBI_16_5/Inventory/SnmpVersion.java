
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnmpVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SnmpVersion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Version2C"/&gt;
 *     &lt;enumeration value="Version3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SnmpVersion")
@XmlEnum
public enum SnmpVersion {

    @XmlEnumValue("Version2C")
    VERSION_2_C("Version2C"),
    @XmlEnumValue("Version3")
    VERSION_3("Version3");
    private final String value;

    SnmpVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnmpVersion fromValue(String v) {
        for (SnmpVersion c: SnmpVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
