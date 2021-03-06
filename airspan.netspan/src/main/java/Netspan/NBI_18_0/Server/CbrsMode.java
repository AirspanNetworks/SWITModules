
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbrsMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbrsMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="PAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbrsMode")
@XmlEnum
public enum CbrsMode {

    BW,
    PAL;

    public String value() {
        return name();
    }

    public static CbrsMode fromValue(String v) {
        return valueOf(v);
    }

}
