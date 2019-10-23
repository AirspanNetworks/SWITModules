
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityUtranPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityUtranPriorityEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}DuplexModeTypes" minOccurs="0"/&gt;
 *         &lt;element name="CsfbRedirectPriority" type="{http://Airspan.Netspan.WebServices}CsfbRedirectPriorityUtran" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityUtranPriorityEntryWs", propOrder = {
    "arfcn",
    "duplexMode",
    "csfbRedirectPriority",
    "reselectionPriority"
})
public class MobilityUtranPriorityEntryWs {

    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "DuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DuplexModeTypes> duplexMode;
    @XmlElementRef(name = "CsfbRedirectPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csfbRedirectPriority;
    @XmlElementRef(name = "ReselectionPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionPriority;

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
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DuplexModeTypes }{@code >}
     *     
     */
    public JAXBElement<DuplexModeTypes> getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DuplexModeTypes }{@code >}
     *     
     */
    public void setDuplexMode(JAXBElement<DuplexModeTypes> value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the csfbRedirectPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsfbRedirectPriority() {
        return csfbRedirectPriority;
    }

    /**
     * Sets the value of the csfbRedirectPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsfbRedirectPriority(JAXBElement<String> value) {
        this.csfbRedirectPriority = value;
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

}
