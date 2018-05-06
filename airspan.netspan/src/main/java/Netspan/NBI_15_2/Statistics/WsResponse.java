
package Netspan.NBI_15_2.Statistics;

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
    StatsLteHarqResponse.class,
    StatsLteRadioResourceUtilizationResponse.class,
    StatsBsIbBaseTermRfResponse.class,
    StatsLteCellLevelRadioBearerQosResponse.class,
    StatsBsIbBaseAirInterfaceUsageResponse.class,
    StatsIb440IpResponse.class,
    StatsLteUeAssociatedLogicalS1ConnectionResponse.class,
    StatsLteRachPreamblesSentResponse.class,
    StatsBsIbBaseTermDataResponse.class,
    StatsLteIntraEnbLoadBalancingResponse.class,
    StatsLteRrcConnectionResponse.class,
    StatsLteRfMeasureResponse.class,
    StatsLteCsfbResponse.class,
    StatsLteHandoverPerTargetCellResponse.class,
    StatsLteMmeResponse.class,
    StatsLtePagingResponse.class,
    StatsBsIbBaseAirInterfaceResponse.class,
    StatsLteErabPerQciResponse.class,
    StatsLteRruPerQciResponse.class,
    StatsLteEquipmentMeasureResponse.class,
    StatsLteLiteCompResponse.class,
    StatsLteHandoverResponse.class,
    StatsIb440QosPerQciResponse.class,
    StatsIb440RfResponse.class,
    StatsLteCellLevelRadioBearerQosPerQciResponse.class,
    StatsLteMcsResponse.class,
    StatsLteRachAccessDelayResponse.class,
    StatsServerProcessResponse.class,
    StatsLtePosMeasurementsResponse.class,
    StatsBsIRelayResponse.class,
    StatsServerDiskResponse.class,
    StatsLteCarrierAggregationResponse.class,
    StatsLteEmbmsResponse.class,
    StatsLteErabResponse.class
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
