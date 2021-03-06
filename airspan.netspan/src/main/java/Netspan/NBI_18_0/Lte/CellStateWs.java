
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnbStates;


/**
 * <p>Java class for CellStateWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellStateWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CellState" type="{http://Airspan.Netspan.WebServices}EnbStates"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellStateWs", propOrder = {
    "cellNumber",
    "cellState"
})
public class CellStateWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "CellState", required = true)
    @XmlSchemaType(name = "string")
    protected EnbStates cellState;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the cellState property.
     * 
     * @return
     *     possible object is
     *     {@link EnbStates }
     *     
     */
    public EnbStates getCellState() {
        return cellState;
    }

    /**
     * Sets the value of the cellState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStates }
     *     
     */
    public void setCellState(EnbStates value) {
        this.cellState = value;
    }

}
