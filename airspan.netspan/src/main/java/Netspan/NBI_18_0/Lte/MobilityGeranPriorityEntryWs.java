
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityGeranPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityGeranPriorityEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}Bands" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues" minOccurs="0"/&gt;
 *         &lt;element name="CsfbPriority" type="{http://Airspan.Netspan.WebServices}CsfbPriorityGeran" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityGeranPriorityEntryWs", propOrder = {
    "arfcn",
    "band",
    "reselectionPriority",
    "csfbPriority",
    "isCsfb"
})
public class MobilityGeranPriorityEntryWs {

    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Bands> band;
    @XmlElementRef(name = "ReselectionPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionPriority;
    @XmlElementRef(name = "CsfbPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CsfbPriorityGeran> csfbPriority;
    @XmlElementRef(name = "IsCsfb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfb;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionPriority() {
        return reselectionPriority;
    }

    /**
     * Sets the value of the reselectionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionPriority(JAXBElement<String> value) {
        this.reselectionPriority = value;
    }

    /**
     * Gets the value of the csfbPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CsfbPriorityGeran }{@code >}
     *     
     */
    public JAXBElement<CsfbPriorityGeran> getCsfbPriority() {
        return csfbPriority;
    }

    /**
     * Sets the value of the csfbPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CsfbPriorityGeran }{@code >}
     *     
     */
    public void setCsfbPriority(JAXBElement<CsfbPriorityGeran> value) {
        this.csfbPriority = value;
    }

    /**
     * Gets the value of the isCsfb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfb() {
        return isCsfb;
    }

    /**
     * Sets the value of the isCsfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfb(JAXBElement<Boolean> value) {
        this.isCsfb = value;
    }

}
