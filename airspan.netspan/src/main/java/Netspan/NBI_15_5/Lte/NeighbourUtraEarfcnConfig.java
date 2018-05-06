
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourUtraEarfcnConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourUtraEarfcnConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoType" type="{http://Airspan.Netspan.WebServices}UtraHoTypes"/>
 *         &lt;element name="Psc" type="{http://Airspan.Netspan.WebServices}NeighbourUtraPciWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "Arfcn", required = true, type = Integer.class, nillable = true)
    protected Integer arfcn;
    @XmlElement(name = "HoType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected UtraHoTypes hoType;
    @XmlElement(name = "Psc")
    protected List<NeighbourUtraPciWs> psc;

    /**
     * Gets the value of the arfcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArfcn(Integer value) {
        this.arfcn = value;
    }

    /**
     * Gets the value of the hoType property.
     * 
     * @return
     *     possible object is
     *     {@link UtraHoTypes }
     *     
     */
    public UtraHoTypes getHoType() {
        return hoType;
    }

    /**
     * Sets the value of the hoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtraHoTypes }
     *     
     */
    public void setHoType(UtraHoTypes value) {
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
