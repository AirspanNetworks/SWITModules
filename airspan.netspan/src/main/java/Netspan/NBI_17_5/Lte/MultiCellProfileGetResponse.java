
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiCellProfileGetResult" type="{http://Airspan.Netspan.WebServices}MultiCellProfileGetResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiCellProfileGetResult"
})
@XmlRootElement(name = "MultiCellProfileGetResponse")
public class MultiCellProfileGetResponse {

    @XmlElement(name = "MultiCellProfileGetResult")
    protected MultiCellProfileGetResult multiCellProfileGetResult;

    /**
     * Gets the value of the multiCellProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCellProfileGetResult }
     *     
     */
    public MultiCellProfileGetResult getMultiCellProfileGetResult() {
        return multiCellProfileGetResult;
    }

    /**
     * Sets the value of the multiCellProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCellProfileGetResult }
     *     
     */
    public void setMultiCellProfileGetResult(MultiCellProfileGetResult value) {
        this.multiCellProfileGetResult = value;
    }

}
