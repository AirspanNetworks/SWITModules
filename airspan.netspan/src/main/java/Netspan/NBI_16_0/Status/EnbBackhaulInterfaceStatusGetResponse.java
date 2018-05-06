
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbBackhaulInterfaceStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteBackhaulIfGetResult" minOccurs="0"/>
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
    "enbBackhaulInterfaceStatusGetResult"
})
@XmlRootElement(name = "EnbBackhaulInterfaceStatusGetResponse")
public class EnbBackhaulInterfaceStatusGetResponse {

    @XmlElement(name = "EnbBackhaulInterfaceStatusGetResult")
    protected LteBackhaulIfGetResult enbBackhaulInterfaceStatusGetResult;

    /**
     * Gets the value of the enbBackhaulInterfaceStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteBackhaulIfGetResult }
     *     
     */
    public LteBackhaulIfGetResult getEnbBackhaulInterfaceStatusGetResult() {
        return enbBackhaulInterfaceStatusGetResult;
    }

    /**
     * Sets the value of the enbBackhaulInterfaceStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteBackhaulIfGetResult }
     *     
     */
    public void setEnbBackhaulInterfaceStatusGetResult(LteBackhaulIfGetResult value) {
        this.enbBackhaulInterfaceStatusGetResult = value;
    }

}
