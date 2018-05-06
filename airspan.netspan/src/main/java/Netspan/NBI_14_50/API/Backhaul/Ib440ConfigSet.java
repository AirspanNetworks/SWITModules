
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ib440Details" type="{http://Airspan.Netspan.WebServices}Ib440DetailsSetWs" minOccurs="0"/>
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
    "nodeName",
    "ib440Details"
})
@XmlRootElement(name = "Ib440ConfigSet")
public class Ib440ConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "Ib440Details")
    protected Ib440DetailsSetWs ib440Details;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the ib440Details property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440DetailsSetWs }
     *     
     */
    public Ib440DetailsSetWs getIb440Details() {
        return ib440Details;
    }

    /**
     * Sets the value of the ib440Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440DetailsSetWs }
     *     
     */
    public void setIb440Details(Ib440DetailsSetWs value) {
        this.ib440Details = value;
    }

}
