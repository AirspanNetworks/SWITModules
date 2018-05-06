
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityGeranPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityGeranPriorityEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}Bands" minOccurs="0"/>
 *         &lt;element name="ReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues"/>
 *         &lt;element name="CsfbPriority" type="{http://Airspan.Netspan.WebServices}CsfbPriorityGeran"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityGeranPriorityEntryWs", propOrder = {
    "arfcn",
    "band",
    "reselectionPriority",
    "csfbPriority"
})
public class MobilityGeranPriorityEntryWs {

    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Bands> band;
    @XmlElement(name = "ReselectionPriority", required = true, nillable = true)
    protected String reselectionPriority;
    @XmlElement(name = "CsfbPriority", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CsfbPriorityGeran csfbPriority;

    /**
     * Gets the value of the arfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setArfcn(JAXBElement<Integer> value) {
        this.arfcn = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public JAXBElement<Bands> getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public void setBand(JAXBElement<Bands> value) {
        this.band = value;
    }

    /**
     * Gets the value of the reselectionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReselectionPriority() {
        return reselectionPriority;
    }

    /**
     * Sets the value of the reselectionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReselectionPriority(String value) {
        this.reselectionPriority = value;
    }

    /**
     * Gets the value of the csfbPriority property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbPriorityGeran }
     *     
     */
    public CsfbPriorityGeran getCsfbPriority() {
        return csfbPriority;
    }

    /**
     * Sets the value of the csfbPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbPriorityGeran }
     *     
     */
    public void setCsfbPriority(CsfbPriorityGeran value) {
        this.csfbPriority = value;
    }

}
