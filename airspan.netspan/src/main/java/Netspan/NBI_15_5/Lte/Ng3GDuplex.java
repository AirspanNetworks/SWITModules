
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ng3gDuplex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ng3gDuplex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDD"/>
 *     &lt;enumeration value="TDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ng3gDuplex")
@XmlEnum
public enum Ng3GDuplex {

    FDD,
    TDD;

    public String value() {
        return name();
    }

    public static Ng3GDuplex fromValue(String v) {
        return valueOf(v);
    }

}
