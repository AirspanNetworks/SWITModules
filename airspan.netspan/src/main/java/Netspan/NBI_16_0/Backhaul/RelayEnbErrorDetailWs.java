
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbErrorDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnbErrorDetailWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}BaseRedirect">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://Airspan.Netspan.WebServices}EnbErrorCodes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "ErrorCode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnbErrorCodes errorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnbErrorCodes }
     *     
     */
    public EnbErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbErrorCodes }
     *     
     */
    public void setErrorCode(EnbErrorCodes value) {
        this.errorCode = value;
    }

}
