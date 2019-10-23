
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteAirSonOptimizationStatusGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteAirSonOptimizationStatusGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirSonOptimizationMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TpmMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TpmStatusList" type="{http://Airspan.Netspan.WebServices}LteSonTpmStatusContainer" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringStatusList" type="{http://Airspan.Netspan.WebServices}DynamicAcBarringStatusContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteAirSonOptimizationStatusGetResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "airSonOptimizationMode",
    "tpmMode",
    "tpmStatusList",
    "dynamicAcBarringStatusList"
})
public class LteAirSonOptimizationStatusGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElementRef(name = "AirSonOptimizationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> airSonOptimizationMode;
    @XmlElementRef(name = "TpmMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> tpmMode;
    @XmlElement(name = "TpmStatusList")
    protected LteSonTpmStatusContainer tpmStatusList;
    @XmlElement(name = "DynamicAcBarringStatusList")
    protected DynamicAcBarringStatusContainer dynamicAcBarringStatusList;

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
     * Gets the value of the airSonOptimizationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAirSonOptimizationMode() {
        return airSonOptimizationMode;
    }

    /**
     * Sets the value of the airSonOptimizationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAirSonOptimizationMode(JAXBElement<EnabledDisabledStates> value) {
        this.airSonOptimizationMode = value;
    }

    /**
     * Gets the value of the tpmMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTpmMode() {
        return tpmMode;
    }

    /**
     * Sets the value of the tpmMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTpmMode(JAXBElement<EnabledDisabledStates> value) {
        this.tpmMode = value;
    }

    /**
     * Gets the value of the tpmStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonTpmStatusContainer }
     *     
     */
    public LteSonTpmStatusContainer getTpmStatusList() {
        return tpmStatusList;
    }

    /**
     * Sets the value of the tpmStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonTpmStatusContainer }
     *     
     */
    public void setTpmStatusList(LteSonTpmStatusContainer value) {
        this.tpmStatusList = value;
    }

    /**
     * Gets the value of the dynamicAcBarringStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAcBarringStatusContainer }
     *     
     */
    public DynamicAcBarringStatusContainer getDynamicAcBarringStatusList() {
        return dynamicAcBarringStatusList;
    }

    /**
     * Sets the value of the dynamicAcBarringStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAcBarringStatusContainer }
     *     
     */
    public void setDynamicAcBarringStatusList(DynamicAcBarringStatusContainer value) {
        this.dynamicAcBarringStatusList = value;
    }

}
