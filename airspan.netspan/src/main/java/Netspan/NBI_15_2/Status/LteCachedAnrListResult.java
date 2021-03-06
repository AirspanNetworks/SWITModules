
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCachedAnrListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCachedAnrListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SonAnrList" type="{http://Airspan.Netspan.WebServices}ArrayOfLteSonAnrGetResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCachedAnrListResult", propOrder = {
    "sonAnrList"
})
public class LteCachedAnrListResult
    extends WsResponse
{

    @XmlElement(name = "SonAnrList")
    protected ArrayOfLteSonAnrGetResult sonAnrList;

    /**
     * Gets the value of the sonAnrList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLteSonAnrGetResult }
     *     
     */
    public ArrayOfLteSonAnrGetResult getSonAnrList() {
        return sonAnrList;
    }

    /**
     * Sets the value of the sonAnrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLteSonAnrGetResult }
     *     
     */
    public void setSonAnrList(ArrayOfLteSonAnrGetResult value) {
        this.sonAnrList = value;
    }

}
