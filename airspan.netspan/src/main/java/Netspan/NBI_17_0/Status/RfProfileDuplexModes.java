
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RfProfileDuplexModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RfProfileDuplexModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDD"/&gt;
 *     &lt;enumeration value="TDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
