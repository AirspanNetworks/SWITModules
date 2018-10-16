
package Netspan.NBI_16_5.Server;

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
 *         &lt;element name="SasServer" type="{http://Airspan.Netspan.WebServices}SasServerSet" minOccurs="0"/&gt;
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
    "sasServer"
})
@XmlRootElement(name = "SasServerSet")
public class SasServerSet {

    @XmlElement(name = "SasServer")
    protected SasServerSet2 sasServer;

    /**
     * Gets the value of the sasServer property.
     * 
     * @return
     *     possible object is
     *     {@link SasServerSet2 }
     *     
     */
    public SasServerSet2 getSasServer() {
        return sasServer;
    }

    /**
     * Sets the value of the sasServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SasServerSet2 }
     *     
     */
    public void setSasServer(SasServerSet2 value) {
        this.sasServer = value;
    }

}
