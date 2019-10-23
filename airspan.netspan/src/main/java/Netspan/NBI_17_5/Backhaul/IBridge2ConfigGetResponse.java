
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="IBridge2ConfigGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2ConfigGetResult" minOccurs="0"/&gt;
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
    "iBridge2ConfigGetResult"
})
@XmlRootElement(name = "IBridge2ConfigGetResponse")
public class IBridge2ConfigGetResponse {

    @XmlElement(name = "IBridge2ConfigGetResult")
    protected IBridge2ConfigGetResult iBridge2ConfigGetResult;

    /**
     * Gets the value of the iBridge2ConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2ConfigGetResult }
     *     
     */
    public IBridge2ConfigGetResult getIBridge2ConfigGetResult() {
        return iBridge2ConfigGetResult;
    }

    /**
     * Sets the value of the iBridge2ConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2ConfigGetResult }
     *     
     */
    public void setIBridge2ConfigGetResult(IBridge2ConfigGetResult value) {
        this.iBridge2ConfigGetResult = value;
    }

}
