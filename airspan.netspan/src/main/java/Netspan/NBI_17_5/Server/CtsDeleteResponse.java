
package Netspan.NBI_17_5.Server;

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
 *         &lt;element name="CtsDeleteResult" type="{http://Airspan.Netspan.WebServices}CtsResponse" minOccurs="0"/&gt;
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
    "ctsDeleteResult"
})
@XmlRootElement(name = "CtsDeleteResponse")
public class CtsDeleteResponse {

    @XmlElement(name = "CtsDeleteResult")
    protected CtsResponse ctsDeleteResult;

    /**
     * Gets the value of the ctsDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link CtsResponse }
     *     
     */
    public CtsResponse getCtsDeleteResult() {
        return ctsDeleteResult;
    }

    /**
     * Sets the value of the ctsDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtsResponse }
     *     
     */
    public void setCtsDeleteResult(CtsResponse value) {
        this.ctsDeleteResult = value;
    }

}
