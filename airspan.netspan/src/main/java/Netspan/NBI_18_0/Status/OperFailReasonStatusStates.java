
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperFailReasonStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperFailReasonStatusStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoFailure"/&gt;
 *     &lt;enumeration value="AdminDown"/&gt;
 *     &lt;enumeration value="NoGreetingRecieved"/&gt;
 *     &lt;enumeration value="Modes0GreetingRecieved"/&gt;
 *     &lt;enumeration value="NoServerStartRecieved"/&gt;
 *     &lt;enumeration value="RejectedServerStartup"/&gt;
 *     &lt;enumeration value="NoAcceptMessageRecieved"/&gt;
 *     &lt;enumeration value="RejectedAcceptAcceptMessage"/&gt;
 *     &lt;enumeration value="NoStartAckMessageRecieved"/&gt;
 *     &lt;enumeration value="RejectedStartAckAcceptMessage"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
