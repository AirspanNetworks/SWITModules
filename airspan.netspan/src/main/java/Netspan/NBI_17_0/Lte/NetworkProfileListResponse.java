
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
 *         &lt;element name="NetworkProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "networkProfileListResult"
})
@XmlRootElement(name = "NetworkProfileListResponse")
public class NetworkProfileListResponse {

    @XmlElement(name = "NetworkProfileListResult")
    protected NameResult networkProfileListResult;

    /**
     * Gets the value of the networkProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getNetworkProfileListResult() {
        return networkProfileListResult;
    }

    /**
     * Sets the value of the networkProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setNetworkProfileListResult(NameResult value) {
        this.networkProfileListResult = value;
    }

}
