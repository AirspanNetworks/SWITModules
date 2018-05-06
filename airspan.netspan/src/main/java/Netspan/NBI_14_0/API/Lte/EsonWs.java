
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EsonConnectionRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectionLostMaxRetries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonWs", propOrder = {
    "esonConnectionRetryTimer",
    "connectionLostMaxRetries"
})
public class EsonWs {

    @XmlElement(name = "EsonConnectionRetryTimer")
    protected int esonConnectionRetryTimer;
    @XmlElement(name = "ConnectionLostMaxRetries")
    protected int connectionLostMaxRetries;

    /**
     * Gets the value of the esonConnectionRetryTimer property.
     * 
     */
    public int getEsonConnectionRetryTimer() {
        return esonConnectionRetryTimer;
    }

    /**
     * Sets the value of the esonConnectionRetryTimer property.
     * 
     */
    public void setEsonConnectionRetryTimer(int value) {
        this.esonConnectionRetryTimer = value;
    }

    /**
     * Gets the value of the connectionLostMaxRetries property.
     * 
     */
    public int getConnectionLostMaxRetries() {
        return connectionLostMaxRetries;
    }

    /**
     * Sets the value of the connectionLostMaxRetries property.
     * 
     */
    public void setConnectionLostMaxRetries(int value) {
        this.connectionLostMaxRetries = value;
    }

}
