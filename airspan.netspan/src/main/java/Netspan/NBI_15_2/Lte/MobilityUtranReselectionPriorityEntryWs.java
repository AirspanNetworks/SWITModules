
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityUtranReselectionPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityUtranReselectionPriorityEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues" minOccurs="0"/>
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}RfProfileDuplexModes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityUtranReselectionPriorityEntryWs", propOrder = {
    "arfcn",
    "priority",
    "duplexMode"
})
public class MobilityUtranReselectionPriorityEntryWs {

    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "Priority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "DuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RfProfileDuplexModes> duplexMode;

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public JAXBElement<RfProfileDuplexModes> getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public void setDuplexMode(JAXBElement<RfProfileDuplexModes> value) {
        this.duplexMode = value;
    }

}
