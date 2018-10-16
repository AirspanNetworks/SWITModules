
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteTwampGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteTwampGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TwampReflector" type="{http://Airspan.Netspan.WebServices}LteTwampReflectorList" minOccurs="0"/&gt;
 *         &lt;element name="TwampSender" type="{http://Airspan.Netspan.WebServices}LteTwampSenderWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteTwampGetResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "twampReflector",
    "twampSender"
})
public class LteTwampGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "TwampReflector")
    protected LteTwampReflectorList twampReflector;
    @XmlElement(name = "TwampSender")
    protected LteTwampSenderWs twampSender;

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
     * Gets the value of the twampReflector property.
     * 
     * @return
     *     possible object is
     *     {@link LteTwampReflectorList }
     *     
     */
    public LteTwampReflectorList getTwampReflector() {
        return twampReflector;
    }

    /**
     * Sets the value of the twampReflector property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteTwampReflectorList }
     *     
     */
    public void setTwampReflector(LteTwampReflectorList value) {
        this.twampReflector = value;
    }

    /**
     * Gets the value of the twampSender property.
     * 
     * @return
     *     possible object is
     *     {@link LteTwampSenderWs }
     *     
     */
    public LteTwampSenderWs getTwampSender() {
        return twampSender;
    }

    /**
     * Sets the value of the twampSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteTwampSenderWs }
     *     
     */
    public void setTwampSender(LteTwampSenderWs value) {
        this.twampSender = value;
    }

}
