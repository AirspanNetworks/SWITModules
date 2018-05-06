
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SrvccTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrvccTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PsAndCs"/>
 *     &lt;enumeration value="CsOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SrvccTypes")
@XmlEnum
public enum SrvccTypes {

    @XmlEnumValue("PsAndCs")
    PS_AND_CS("PsAndCs"),
    @XmlEnumValue("CsOnly")
    CS_ONLY("CsOnly");
    private final String value;

    SrvccTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvccTypes fromValue(String v) {
        for (SrvccTypes c: SrvccTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
