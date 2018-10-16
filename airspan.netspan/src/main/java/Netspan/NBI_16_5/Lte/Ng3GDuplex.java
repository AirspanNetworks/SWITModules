
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ng3gDuplex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ng3gDuplex"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDD"/&gt;
 *     &lt;enumeration value="TDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
