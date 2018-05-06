
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Neighbour3gAddWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Neighbour3gAddWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThirdPartyCell" type="{http://Airspan.Netspan.WebServices}UtranCell" minOccurs="0"/>
 *         &lt;element name="HoControlState" type="{http://Airspan.Netspan.WebServices}Ho3gControlStateTypes"/>
 *         &lt;element name="IsDynamic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CsfbDefault" type="{http://Airspan.Netspan.WebServices}Ng3gCsfbDefault"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "CellNumber", required = true, type = Integer.class, nillable = true)
    protected Integer cellNumber;
    @XmlElement(name = "ThirdPartyCell")
    protected UtranCell thirdPartyCell;
    @XmlElement(name = "HoControlState", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Ho3GControlStateTypes hoControlState;
    @XmlElement(name = "IsDynamic", required = true, type = Boolean.class, nillable = true)
    protected Boolean isDynamic;
    @XmlElement(name = "CsfbDefault", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Ng3GCsfbDefault csfbDefault;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellNumber(Integer value) {
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
     *     {@link Ho3GControlStateTypes }
     *     
     */
    public Ho3GControlStateTypes getHoControlState() {
        return hoControlState;
    }

    /**
     * Sets the value of the hoControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ho3GControlStateTypes }
     *     
     */
    public void setHoControlState(Ho3GControlStateTypes value) {
        this.hoControlState = value;
    }

    /**
     * Gets the value of the isDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDynamic() {
        return isDynamic;
    }

    /**
     * Sets the value of the isDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDynamic(Boolean value) {
        this.isDynamic = value;
    }

    /**
     * Gets the value of the csfbDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Ng3GCsfbDefault }
     *     
     */
    public Ng3GCsfbDefault getCsfbDefault() {
        return csfbDefault;
    }

    /**
     * Sets the value of the csfbDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ng3GCsfbDefault }
     *     
     */
    public void setCsfbDefault(Ng3GCsfbDefault value) {
        this.csfbDefault = value;
    }

}
