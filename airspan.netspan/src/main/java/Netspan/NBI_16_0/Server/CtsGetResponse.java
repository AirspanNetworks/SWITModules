
package Netspan.NBI_16_0.Server;

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
 *         &lt;element name="CtsGetResult" type="{http://Airspan.Netspan.WebServices}CtsGetResult" minOccurs="0"/>
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
    "ctsGetResult"
})
@XmlRootElement(name = "CtsGetResponse")
public class CtsGetResponse {

    @XmlElement(name = "CtsGetResult")
    protected CtsGetResult ctsGetResult;

    /**
     * Gets the value of the ctsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CtsGetResult }
     *     
     */
    public CtsGetResult getCtsGetResult() {
        return ctsGetResult;
    }

    /**
     * Sets the value of the ctsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtsGetResult }
     *     
     */
    public void setCtsGetResult(CtsGetResult value) {
        this.ctsGetResult = value;
    }

}
