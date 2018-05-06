
package Netspan.NBI_15_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Severity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Severity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indeterminate"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Major"/>
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Severity")
@XmlEnum
public enum Severity {

    @XmlEnumValue("Indeterminate")
    INDETERMINATE("Indeterminate"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Major")
    MAJOR("Major"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    Severity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Severity fromValue(String v) {
        for (Severity c: Severity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
