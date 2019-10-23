
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BwMeasurementResultStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BwMeasurementResultStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="Fail"/&gt;
 *     &lt;enumeration value="LessMrfcnua"/&gt;
 *     &lt;enumeration value="GreatMrfcnya"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BwMeasurementResultStates")
@XmlEnum
public enum BwMeasurementResultStates {

    NA("NA"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("LessMrfcnua")
    LESS_MRFCNUA("LessMrfcnua"),
    @XmlEnumValue("GreatMrfcnya")
    GREAT_MRFCNYA("GreatMrfcnya");
    private final String value;

    BwMeasurementResultStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BwMeasurementResultStates fromValue(String v) {
        for (BwMeasurementResultStates c: BwMeasurementResultStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
