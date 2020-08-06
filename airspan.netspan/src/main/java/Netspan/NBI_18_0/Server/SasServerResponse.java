
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SasServerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SasServerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SasServerResult" type="{http://Airspan.Netspan.WebServices}SasServerGet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SasServerResponse", propOrder = {
    "sasServerResult"
})
public class SasServerResponse
    extends WsResponse
{

    @XmlElement(name = "SasServerResult")
    protected SasServerGet2 sasServerResult;

    /**
     * Gets the value of the sasServerResult property.
     * 
     * @return
     *     possible object is
     *     {@link SasServerGet2 }
     *     
     */
    public SasServerGet2 getSasServerResult() {
        return sasServerResult;
    }

    /**
     * Sets the value of the sasServerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SasServerGet2 }
     *     
     */
    public void setSasServerResult(SasServerGet2 value) {
        this.sasServerResult = value;
    }

}
