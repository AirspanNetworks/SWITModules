
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnbState" type="{http://Airspan.Netspan.WebServices}EnbStates"/>
 *         &lt;element name="CellState" type="{http://Airspan.Netspan.WebServices}CellStateWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "enbState",
    "cellState"
})
@XmlRootElement(name = "EnbStateSet")
public class EnbStateSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "EnbState", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnbStates enbState;
    @XmlElement(name = "CellState")
    protected List<CellStateWs> cellState;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the enbState property.
     * 
     * @return
     *     possible object is
     *     {@link EnbStates }
     *     
     */
    public EnbStates getEnbState() {
        return enbState;
    }

    /**
     * Sets the value of the enbState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStates }
     *     
     */
    public void setEnbState(EnbStates value) {
        this.enbState = value;
    }

    /**
     * Gets the value of the cellState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellStateWs }
     * 
     * 
     */
    public List<CellStateWs> getCellState() {
        if (cellState == null) {
            cellState = new ArrayList<CellStateWs>();
        }
        return this.cellState;
    }

}
