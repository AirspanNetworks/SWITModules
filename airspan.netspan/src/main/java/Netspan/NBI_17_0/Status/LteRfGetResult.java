
package Netspan.NBI_17_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRfGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRfGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfStatus" type="{http://Airspan.Netspan.WebServices}LteRfStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CellAcBarringStatus" type="{http://Airspan.Netspan.WebServices}CellAcBarringStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LimitedTxPowerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRfGetResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "rfStatus",
    "cellAcBarringStatus",
    "limitedTxPowerMessage"
})
public class LteRfGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "RfStatus")
    protected List<LteRfStatusWs> rfStatus;
    @XmlElement(name = "CellAcBarringStatus")
    protected List<CellAcBarringStatusWs> cellAcBarringStatus;
    @XmlElement(name = "LimitedTxPowerMessage")
    protected String limitedTxPowerMessage;

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
     * Gets the value of the rfStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteRfStatusWs }
     * 
     * 
     */
    public List<LteRfStatusWs> getRfStatus() {
        if (rfStatus == null) {
            rfStatus = new ArrayList<LteRfStatusWs>();
        }
        return this.rfStatus;
    }

    /**
     * Gets the value of the cellAcBarringStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellAcBarringStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellAcBarringStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellAcBarringStatusWs }
     * 
     * 
     */
    public List<CellAcBarringStatusWs> getCellAcBarringStatus() {
        if (cellAcBarringStatus == null) {
            cellAcBarringStatus = new ArrayList<CellAcBarringStatusWs>();
        }
        return this.cellAcBarringStatus;
    }

    /**
     * Gets the value of the limitedTxPowerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedTxPowerMessage() {
        return limitedTxPowerMessage;
    }

    /**
     * Sets the value of the limitedTxPowerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedTxPowerMessage(String value) {
        this.limitedTxPowerMessage = value;
    }

}
