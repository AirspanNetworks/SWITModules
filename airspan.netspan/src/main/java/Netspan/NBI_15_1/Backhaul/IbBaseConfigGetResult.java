
package Netspan.NBI_15_1.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbBaseConfigGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBridgeBaseConfigResult" type="{http://Airspan.Netspan.WebServices}IBridgeBaseConfigResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbBaseConfigGetResult", propOrder = {
    "nodeResultString",
    "iBridgeBaseConfigResult"
})
public class IbBaseConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "IBridgeBaseConfigResult")
    protected List<IBridgeBaseConfigResult> iBridgeBaseConfigResult;

    /**
     * Gets the value of the nodeResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeResultString() {
        return nodeResultString;
    }

    /**
     * Sets the value of the nodeResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeResultString(String value) {
        this.nodeResultString = value;
    }

    /**
     * Gets the value of the iBridgeBaseConfigResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBaseConfigResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBaseConfigResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBaseConfigResult }
     * 
     * 
     */
    public List<IBridgeBaseConfigResult> getIBridgeBaseConfigResult() {
        if (iBridgeBaseConfigResult == null) {
            iBridgeBaseConfigResult = new ArrayList<IBridgeBaseConfigResult>();
        }
        return this.iBridgeBaseConfigResult;
    }

}
