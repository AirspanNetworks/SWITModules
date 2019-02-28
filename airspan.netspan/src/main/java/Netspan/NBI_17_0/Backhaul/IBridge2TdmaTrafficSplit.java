
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2TdmaTrafficSplit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2TdmaTrafficSplit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Split 25/75"/&gt;
 *     &lt;enumeration value="Split 50/50"/&gt;
 *     &lt;enumeration value="Split 75/25"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2TdmaTrafficSplit")
@XmlEnum
public enum IBridge2TdmaTrafficSplit {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Split 25/75")
    SPLIT_25_75("Split 25/75"),
    @XmlEnumValue("Split 50/50")
    SPLIT_50_50("Split 50/50"),
    @XmlEnumValue("Split 75/25")
    SPLIT_75_25("Split 75/25");
    private final String value;

    IBridge2TdmaTrafficSplit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2TdmaTrafficSplit fromValue(String v) {
        for (IBridge2TdmaTrafficSplit c: IBridge2TdmaTrafficSplit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
