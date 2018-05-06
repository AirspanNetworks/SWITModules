
package Netspan.NBI_14_50.API.Status;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IRelayScanListGetResult" type="{http://Airspan.Netspan.WebServices}IRelayScanListGetResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iRelayScanListGetResult"
})
@XmlRootElement(name = "IRelayScanListGetResponse")
public class IRelayScanListGetResponse {

    @XmlElement(name = "IRelayScanListGetResult")
    protected IRelayScanListGetResult iRelayScanListGetResult;

    /**
     * Gets the value of the iRelayScanListGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IRelayScanListGetResult }
     *     
     */
    public IRelayScanListGetResult getIRelayScanListGetResult() {
        return iRelayScanListGetResult;
    }

    /**
     * Sets the value of the iRelayScanListGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRelayScanListGetResult }
     *     
     */
    public void setIRelayScanListGetResult(IRelayScanListGetResult value) {
        this.iRelayScanListGetResult = value;
    }

}
