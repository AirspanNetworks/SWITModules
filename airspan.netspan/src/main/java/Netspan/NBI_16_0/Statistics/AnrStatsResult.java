
package Netspan.NBI_16_0.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnrStatsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnrStatsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/>
 *         &lt;element name="AnrStatsRow" type="{http://Airspan.Netspan.WebServices}LteAnrStatsRowWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnrStatsResult", propOrder = {
    "name",
    "nodeId",
    "nodeResult",
    "anrStatsRow"
})
public class AnrStatsResult {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "AnrStatsRow")
    protected List<LteAnrStatsRowWs> anrStatsRow;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the nodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeStatusResultValues }
     *     
     */
    public NodeStatusResultValues getNodeResult() {
        return nodeResult;
    }

    /**
     * Sets the value of the nodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeStatusResultValues }
     *     
     */
    public void setNodeResult(NodeStatusResultValues value) {
        this.nodeResult = value;
    }

    /**
     * Gets the value of the anrStatsRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anrStatsRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnrStatsRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteAnrStatsRowWs }
     * 
     * 
     */
    public List<LteAnrStatsRowWs> getAnrStatsRow() {
        if (anrStatsRow == null) {
            anrStatsRow = new ArrayList<LteAnrStatsRowWs>();
        }
        return this.anrStatsRow;
    }

}
