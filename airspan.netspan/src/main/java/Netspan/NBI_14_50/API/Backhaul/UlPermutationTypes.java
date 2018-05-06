
package Netspan.NBI_14_50.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UlPermutationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UlPermutationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUSC"/>
 *     &lt;enumeration value="AMC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
