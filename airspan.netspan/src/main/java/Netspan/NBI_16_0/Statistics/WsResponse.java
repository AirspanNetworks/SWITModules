
package Netspan.NBI_16_0.Statistics;

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
    StatsLteCellLevelInterRatNeighboursResponse.class,
    StatsBsIbBaseTermRfResponse.class,
    StatsLteCellLevelRadioBearerQosResponse.class,
    StatsBsIbBaseAirInterfaceUsageResponse.class,
    StatsIb440IpResponse.class,
    StatsLteUeAssociatedLogicalS1ConnectionResponse.class,
    StatsLteIncomingHandoverResponse.class,
    StatsLteRachPreamblesSentResponse.class,
    StatsBsIbBaseTermDataResponse.class,
    StatsLteIntraEnbLoadBalancingResponse.class,
    StatsLteRrcConnectionResponse.class,
    StatsRelayPerNodeResponse.class,
    StatsLteEventsResponse.class,
    StatsLteEnbPosMeasurementsResponse.class,
    StatsLteRfMeasureResponse.class,
    StatsLteEtwsResponse.class,
    StatsLteEthernetCounterPerPortResponse.class,
    StatsLteCsfbResponse.class,
    StatsLteCmasResponse.class,
    StatsLteRrcConnectionPerEarfcnResponse.class,
    StatsLteHandoverPerTargetCellResponse.class,
    StatsRelayPerQciResponse.class,
    StatsLteMmeResponse.class,
    StatsBsIbBaseAirInterfaceResponse.class,
    StatsLtePagingResponse.class,
    StatsLteErabPerQciResponse.class,
    StatsLteRruPerQciResponse.class,
    StatsLteBhQosResponse.class,
    StatsLteEquipmentMeasureResponse.class,
    StatsLteLiteCompResponse.class,
    StatsLteHandoverResponse.class,
    StatsIb440QosPerQciResponse.class,
    StatsIb440RfResponse.class,
    StatsLteSonPerMcsResponse.class,
    StatsRelayPerNbrPciResponse.class,
    StatsLteRruPerMcsResponse.class,
    StatsLteAnrResponse.class,
    StatsLteCellLevelRadioBearerQosPerQciResponse.class,
    StatsLteMcsResponse.class,
    StatsLteRachAccessDelayResponse.class,
    StatsServerProcessResponse.class,
    StatsLtePosMeasurementsResponse.class,
    StatsLteCellLevelHoPerQciResponse.class,
    StatsServerDiskResponse.class,
    StatsLteCarrierAggregationResponse.class,
    StatsLteEmbmsResponse.class,
    StatsLteTimingAdvanceResponse.class,
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
