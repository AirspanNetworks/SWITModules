
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
 *         &lt;element name="NmsInfoGetResult" type="{http://Airspan.Netspan.WebServices}NmsInfoResponse" minOccurs="0"/&gt;
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
    "nmsInfoGetResult"
})
@XmlRootElement(name = "NmsInfoGetResponse")
public class NmsInfoGetResponse {

    @XmlElement(name = "NmsInfoGetResult")
    protected NmsInfoResponse nmsInfoGetResult;

    /**
     * Gets the value of the nmsInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsInfoResponse }
     *     
     */
    public NmsInfoResponse getNmsInfoGetResult() {
        return nmsInfoGetResult;
    }

    /**
     * Sets the value of the nmsInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsInfoResponse }
     *     
     */
    public void setNmsInfoGetResult(NmsInfoResponse value) {
        this.nmsInfoGetResult = value;
    }

}
