
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="NeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeCellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NeighbourCellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "neighbourName",
    "nodeCellNumber",
    "neighbourCellNumber"
})
@XmlRootElement(name = "LteNeighbourDelete")
public class LteNeighbourDelete {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NeighbourName")
    protected String neighbourName;
    @XmlElement(name = "NodeCellNumber", required = true, type = Integer.class, nillable = true)
    protected Integer nodeCellNumber;
    @XmlElement(name = "NeighbourCellNumber", required = true, type = Integer.class, nillable = true)
    protected Integer neighbourCellNumber;

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
     * Gets the value of the neighbourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourName() {
        return neighbourName;
    }

    /**
     * Sets the value of the neighbourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourName(String value) {
        this.neighbourName = value;
    }

    /**
     * Gets the value of the nodeCellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNodeCellNumber() {
        return nodeCellNumber;
    }

    /**
     * Sets the value of the nodeCellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNodeCellNumber(Integer value) {
        this.nodeCellNumber = value;
    }

    /**
     * Gets the value of the neighbourCellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeighbourCellNumber() {
        return neighbourCellNumber;
    }

    /**
     * Sets the value of the neighbourCellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeighbourCellNumber(Integer value) {
        this.neighbourCellNumber = value;
    }

}
