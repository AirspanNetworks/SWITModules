
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
 *         &lt;element name="EmbmsProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteEmbmsProfileGetResult" minOccurs="0"/&gt;
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
    "embmsProfileGetResult"
})
@XmlRootElement(name = "EmbmsProfileGetResponse")
public class EmbmsProfileGetResponse {

    @XmlElement(name = "EmbmsProfileGetResult")
    protected LteEmbmsProfileGetResult embmsProfileGetResult;

    /**
     * Gets the value of the embmsProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteEmbmsProfileGetResult }
     *     
     */
    public LteEmbmsProfileGetResult getEmbmsProfileGetResult() {
        return embmsProfileGetResult;
    }

    /**
     * Sets the value of the embmsProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEmbmsProfileGetResult }
     *     
     */
    public void setEmbmsProfileGetResult(LteEmbmsProfileGetResult value) {
        this.embmsProfileGetResult = value;
    }

}
