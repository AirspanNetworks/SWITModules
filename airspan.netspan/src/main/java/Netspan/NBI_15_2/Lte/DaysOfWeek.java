
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaysOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysOfWeek"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUN"/&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="TUE"/&gt;
 *     &lt;enumeration value="WED"/&gt;
 *     &lt;enumeration value="THU"/&gt;
 *     &lt;enumeration value="FRI"/&gt;
 *     &lt;enumeration value="SAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DaysOfWeek")
@XmlEnum
public enum DaysOfWeek {

    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT;

    public String value() {
        return name();
    }

    public static DaysOfWeek fromValue(String v) {
        return valueOf(v);
    }

}
