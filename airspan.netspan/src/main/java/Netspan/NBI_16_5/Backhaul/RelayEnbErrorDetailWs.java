
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbErrorDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnbErrorDetailWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}BaseRedirect"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://Airspan.Netspan.WebServices}EnbErrorCodes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayEnbErrorDetailWs", propOrder = {
    "errorCode"
})
public class RelayEnbErrorDetailWs
    extends BaseRedirect
{

    @XmlElementRef(name = "ErrorCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnbErrorCodes> errorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnbErrorCodes }{@code >}
     *     
     */
    public JAXBElement<EnbErrorCodes> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnbErrorCodes }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<EnbErrorCodes> value) {
        this.errorCode = value;
    }

}
