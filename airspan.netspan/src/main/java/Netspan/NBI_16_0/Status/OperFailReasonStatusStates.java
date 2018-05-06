
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperFailReasonStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperFailReasonStatusStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoFailure"/>
 *     &lt;enumeration value="AdminDown"/>
 *     &lt;enumeration value="NoGreetingRecieved"/>
 *     &lt;enumeration value="Modes0GreetingRecieved"/>
 *     &lt;enumeration value="NoServerStartRecieved"/>
 *     &lt;enumeration value="RejectedServerStartup"/>
 *     &lt;enumeration value="NoAcceptMessageRecieved"/>
 *     &lt;enumeration value="RejectedAcceptAcceptMessage"/>
 *     &lt;enumeration value="NoStartAckMessageRecieved"/>
 *     &lt;enumeration value="RejectedStartAckAcceptMessage"/>
 *     &lt;enumeration value="UnknownError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperFailReasonStatusStates")
@XmlEnum
public enum OperFailReasonStatusStates {

    @XmlEnumValue("NoFailure")
    NO_FAILURE("NoFailure"),
    @XmlEnumValue("AdminDown")
    ADMIN_DOWN("AdminDown"),
    @XmlEnumValue("NoGreetingRecieved")
    NO_GREETING_RECIEVED("NoGreetingRecieved"),
    @XmlEnumValue("Modes0GreetingRecieved")
    MODES_0_GREETING_RECIEVED("Modes0GreetingRecieved"),
    @XmlEnumValue("NoServerStartRecieved")
    NO_SERVER_START_RECIEVED("NoServerStartRecieved"),
    @XmlEnumValue("RejectedServerStartup")
    REJECTED_SERVER_STARTUP("RejectedServerStartup"),
    @XmlEnumValue("NoAcceptMessageRecieved")
    NO_ACCEPT_MESSAGE_RECIEVED("NoAcceptMessageRecieved"),
    @XmlEnumValue("RejectedAcceptAcceptMessage")
    REJECTED_ACCEPT_ACCEPT_MESSAGE("RejectedAcceptAcceptMessage"),
    @XmlEnumValue("NoStartAckMessageRecieved")
    NO_START_ACK_MESSAGE_RECIEVED("NoStartAckMessageRecieved"),
    @XmlEnumValue("RejectedStartAckAcceptMessage")
    REJECTED_START_ACK_ACCEPT_MESSAGE("RejectedStartAckAcceptMessage"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    OperFailReasonStatusStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperFailReasonStatusStates fromValue(String v) {
        for (OperFailReasonStatusStates c: OperFailReasonStatusStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
