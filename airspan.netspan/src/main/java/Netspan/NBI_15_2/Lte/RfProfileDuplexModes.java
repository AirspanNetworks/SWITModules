
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RfProfileDuplexModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RfProfileDuplexModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDD"/>
 *     &lt;enumeration value="TDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RfProfileDuplexModes")
@XmlEnum
public enum RfProfileDuplexModes {

    FDD,
    TDD;

    public String value() {
        return name();
    }

    public static RfProfileDuplexModes fromValue(String v) {
        return valueOf(v);
    }

}
