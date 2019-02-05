
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QosValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QosValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EnabledWithSixQueues"/&gt;
 *     &lt;enumeration value="EnabledWithSevenQueues"/&gt;
 *     &lt;enumeration value="EnabledWithThreeQueues"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QosValues")
@XmlEnum
public enum QosValues {

    @XmlEnumValue("EnabledWithSixQueues")
    ENABLED_WITH_SIX_QUEUES("EnabledWithSixQueues"),
    @XmlEnumValue("EnabledWithSevenQueues")
    ENABLED_WITH_SEVEN_QUEUES("EnabledWithSevenQueues"),
    @XmlEnumValue("EnabledWithThreeQueues")
    ENABLED_WITH_THREE_QUEUES("EnabledWithThreeQueues"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    QosValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QosValues fromValue(String v) {
        for (QosValues c: QosValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
