
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosQueue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2QosQueue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Q4"/&gt;
 *     &lt;enumeration value="Q3"/&gt;
 *     &lt;enumeration value="Q2"/&gt;
 *     &lt;enumeration value="Q1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2QosQueue")
@XmlEnum
public enum IBridge2QosQueue {

    @XmlEnumValue("Q4")
    Q_4("Q4"),
    @XmlEnumValue("Q3")
    Q_3("Q3"),
    @XmlEnumValue("Q2")
    Q_2("Q2"),
    @XmlEnumValue("Q1")
    Q_1("Q1");
    private final String value;

    IBridge2QosQueue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2QosQueue fromValue(String v) {
        for (IBridge2QosQueue c: IBridge2QosQueue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
