
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplexModeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplexModeTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDD"/>
 *     &lt;enumeration value="TDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplexModeTypes")
@XmlEnum
public enum DuplexModeTypes {

    FDD,
    TDD;

    public String value() {
        return name();
    }

    public static DuplexModeTypes fromValue(String v) {
        return valueOf(v);
    }

}
