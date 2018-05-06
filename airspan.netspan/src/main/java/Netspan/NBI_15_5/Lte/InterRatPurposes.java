
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterRatPurposes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterRatPurposes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSFB"/>
 *     &lt;enumeration value="HO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterRatPurposes")
@XmlEnum
public enum InterRatPurposes {

    CSFB,
    HO;

    public String value() {
        return name();
    }

    public static InterRatPurposes fromValue(String v) {
        return valueOf(v);
    }

}
