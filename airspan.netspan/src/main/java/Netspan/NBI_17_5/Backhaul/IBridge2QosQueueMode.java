
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosQueueMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2QosQueueMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Wfq"/&gt;
 *     &lt;enumeration value="Pq"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2QosQueueMode")
@XmlEnum
public enum IBridge2QosQueueMode {

    @XmlEnumValue("Wfq")
    WFQ("Wfq"),
    @XmlEnumValue("Pq")
    PQ("Pq");
    private final String value;

    IBridge2QosQueueMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2QosQueueMode fromValue(String v) {
        for (IBridge2QosQueueMode c: IBridge2QosQueueMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
