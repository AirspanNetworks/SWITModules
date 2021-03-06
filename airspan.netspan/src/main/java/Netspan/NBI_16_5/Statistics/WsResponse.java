
package Netspan.NBI_16_5.Statistics;

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
 * &lt;complexType name="WsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://Airspan.Netspan.WebServices}ErrorCodes"/&gt;
 *         &lt;element name="ErrorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    StatsLteRsrpMeasurementResponse.class,
    StatsLteRsrqMeasurementResponse.class,
    StatsLtePerPlmnResponse.class,
    StatsLtePerPlmnPerQciResponse.class,
    StatsLteRachPreamblesSentResponse.class,
    StatsLteCmasResponse.class,
    StatsLteSonResponse.class,
    StatsLteEtwsResponse.class,
    StatsLteCellLevelInterRatNeighboursResponse.class,
    StatsLteCellLevelHoPerQciResponse.class,
    StatsIb440RfResponse.class,
    StatsIb440IpResponse.class,
    StatsIb440QosPerQciResponse.class,
    StatsBsIbBaseAirInterfaceResponse.class,
    StatsBsIbBaseAirInterfaceUsageResponse.class,
    StatsBsIbBaseTermDataResponse.class,
    StatsBsIbBaseTermRfResponse.class,
    StatsServerProcessResponse.class,
    StatsServerDiskResponse.class,
    StatsRelayPerNodeResponse.class,
    StatsRelayPerNbrPciResponse.class,
    StatsRelayPerQciResponse.class,
    StatsRelayPerMcsResponse.class,
    StatsRelayPdnAvailabilityPerApnResponse.class,
    StatsLteEthernetCounterPerPortResponse.class,
    StatsLteTimingAdvanceResponse.class,
    StatsLteEventsResponse.class,
    StatsLteEnbPosMeasurementsResponse.class,
    StatsLteAnrResponse.class,
    StatsLteCellLevelSubBandCqiResponse.class,
    StatsLteVolteQualityResponse.class,
    StatsLteGtpResponse.class,
    StatsLteUeAssociatedLogicalS1ConnectionResponse.class,
    StatsLteCellLevelRadioBearerQosResponse.class,
    StatsLteCellLevelRadioBearerQosPerQciResponse.class,
    StatsLteErabResponse.class,
    StatsLteErabPerQciResponse.class,
    StatsLteHandoverResponse.class,
    StatsLteIncomingHandoverResponse.class,
    StatsLteHandoverPerTargetCellResponse.class,
    StatsLteRadioResourceUtilizationResponse.class,
    StatsLteRrcConnectionResponse.class,
    StatsLteRrcConnectionPerEarfcnResponse.class,
    StatsLteRruPerQciResponse.class,
    StatsLtePosMeasurementsResponse.class,
    StatsLteLiteCompResponse.class,
    StatsLteEquipmentMeasureResponse.class,
    StatsLteBhQosResponse.class,
    StatsLteRfMeasureResponse.class,
    StatsLteCarrierAggregationResponse.class,
    StatsLtePagingResponse.class,
    StatsLteCsfbResponse.class,
    StatsLteEmbmsResponse.class,
    StatsLteHarqResponse.class,
    StatsLteIntraEnbLoadBalancingResponse.class,
    StatsLteMcsResponse.class,
    StatsLteRruPerMcsResponse.class,
    StatsLteSonPerMcsResponse.class,
    StatsLteMmeResponse.class,
    StatsLteRachAccessDelayResponse.class
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
