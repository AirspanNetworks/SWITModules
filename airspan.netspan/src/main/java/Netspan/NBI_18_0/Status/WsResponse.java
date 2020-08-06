
package Netspan.NBI_18_0.Status;

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
    NodeSensorGetResult.class,
    NodeGpsGetResult.class,
    Ibridge2GpsGetResult.class,
    NodePtpGetResult.class,
    LteRfGetResult.class,
    LteCellAcBarringGetResult.class,
    LteSonPciGetResult.class,
    LteSonTpmGetResult.class,
    LteAirSonOptimizationStatusGetResult.class,
    LteSonAnrGetResult.class,
    LteSonRsiGetResult.class,
    LteSonRachGetResult.class,
    LteSonDynamicIcicGetResult.class,
    LteSonDynamicIcicUnmanagedInterferenceGetResult.class,
    LteSonMcimGetResult.class,
    LteUeGetResult.class,
    LteIpThroughputGetResult.class,
    LteBackhaulIfGetResult.class,
    NodeSoftwareGetResult.class,
    NodeEmbmsGetResult.class,
    LteWifiGetResult.class,
    RelayEnbWifiGetResult.class,
    LteNetworkElementGetResult.class,
    EnbUtraNeighbourStatusGetResult.class,
    LteCbrsGetResult.class,
    LteBhQosGetResult.class,
    EnbResetRequiredStatusGetResult.class,
    LteTwampGetResult.class,
    LteMaintenanceWindowGetResult.class,
    LteEthernetPerPortStatusGetResult.class,
    LteSfpStatusGetResult.class,
    LteCachedAnrListResult.class,
    LteCellStatusCachedListResult.class,
    NodeCachedLocationStatusGetListResult.class,
    Ib440CommissionedPropertiesGetResult.class,
    Ib440RfGetResult.class,
    Ib440InterfaceGetResult.class,
    IBridge2InterfaceGetResult.class,
    IBridgeBaseRfGetResult.class,
    IBridgeTermRfGetResult.class,
    IBridge2WebUiStatusGetResult.class,
    IBridge2CommissionedPropertiesGetResult.class,
    IBridge2ChannelAndPowerStatusGetResult.class,
    IBridge2OverviewStatusGetResult.class,
    RelayStatusGetResult.class,
    RelayDonorCellListGetResult.class,
    LocationAndSyncStatusResult.class,
    NodeNLSyncStatusGetResult.class,
    NodeTimeStatusGetResult.class,
    LteCellStatusCachedGetResult.class,
    NodeCachedLocationStatusGetResult.class,
    IBridge2WebUiStatusResult.class,
    RelayStatusResult.class,
    RelayDonorCellListResult.class
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
