
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeNLSyncStatusGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeNLSyncStatusGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="NLSyncUnavailableReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncStatusList" type="{http://Airspan.Netspan.WebServices}ArrayOfNlmScanStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeNLSyncStatusGetResult", propOrder = {
    "nodeResult",
    "nlSyncUnavailableReason",
    "nlSyncStatusList"
})
public class NodeNLSyncStatusGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "NLSyncUnavailableReason")
    protected String nlSyncUnavailableReason;
    @XmlElement(name = "NlSyncStatusList")
    protected ArrayOfNlmScanStatus nlSyncStatusList;

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
     * Gets the value of the nlSyncUnavailableReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLSyncUnavailableReason() {
        return nlSyncUnavailableReason;
    }

    /**
     * Sets the value of the nlSyncUnavailableReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLSyncUnavailableReason(String value) {
        this.nlSyncUnavailableReason = value;
    }

    /**
     * Gets the value of the nlSyncStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNlmScanStatus }
     *     
     */
    public ArrayOfNlmScanStatus getNlSyncStatusList() {
        return nlSyncStatusList;
    }

    /**
     * Sets the value of the nlSyncStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNlmScanStatus }
     *     
     */
    public void setNlSyncStatusList(ArrayOfNlmScanStatus value) {
        this.nlSyncStatusList = value;
    }

}
