
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplexModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplexModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDD"/>
 *     &lt;enumeration value="TDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplexModes")
@XmlEnum
public enum DuplexModes {

    FDD,
    TDD;

    public String value() {
        return name();
    }

    public static DuplexModes fromValue(String v) {
        return valueOf(v);
    }

}
