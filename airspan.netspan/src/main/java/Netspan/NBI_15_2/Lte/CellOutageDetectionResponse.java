
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="CellOutageDetectionResult" type="{http://Airspan.Netspan.WebServices}NodeAlarmResult" minOccurs="0"/&gt;
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
    "cellOutageDetectionResult"
})
@XmlRootElement(name = "CellOutageDetectionResponse")
public class CellOutageDetectionResponse {

    @XmlElement(name = "CellOutageDetectionResult")
    protected NodeAlarmResult cellOutageDetectionResult;

    /**
     * Gets the value of the cellOutageDetectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeAlarmResult }
     *     
     */
    public NodeAlarmResult getCellOutageDetectionResult() {
        return cellOutageDetectionResult;
    }

    /**
     * Sets the value of the cellOutageDetectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeAlarmResult }
     *     
     */
    public void setCellOutageDetectionResult(NodeAlarmResult value) {
        this.cellOutageDetectionResult = value;
    }

}
