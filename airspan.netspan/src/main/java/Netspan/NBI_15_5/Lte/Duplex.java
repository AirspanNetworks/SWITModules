
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Duplex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Duplex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDD"/>
 *     &lt;enumeration value="TDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Duplex")
@XmlEnum
public enum Duplex {

    FDD,
    TDD;

    public String value() {
        return name();
    }

    public static Duplex fromValue(String v) {
        return valueOf(v);
    }

}
