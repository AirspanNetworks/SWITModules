
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UlPermutationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UlPermutationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PUSC"/&gt;
 *     &lt;enumeration value="AMC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UlPermutationTypes")
@XmlEnum
public enum UlPermutationTypes {

    PUSC,
    AMC;

    public String value() {
        return name();
    }

    public static UlPermutationTypes fromValue(String v) {
        return valueOf(v);
    }

}
