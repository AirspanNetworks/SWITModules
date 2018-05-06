
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmSeverityValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmSeverityValuesWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Critical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlarmSeverityValuesWs")
@XmlEnum
public enum AlarmSeverityValuesWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical");
    private final String value;

    AlarmSeverityValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmSeverityValuesWs fromValue(String v) {
        for (AlarmSeverityValuesWs c: AlarmSeverityValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
