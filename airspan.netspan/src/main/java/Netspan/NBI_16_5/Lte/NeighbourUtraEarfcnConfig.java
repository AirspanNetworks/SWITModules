
package Netspan.NBI_16_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourUtraEarfcnConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourUtraEarfcnConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoType" type="{http://Airspan.Netspan.WebServices}UtraHoTypes" minOccurs="0"/&gt;
 *         &lt;element name="Psc" type="{http://Airspan.Netspan.WebServices}NeighbourUtraPciWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourUtraEarfcnConfig", propOrder = {
    "arfcn",
    "hoType",
    "psc"
})
public class NeighbourUtraEarfcnConfig {

    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "HoType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UtraHoTypes> hoType;
    @XmlElement(name = "Psc")
    protected List<NeighbourUtraPciWs> psc;

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
     * Gets the value of the hoType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UtraHoTypes }{@code >}
     *     
     */
    public JAXBElement<UtraHoTypes> getHoType() {
        return hoType;
    }

    /**
     * Sets the value of the hoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UtraHoTypes }{@code >}
     *     
     */
    public void setHoType(JAXBElement<UtraHoTypes> value) {
        this.hoType = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourUtraPciWs }
     * 
     * 
     */
    public List<NeighbourUtraPciWs> getPsc() {
        if (psc == null) {
            psc = new ArrayList<NeighbourUtraPciWs>();
        }
        return this.psc;
    }

}
