
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellStateGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellStateGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CellState" type="{http://Airspan.Netspan.WebServices}EnbStatesGet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellStateGetWs", propOrder = {
    "cellNumber",
    "cellState"
})
public class CellStateGetWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "CellState", required = true)
    @XmlSchemaType(name = "string")
    protected EnbStatesGet cellState;

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
     *     {@link EnbStatesGet }
     *     
     */
    public EnbStatesGet getCellState() {
        return cellState;
    }

    /**
     * Sets the value of the cellState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStatesGet }
     *     
     */
    public void setCellState(EnbStatesGet value) {
        this.cellState = value;
    }

}
