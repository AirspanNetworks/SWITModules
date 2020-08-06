
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREQ"/&gt;
 *     &lt;enumeration value="PHASE"/&gt;
 *     &lt;enumeration value="TIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncModes")
@XmlEnum
public enum SyncModes {

    FREQ,
    PHASE,
    TIME;

    public String value() {
        return name();
    }

    public static SyncModes fromValue(String v) {
        return valueOf(v);
    }

}
