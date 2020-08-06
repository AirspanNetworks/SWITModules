
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MmeOverloadStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MmeOverloadStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Overloaded"/&gt;
 *     &lt;enumeration value="NotOverloaded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MmeOverloadStatus")
@XmlEnum
public enum MmeOverloadStatus {

    @XmlEnumValue("Overloaded")
    OVERLOADED("Overloaded"),
    @XmlEnumValue("NotOverloaded")
    NOT_OVERLOADED("NotOverloaded");
    private final String value;

    MmeOverloadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MmeOverloadStatus fromValue(String v) {
        for (MmeOverloadStatus c: MmeOverloadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
