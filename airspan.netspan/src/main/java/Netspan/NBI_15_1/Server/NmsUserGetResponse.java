
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
 *         &lt;element name="NmsUserGetResult" type="{http://Airspan.Netspan.WebServices}NmsUserGetResult" minOccurs="0"/>
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
    "nmsUserGetResult"
})
@XmlRootElement(name = "NmsUserGetResponse")
public class NmsUserGetResponse {

    @XmlElement(name = "NmsUserGetResult")
    protected NmsUserGetResult nmsUserGetResult;

    /**
     * Gets the value of the nmsUserGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsUserGetResult }
     *     
     */
    public NmsUserGetResult getNmsUserGetResult() {
        return nmsUserGetResult;
    }

    /**
     * Sets the value of the nmsUserGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsUserGetResult }
     *     
     */
    public void setNmsUserGetResult(NmsUserGetResult value) {
        this.nmsUserGetResult = value;
    }

}
