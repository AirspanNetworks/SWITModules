
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbrStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbrStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Bearer1Ok"/&gt;
 *     &lt;enumeration value="Bearer1Fail"/&gt;
 *     &lt;enumeration value="Bearer2Ok"/&gt;
 *     &lt;enumeration value="Bearer2Fail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbrStates")
@XmlEnum
public enum CbrStates {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Bearer1Ok")
    BEARER_1_OK("Bearer1Ok"),
    @XmlEnumValue("Bearer1Fail")
    BEARER_1_FAIL("Bearer1Fail"),
    @XmlEnumValue("Bearer2Ok")
    BEARER_2_OK("Bearer2Ok"),
    @XmlEnumValue("Bearer2Fail")
    BEARER_2_FAIL("Bearer2Fail");
    private final String value;

    CbrStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbrStates fromValue(String v) {
        for (CbrStates c: CbrStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
