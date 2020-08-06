
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageBasedRedirectionEventTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageBasedRedirectionEventTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoverageBasedRedirectionEventTypes")
@XmlEnum
public enum CoverageBasedRedirectionEventTypes {

    @XmlEnumValue("A2")
    A_2("A2");
    private final String value;

    CoverageBasedRedirectionEventTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverageBasedRedirectionEventTypes fromValue(String v) {
        for (CoverageBasedRedirectionEventTypes c: CoverageBasedRedirectionEventTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
