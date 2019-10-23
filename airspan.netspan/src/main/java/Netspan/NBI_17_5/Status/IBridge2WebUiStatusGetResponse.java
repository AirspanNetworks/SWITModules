
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="IBridge2WebUiStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2WebUiStatusGetResult" minOccurs="0"/&gt;
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
    "iBridge2WebUiStatusGetResult"
})
@XmlRootElement(name = "IBridge2WebUiStatusGetResponse")
public class IBridge2WebUiStatusGetResponse {

    @XmlElement(name = "IBridge2WebUiStatusGetResult")
    protected IBridge2WebUiStatusGetResult iBridge2WebUiStatusGetResult;

    /**
     * Gets the value of the iBridge2WebUiStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2WebUiStatusGetResult }
     *     
     */
    public IBridge2WebUiStatusGetResult getIBridge2WebUiStatusGetResult() {
        return iBridge2WebUiStatusGetResult;
    }

    /**
     * Sets the value of the iBridge2WebUiStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2WebUiStatusGetResult }
     *     
     */
    public void setIBridge2WebUiStatusGetResult(IBridge2WebUiStatusGetResult value) {
        this.iBridge2WebUiStatusGetResult = value;
    }

}
