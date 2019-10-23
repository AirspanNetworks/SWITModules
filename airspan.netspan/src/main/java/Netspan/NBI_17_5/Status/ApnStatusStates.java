
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApnStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApnStatusStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Idle"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Setup"/&gt;
 *     &lt;enumeration value="Release"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApnStatusStates")
@XmlEnum
public enum ApnStatusStates {

    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Setup")
    SETUP("Setup"),
    @XmlEnumValue("Release")
    RELEASE("Release"),
    @XmlEnumValue("Active")
    ACTIVE("Active");
    private final String value;

    ApnStatusStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApnStatusStates fromValue(String v) {
        for (ApnStatusStates c: ApnStatusStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
