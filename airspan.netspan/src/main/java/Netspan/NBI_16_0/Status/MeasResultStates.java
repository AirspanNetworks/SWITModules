
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasResultStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasResultStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="Greater"/>
 *     &lt;enumeration value="ControlFail"/>
 *     &lt;enumeration value="TestFail"/>
 *     &lt;enumeration value="Threshold"/>
 *     &lt;enumeration value="Valid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasResultStates")
@XmlEnum
public enum MeasResultStates {

    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Greater")
    GREATER("Greater"),
    @XmlEnumValue("ControlFail")
    CONTROL_FAIL("ControlFail"),
    @XmlEnumValue("TestFail")
    TEST_FAIL("TestFail"),
    @XmlEnumValue("Threshold")
    THRESHOLD("Threshold"),
    @XmlEnumValue("Valid")
    VALID("Valid");
    private final String value;

    MeasResultStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasResultStates fromValue(String v) {
        for (MeasResultStates c: MeasResultStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
