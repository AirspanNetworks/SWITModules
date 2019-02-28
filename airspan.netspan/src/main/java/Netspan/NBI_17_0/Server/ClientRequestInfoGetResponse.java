
package Netspan.NBI_17_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientRequestInfoGetResult" type="{http://Airspan.Netspan.WebServices}ClientRequestInfoResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientRequestInfoGetResult"
})
@XmlRootElement(name = "ClientRequestInfoGetResponse")
public class ClientRequestInfoGetResponse {

    @XmlElement(name = "ClientRequestInfoGetResult")
    protected ClientRequestInfoResponse clientRequestInfoGetResult;

    /**
     * Gets the value of the clientRequestInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClientRequestInfoResponse }
     *     
     */
    public ClientRequestInfoResponse getClientRequestInfoGetResult() {
        return clientRequestInfoGetResult;
    }

    /**
     * Sets the value of the clientRequestInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientRequestInfoResponse }
     *     
     */
    public void setClientRequestInfoGetResult(ClientRequestInfoResponse value) {
        this.clientRequestInfoGetResult = value;
    }

}
