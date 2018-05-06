
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Node3gStaticNeighbour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Node3gStaticNeighbour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cell3gNeighbours" type="{http://Airspan.Netspan.WebServices}Cell3gNeighbour" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node3gStaticNeighbour", propOrder = {
    "nodeName",
    "cell3GNeighbours"
})
public class Node3GStaticNeighbour {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "Cell3gNeighbours")
    protected List<Cell3GNeighbour> cell3GNeighbours;

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
     * Gets the value of the cell3GNeighbours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell3GNeighbours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell3GNeighbours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cell3GNeighbour }
     * 
     * 
     */
    public List<Cell3GNeighbour> getCell3GNeighbours() {
        if (cell3GNeighbours == null) {
            cell3GNeighbours = new ArrayList<Cell3GNeighbour>();
        }
        return this.cell3GNeighbours;
    }

}
