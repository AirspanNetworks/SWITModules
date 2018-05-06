
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="UtranProfileGetResult" type="{http://Airspan.Netspan.WebServices}UtranProfileGetResult" minOccurs="0"/>
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
    "utranProfileGetResult"
})
@XmlRootElement(name = "UtranProfileGetResponse")
public class UtranProfileGetResponse {

    @XmlElement(name = "UtranProfileGetResult")
    protected UtranProfileGetResult utranProfileGetResult;

    /**
     * Gets the value of the utranProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link UtranProfileGetResult }
     *     
     */
    public UtranProfileGetResult getUtranProfileGetResult() {
        return utranProfileGetResult;
    }

    /**
     * Sets the value of the utranProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranProfileGetResult }
     *     
     */
    public void setUtranProfileGetResult(UtranProfileGetResult value) {
        this.utranProfileGetResult = value;
    }

}
