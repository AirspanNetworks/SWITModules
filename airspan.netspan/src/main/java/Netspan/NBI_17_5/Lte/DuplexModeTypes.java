
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplexModeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplexModeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDD"/&gt;
 *     &lt;enumeration value="TDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
