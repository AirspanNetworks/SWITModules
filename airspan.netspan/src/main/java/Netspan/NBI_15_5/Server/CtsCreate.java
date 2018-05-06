
package Netspan.NBI_15_5.Server;

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
 *         &lt;element name="Cts" type="{http://Airspan.Netspan.WebServices}CtsSetWs" minOccurs="0"/>
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
    "cts"
})
@XmlRootElement(name = "CtsCreate")
public class CtsCreate {

    @XmlElement(name = "Cts")
    protected CtsSetWs cts;

    /**
     * Gets the value of the cts property.
     * 
     * @return
     *     possible object is
     *     {@link CtsSetWs }
     *     
     */
    public CtsSetWs getCts() {
        return cts;
    }

    /**
     * Sets the value of the cts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtsSetWs }
     *     
     */
    public void setCts(CtsSetWs value) {
        this.cts = value;
    }

}
