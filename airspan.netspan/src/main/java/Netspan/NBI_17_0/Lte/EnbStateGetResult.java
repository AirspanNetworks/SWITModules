
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbStateGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbStateGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnbStateGetResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/&gt;
 *         &lt;element name="EnbStateGetResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eNodeB" type="{http://Airspan.Netspan.WebServices}EnbStateGetWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbStateGetResult", propOrder = {
    "enbStateGetResultCode",
    "enbStateGetResultString",
    "eNodeB",
    "nodeResult"
})
public class EnbStateGetResult
    extends WsResponse
{

    @XmlElement(name = "EnbStateGetResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues enbStateGetResultCode;
    @XmlElement(name = "EnbStateGetResultString")
    protected String enbStateGetResultString;
    protected List<EnbStateGetWs> eNodeB;
    @XmlElement(name = "NodeResult")
    protected List<NodeResult> nodeResult;

    /**
     * Gets the value of the enbStateGetResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getEnbStateGetResultCode() {
        return enbStateGetResultCode;
    }

    /**
     * Sets the value of the enbStateGetResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setEnbStateGetResultCode(NodeResultValues value) {
        this.enbStateGetResultCode = value;
    }

    /**
     * Gets the value of the enbStateGetResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnbStateGetResultString() {
        return enbStateGetResultString;
    }

    /**
     * Sets the value of the enbStateGetResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnbStateGetResultString(String value) {
        this.enbStateGetResultString = value;
    }

    /**
     * Gets the value of the eNodeB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eNodeB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENodeB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnbStateGetWs }
     * 
     * 
     */
    public List<EnbStateGetWs> getENodeB() {
        if (eNodeB == null) {
            eNodeB = new ArrayList<EnbStateGetWs>();
        }
        return this.eNodeB;
    }

    /**
     * Gets the value of the nodeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeResult }
     * 
     * 
     */
    public List<NodeResult> getNodeResult() {
        if (nodeResult == null) {
            nodeResult = new ArrayList<NodeResult>();
        }
        return this.nodeResult;
    }

}
