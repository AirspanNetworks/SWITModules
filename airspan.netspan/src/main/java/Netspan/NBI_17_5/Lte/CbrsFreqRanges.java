
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbrsFreqRanges.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbrsFreqRanges"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Band42"/&gt;
 *     &lt;enumeration value="Band43"/&gt;
 *     &lt;enumeration value="Band48"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbrsFreqRanges")
@XmlEnum
public enum CbrsFreqRanges {

    @XmlEnumValue("Band42")
    BAND_42("Band42"),
    @XmlEnumValue("Band43")
    BAND_43("Band43"),
    @XmlEnumValue("Band48")
    BAND_48("Band48"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    CbrsFreqRanges(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbrsFreqRanges fromValue(String v) {
        for (CbrsFreqRanges c: CbrsFreqRanges.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
