
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Neighbour3gAddWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Neighbour3gAddWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyCell" type="{http://Airspan.Netspan.WebServices}UtranCell" minOccurs="0"/&gt;
 *         &lt;element name="HoControlState" type="{http://Airspan.Netspan.WebServices}Ho3gControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CsfbDefault" type="{http://Airspan.Netspan.WebServices}Ng3gCsfbDefault" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neighbour3gAddWs", propOrder = {
    "cellNumber",
    "thirdPartyCell",
    "hoControlState",
    "isDynamic",
    "csfbDefault"
})
public class Neighbour3GAddWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElement(name = "ThirdPartyCell")
    protected UtranCell thirdPartyCell;
    @XmlElementRef(name = "HoControlState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ho3GControlStateTypes> hoControlState;
    @XmlElementRef(name = "IsDynamic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamic;
    @XmlElementRef(name = "CsfbDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ng3GCsfbDefault> csfbDefault;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<Integer> value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the thirdPartyCell property.
     * 
     * @return
     *     possible object is
     *     {@link UtranCell }
     *     
     */
    public UtranCell getThirdPartyCell() {
        return thirdPartyCell;
    }

    /**
     * Sets the value of the thirdPartyCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranCell }
     *     
     */
    public void setThirdPartyCell(UtranCell value) {
        this.thirdPartyCell = value;
    }

    /**
     * Gets the value of the hoControlState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ho3GControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<Ho3GControlStateTypes> getHoControlState() {
        return hoControlState;
    }

    /**
     * Sets the value of the hoControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ho3GControlStateTypes }{@code >}
     *     
     */
    public void setHoControlState(JAXBElement<Ho3GControlStateTypes> value) {
        this.hoControlState = value;
    }

    /**
     * Gets the value of the isDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamic() {
        return isDynamic;
    }

    /**
     * Sets the value of the isDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamic(JAXBElement<Boolean> value) {
        this.isDynamic = value;
    }

    /**
     * Gets the value of the csfbDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ng3GCsfbDefault }{@code >}
     *     
     */
    public JAXBElement<Ng3GCsfbDefault> getCsfbDefault() {
        return csfbDefault;
    }

    /**
     * Sets the value of the csfbDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ng3GCsfbDefault }{@code >}
     *     
     */
    public void setCsfbDefault(JAXBElement<Ng3GCsfbDefault> value) {
        this.csfbDefault = value;
    }

}
