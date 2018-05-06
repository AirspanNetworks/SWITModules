
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://Airspan.Netspan.WebServices}ErrorCodes"/>
 *         &lt;element name="ErrorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsResponse", propOrder = {
    "errorCode",
    "errorString"
})
@XmlSeeAlso({
    ProfileResponse.class,
    NodeActionResult.class,
    LteNeighbourResponse.class,
    ThirdPartyUtranCellGetResult.class,
    NameResult.class,
    Node3GNeighbourResponse.class,
    Lte3RdPartyResponse.class,
    LteCellAdvancedProfileGetResult.class,
    ThirdPartyUtranCellResponse.class,
    Lte3GNeighbourResponse.class,
    LteNeighbourListResult.class,
    CallTraceProfileGetResult.class,
    LteEmbmsProfileGetResult.class,
    LteAdvancedProfileGetResult.class,
    MultiCellProfileGetResult.class,
    EnbStateGetResult.class,
    LteNbrConfigResponse.class,
    RelayEnbPnpConfigGetResult.class,
    LteManagementProfileGetResult.class,
    NodeAlarmResult.class,
    LteSecurityProfileGetResult.class,
    LteNeighbourProfileGetResult.class,
    LteRadioProfileGetResult.class,
    LteSonProfileGetResult.class,
    LteNetworkProfileGetResult.class,
    RelayEnodeBConfigGetResult.class,
    NodeListResult.class,
    TrafficManagementProfileGetResult.class,
    Lte3RdPartyGetResult.class,
    LteMobilityProfileGetResult.class,
    LteSyncProfileGetResult.class,
    NodeEnodebIdResult.class,
    LtePnpConfigGetResult.class,
    LteEnbConfigGetResult.class,
    UnityPnpConfigGetResult.class,
    LteSystemDefaultGetResult.class,
    LteAnrNeighbourResponse.class
})
public class WsResponse {

    @XmlElement(name = "ErrorCode", required = true)
    @XmlSchemaType(name = "string")
    protected ErrorCodes errorCode;
    @XmlElement(name = "ErrorString")
    protected String errorString;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCodes }
     *     
     */
    public ErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCodes }
     *     
     */
    public void setErrorCode(ErrorCodes value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

}
