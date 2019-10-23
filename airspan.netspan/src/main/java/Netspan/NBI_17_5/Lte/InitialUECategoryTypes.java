
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialUECategoryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitialUECategoryTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CEU"/&gt;
 *     &lt;enumeration value="CCU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitialUECategoryTypes")
@XmlEnum
public enum InitialUECategoryTypes {

    CEU,
    CCU;

    public String value() {
        return name();
    }

    public static InitialUECategoryTypes fromValue(String v) {
        return valueOf(v);
    }

}
