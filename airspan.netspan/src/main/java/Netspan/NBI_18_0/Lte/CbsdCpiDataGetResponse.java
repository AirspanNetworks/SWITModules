
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="CbsdCpiDataGetResult" type="{http://Airspan.Netspan.WebServices}CbsdCpiDataGetResult" minOccurs="0"/&gt;
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
    "cbsdCpiDataGetResult"
})
@XmlRootElement(name = "CbsdCpiDataGetResponse")
public class CbsdCpiDataGetResponse {

    @XmlElement(name = "CbsdCpiDataGetResult")
    protected CbsdCpiDataGetResult cbsdCpiDataGetResult;

    /**
     * Gets the value of the cbsdCpiDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CbsdCpiDataGetResult }
     *     
     */
    public CbsdCpiDataGetResult getCbsdCpiDataGetResult() {
        return cbsdCpiDataGetResult;
    }

    /**
     * Sets the value of the cbsdCpiDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsdCpiDataGetResult }
     *     
     */
    public void setCbsdCpiDataGetResult(CbsdCpiDataGetResult value) {
        this.cbsdCpiDataGetResult = value;
    }

}
