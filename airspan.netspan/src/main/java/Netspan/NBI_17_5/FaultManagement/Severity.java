
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Severity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Severity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Indeterminate"/&gt;
 *     &lt;enumeration value="Critical"/&gt;
 *     &lt;enumeration value="Major"/&gt;
 *     &lt;enumeration value="Minor"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
