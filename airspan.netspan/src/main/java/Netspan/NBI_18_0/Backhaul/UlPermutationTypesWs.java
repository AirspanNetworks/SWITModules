
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UlPermutationTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UlPermutationTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PUSC"/&gt;
 *     &lt;enumeration value="AMC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UlPermutationTypesWs")
@XmlEnum
public enum UlPermutationTypesWs {

    PUSC,
    AMC;

    public String value() {
        return name();
    }

    public static UlPermutationTypesWs fromValue(String v) {
        return valueOf(v);
    }

}
