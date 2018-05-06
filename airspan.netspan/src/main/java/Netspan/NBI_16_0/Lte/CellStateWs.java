
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellStateWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellStateWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellState" type="{http://Airspan.Netspan.WebServices}EnbStates"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
