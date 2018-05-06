
package Netspan.NBI_15_1.Server;

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
 *         &lt;element name="CtsCreateResult" type="{http://Airspan.Netspan.WebServices}CtsResponse" minOccurs="0"/>
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
    "ctsCreateResult"
})
@XmlRootElement(name = "CtsCreateResponse")
public class CtsCreateResponse {

    @XmlElement(name = "CtsCreateResult")
    protected CtsResponse ctsCreateResult;

    /**
     * Gets the value of the ctsCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CtsResponse }
     *     
     */
    public CtsResponse getCtsCreateResult() {
        return ctsCreateResult;
    }

    /**
     * Sets the value of the ctsCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtsResponse }
     *     
     */
    public void setCtsCreateResult(CtsResponse value) {
        this.ctsCreateResult = value;
    }

}
