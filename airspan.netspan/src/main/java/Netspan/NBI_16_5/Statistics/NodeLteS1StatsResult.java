
package Netspan.NBI_16_5.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeLteS1StatsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeLteS1StatsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="LteS1StatsRow" type="{http://Airspan.Netspan.WebServices}LteS1StatsRowWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeLteS1StatsResult", propOrder = {
    "name",
    "nodeId",
    "nodeResult",
    "lteS1StatsRow"
})
public class NodeLteS1StatsResult {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "LteS1StatsRow")
    protected List<LteS1StatsRowWs> lteS1StatsRow;

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
     * Gets the value of the lteS1StatsRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteS1StatsRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteS1StatsRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteS1StatsRowWs }
     * 
     * 
     */
    public List<LteS1StatsRowWs> getLteS1StatsRow() {
        if (lteS1StatsRow == null) {
            lteS1StatsRow = new ArrayList<LteS1StatsRowWs>();
        }
        return this.lteS1StatsRow;
    }

}
