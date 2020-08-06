
package Netspan.NBI_18_0.Server;

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
 *         &lt;element name="TrapResyncResult" type="{http://Airspan.Netspan.WebServices}TrapResyncResponse" minOccurs="0"/&gt;
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
    "trapResyncResult"
})
@XmlRootElement(name = "TrapResyncResponse")
public class TrapResyncResponse {

    @XmlElement(name = "TrapResyncResult")
    protected TrapResyncResponse2 trapResyncResult;

    /**
     * Gets the value of the trapResyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link TrapResyncResponse2 }
     *     
     */
    public TrapResyncResponse2 getTrapResyncResult() {
        return trapResyncResult;
    }

    /**
     * Sets the value of the trapResyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapResyncResponse2 }
     *     
     */
    public void setTrapResyncResult(TrapResyncResponse2 value) {
        this.trapResyncResult = value;
    }

}
