
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="SonProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteSonProfileGetResult" minOccurs="0"/&gt;
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
    "sonProfileGetResult"
})
@XmlRootElement(name = "SonProfileGetResponse")
public class SonProfileGetResponse {

    @XmlElement(name = "SonProfileGetResult")
    protected LteSonProfileGetResult sonProfileGetResult;

    /**
     * Gets the value of the sonProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonProfileGetResult }
     *     
     */
    public LteSonProfileGetResult getSonProfileGetResult() {
        return sonProfileGetResult;
    }

    /**
     * Sets the value of the sonProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonProfileGetResult }
     *     
     */
    public void setSonProfileGetResult(LteSonProfileGetResult value) {
        this.sonProfileGetResult = value;
    }

}
