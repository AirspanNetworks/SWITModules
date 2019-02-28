
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrameStructureTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrameStructureTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Fdd"/&gt;
 *     &lt;enumeration value="TddFc0"/&gt;
 *     &lt;enumeration value="TddFc1"/&gt;
 *     &lt;enumeration value="TddFc2"/&gt;
 *     &lt;enumeration value="TddFc3"/&gt;
 *     &lt;enumeration value="TddFc4"/&gt;
 *     &lt;enumeration value="TddFc5"/&gt;
 *     &lt;enumeration value="TddFc6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FrameStructureTypes")
@XmlEnum
public enum FrameStructureTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Fdd")
    FDD("Fdd"),
    @XmlEnumValue("TddFc0")
    TDD_FC_0("TddFc0"),
    @XmlEnumValue("TddFc1")
    TDD_FC_1("TddFc1"),
    @XmlEnumValue("TddFc2")
    TDD_FC_2("TddFc2"),
    @XmlEnumValue("TddFc3")
    TDD_FC_3("TddFc3"),
    @XmlEnumValue("TddFc4")
    TDD_FC_4("TddFc4"),
    @XmlEnumValue("TddFc5")
    TDD_FC_5("TddFc5"),
    @XmlEnumValue("TddFc6")
    TDD_FC_6("TddFc6");
    private final String value;

    FrameStructureTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrameStructureTypes fromValue(String v) {
        for (FrameStructureTypes c: FrameStructureTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
