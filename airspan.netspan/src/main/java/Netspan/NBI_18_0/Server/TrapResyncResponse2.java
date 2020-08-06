
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapResyncResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapResyncResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrapResyncResultList" type="{http://Airspan.Netspan.WebServices}TrapResyncResultListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapResyncResponse", propOrder = {
    "trapResyncResultList"
})
public class TrapResyncResponse2
    extends WsResponse
{

    @XmlElement(name = "TrapResyncResultList")
    protected TrapResyncResultListContainer trapResyncResultList;

    /**
     * Gets the value of the trapResyncResultList property.
     * 
     * @return
     *     possible object is
     *     {@link TrapResyncResultListContainer }
     *     
     */
    public TrapResyncResultListContainer getTrapResyncResultList() {
        return trapResyncResultList;
    }

    /**
     * Sets the value of the trapResyncResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapResyncResultListContainer }
     *     
     */
    public void setTrapResyncResultList(TrapResyncResultListContainer value) {
        this.trapResyncResultList = value;
    }

}
