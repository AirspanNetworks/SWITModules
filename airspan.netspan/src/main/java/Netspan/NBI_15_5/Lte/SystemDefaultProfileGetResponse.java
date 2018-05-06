
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemDefaultProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteSystemDefaultGetResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemDefaultProfileGetResult"
})
@XmlRootElement(name = "SystemDefaultProfileGetResponse")
public class SystemDefaultProfileGetResponse {

    @XmlElement(name = "SystemDefaultProfileGetResult")
    protected LteSystemDefaultGetResult systemDefaultProfileGetResult;

    /**
     * Gets the value of the systemDefaultProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSystemDefaultGetResult }
     *     
     */
    public LteSystemDefaultGetResult getSystemDefaultProfileGetResult() {
        return systemDefaultProfileGetResult;
    }

    /**
     * Sets the value of the systemDefaultProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSystemDefaultGetResult }
     *     
     */
    public void setSystemDefaultProfileGetResult(LteSystemDefaultGetResult value) {
        this.systemDefaultProfileGetResult = value;
    }

}
