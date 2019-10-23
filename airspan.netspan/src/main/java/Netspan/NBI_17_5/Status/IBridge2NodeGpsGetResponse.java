
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="IBridge2NodeGpsGetResult" type="{http://Airspan.Netspan.WebServices}Ibridge2GpsGetResult" minOccurs="0"/&gt;
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
    "iBridge2NodeGpsGetResult"
})
@XmlRootElement(name = "IBridge2NodeGpsGetResponse")
public class IBridge2NodeGpsGetResponse {

    @XmlElement(name = "IBridge2NodeGpsGetResult")
    protected Ibridge2GpsGetResult iBridge2NodeGpsGetResult;

    /**
     * Gets the value of the iBridge2NodeGpsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ibridge2GpsGetResult }
     *     
     */
    public Ibridge2GpsGetResult getIBridge2NodeGpsGetResult() {
        return iBridge2NodeGpsGetResult;
    }

    /**
     * Sets the value of the iBridge2NodeGpsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ibridge2GpsGetResult }
     *     
     */
    public void setIBridge2NodeGpsGetResult(Ibridge2GpsGetResult value) {
        this.iBridge2NodeGpsGetResult = value;
    }

}
