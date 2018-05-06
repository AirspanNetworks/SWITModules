
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApnStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApnStatusStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Setup"/>
 *     &lt;enumeration value="Release"/>
 *     &lt;enumeration value="Active"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
