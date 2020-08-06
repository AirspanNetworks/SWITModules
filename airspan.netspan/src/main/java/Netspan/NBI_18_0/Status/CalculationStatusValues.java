
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationStatusValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="CompletedByTime"/&gt;
 *     &lt;enumeration value="Aborted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculationStatusValues")
@XmlEnum
public enum CalculationStatusValues {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("CompletedByTime")
    COMPLETED_BY_TIME("CompletedByTime"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    CalculationStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationStatusValues fromValue(String v) {
        for (CalculationStatusValues c: CalculationStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
