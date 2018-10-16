
package Netspan.NBI_16_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteS1StatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteS1StatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwFailInRadioInterfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabRNwFailUENotAvailForPSService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwInteractionWitOtherProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwRedirectionTowards1xRTT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwNotSupportedQCIVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailRNwInvalidQosComb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailTPTransportResunavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailTPUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailNasCSGSubscriptionExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailNasAuthenticationfail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscCtrlProcOvld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscNotEnoughUpResAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscHwErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscOAMInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailMiscUnknownPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnestabFailSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeAssocS1ConnEstabSuccDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteS1StatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "ueAssocS1ConnEstabAtt",
    "ueAssocS1ConnEstabSucc",
    "ueAssocS1ConnestabFailRNwUnspecified",
    "ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys",
    "ueAssocS1ConnestabFailRNwFailInRadioInterfProc",
    "ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId",
    "ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId",
    "ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId",
    "ueAssocS1ConnestabRNwFailUENotAvailForPSService",
    "ueAssocS1ConnestabFailRNwInteractionWitOtherProc",
    "ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT",
    "ueAssocS1ConnestabFailRNwNotSupportedQCIVal",
    "ueAssocS1ConnestabFailRNwInvalidQosComb",
    "ueAssocS1ConnestabFailTPTransportResunavail",
    "ueAssocS1ConnestabFailTPUnspecified",
    "ueAssocS1ConnestabFailNasCSGSubscriptionExpiry",
    "ueAssocS1ConnestabFailNasAuthenticationfail",
    "ueAssocS1ConnestabFailNasUnspecified",
    "ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr",
    "ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg",
    "ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState",
    "ueAssocS1ConnestabFailProtUnspecified",
    "ueAssocS1ConnestabFailMiscCtrlProcOvld",
    "ueAssocS1ConnestabFailMiscNotEnoughUpResAvail",
    "ueAssocS1ConnestabFailMiscHwErr",
    "ueAssocS1ConnestabFailMiscOAMInt",
    "ueAssocS1ConnestabFailMiscUnspecified",
    "ueAssocS1ConnestabFailMiscUnknownPlmn",
    "ueAssocS1ConnestabFailSum",
    "ueAssocS1ConnEstabSuccEmergency",
    "ueAssocS1ConnEstabSuccHighPriorityAccess",
    "ueAssocS1ConnEstabSuccMtAccess",
    "ueAssocS1ConnEstabSuccMoSignalling",
    "ueAssocS1ConnEstabSuccMoData",
    "ueAssocS1ConnEstabSuccDelayTolerantAccess"
})
public class LteS1StatsRowWs {

    @XmlElement(name = "CellId")
    protected int cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "UeAssocS1ConnEstabAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabAtt;
    @XmlElementRef(name = "UeAssocS1ConnEstabSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSucc;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwUnspecified;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwFailInRadioInterfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwFailInRadioInterfProc;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId;
    @XmlElementRef(name = "UeAssocS1ConnestabRNwFailUENotAvailForPSService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabRNwFailUENotAvailForPSService;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwInteractionWitOtherProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwInteractionWitOtherProc;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwRedirectionTowards1xRTT", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwNotSupportedQCIVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwNotSupportedQCIVal;
    @XmlElementRef(name = "UeAssocS1ConnestabFailRNwInvalidQosComb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailRNwInvalidQosComb;
    @XmlElementRef(name = "UeAssocS1ConnestabFailTPTransportResunavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailTPTransportResunavail;
    @XmlElementRef(name = "UeAssocS1ConnestabFailTPUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailTPUnspecified;
    @XmlElementRef(name = "UeAssocS1ConnestabFailNasCSGSubscriptionExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailNasCSGSubscriptionExpiry;
    @XmlElementRef(name = "UeAssocS1ConnestabFailNasAuthenticationfail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailNasAuthenticationfail;
    @XmlElementRef(name = "UeAssocS1ConnestabFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailNasUnspecified;
    @XmlElementRef(name = "UeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr;
    @XmlElementRef(name = "UeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg;
    @XmlElementRef(name = "UeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState;
    @XmlElementRef(name = "UeAssocS1ConnestabFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailProtUnspecified;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscCtrlProcOvld", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscCtrlProcOvld;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscNotEnoughUpResAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscNotEnoughUpResAvail;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscHwErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscHwErr;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscOAMInt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscOAMInt;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscUnspecified;
    @XmlElementRef(name = "UeAssocS1ConnestabFailMiscUnknownPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailMiscUnknownPlmn;
    @XmlElementRef(name = "UeAssocS1ConnestabFailSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnestabFailSum;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccEmergency;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccHighPriorityAccess;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccMtAccess;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccMoSignalling;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccMoData;
    @XmlElementRef(name = "UeAssocS1ConnEstabSuccDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueAssocS1ConnEstabSuccDelayTolerantAccess;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<Integer> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabAtt() {
        return ueAssocS1ConnEstabAtt;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabAtt(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabAtt = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSucc() {
        return ueAssocS1ConnEstabSucc;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSucc(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSucc = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwUnspecified() {
        return ueAssocS1ConnestabFailRNwUnspecified;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwUnspecified(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwUnspecified = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys() {
        return ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwFailInRadioInterfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwFailInRadioInterfProc() {
        return ueAssocS1ConnestabFailRNwFailInRadioInterfProc;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwFailInRadioInterfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwFailInRadioInterfProc(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwFailInRadioInterfProc = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId() {
        return ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId() {
        return ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId() {
        return ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabRNwFailUENotAvailForPSService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabRNwFailUENotAvailForPSService() {
        return ueAssocS1ConnestabRNwFailUENotAvailForPSService;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabRNwFailUENotAvailForPSService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabRNwFailUENotAvailForPSService(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabRNwFailUENotAvailForPSService = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwInteractionWitOtherProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwInteractionWitOtherProc() {
        return ueAssocS1ConnestabFailRNwInteractionWitOtherProc;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwInteractionWitOtherProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwInteractionWitOtherProc(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwInteractionWitOtherProc = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwRedirectionTowards1XRTT() {
        return ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwRedirectionTowards1XRTT(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwRedirectionTowards1XRTT = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwNotSupportedQCIVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwNotSupportedQCIVal() {
        return ueAssocS1ConnestabFailRNwNotSupportedQCIVal;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwNotSupportedQCIVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwNotSupportedQCIVal(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwNotSupportedQCIVal = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailRNwInvalidQosComb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailRNwInvalidQosComb() {
        return ueAssocS1ConnestabFailRNwInvalidQosComb;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailRNwInvalidQosComb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailRNwInvalidQosComb(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailRNwInvalidQosComb = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailTPTransportResunavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailTPTransportResunavail() {
        return ueAssocS1ConnestabFailTPTransportResunavail;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailTPTransportResunavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailTPTransportResunavail(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailTPTransportResunavail = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailTPUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailTPUnspecified() {
        return ueAssocS1ConnestabFailTPUnspecified;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailTPUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailTPUnspecified(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailTPUnspecified = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailNasCSGSubscriptionExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailNasCSGSubscriptionExpiry() {
        return ueAssocS1ConnestabFailNasCSGSubscriptionExpiry;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailNasCSGSubscriptionExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailNasCSGSubscriptionExpiry(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailNasCSGSubscriptionExpiry = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailNasAuthenticationfail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailNasAuthenticationfail() {
        return ueAssocS1ConnestabFailNasAuthenticationfail;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailNasAuthenticationfail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailNasAuthenticationfail(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailNasAuthenticationfail = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailNasUnspecified() {
        return ueAssocS1ConnestabFailNasUnspecified;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailNasUnspecified(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailNasUnspecified = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr() {
        return ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg() {
        return ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailProtAbsSynErrFlsContructMsg = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState() {
        return ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailProtUnspecified() {
        return ueAssocS1ConnestabFailProtUnspecified;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailProtUnspecified(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailProtUnspecified = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscCtrlProcOvld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscCtrlProcOvld() {
        return ueAssocS1ConnestabFailMiscCtrlProcOvld;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscCtrlProcOvld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscCtrlProcOvld(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscCtrlProcOvld = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscNotEnoughUpResAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscNotEnoughUpResAvail() {
        return ueAssocS1ConnestabFailMiscNotEnoughUpResAvail;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscNotEnoughUpResAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscNotEnoughUpResAvail(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscNotEnoughUpResAvail = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscHwErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscHwErr() {
        return ueAssocS1ConnestabFailMiscHwErr;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscHwErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscHwErr(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscHwErr = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscOAMInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscOAMInt() {
        return ueAssocS1ConnestabFailMiscOAMInt;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscOAMInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscOAMInt(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscOAMInt = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscUnspecified() {
        return ueAssocS1ConnestabFailMiscUnspecified;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscUnspecified(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailMiscUnknownPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailMiscUnknownPlmn() {
        return ueAssocS1ConnestabFailMiscUnknownPlmn;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailMiscUnknownPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailMiscUnknownPlmn(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailMiscUnknownPlmn = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnestabFailSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnestabFailSum() {
        return ueAssocS1ConnestabFailSum;
    }

    /**
     * Sets the value of the ueAssocS1ConnestabFailSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnestabFailSum(JAXBElement<Integer> value) {
        this.ueAssocS1ConnestabFailSum = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccEmergency() {
        return ueAssocS1ConnEstabSuccEmergency;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccEmergency(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccEmergency = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccHighPriorityAccess() {
        return ueAssocS1ConnEstabSuccHighPriorityAccess;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccHighPriorityAccess(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccHighPriorityAccess = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccMtAccess() {
        return ueAssocS1ConnEstabSuccMtAccess;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccMtAccess(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccMtAccess = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccMoSignalling() {
        return ueAssocS1ConnEstabSuccMoSignalling;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccMoSignalling(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccMoSignalling = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccMoData() {
        return ueAssocS1ConnEstabSuccMoData;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccMoData(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccMoData = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSuccDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeAssocS1ConnEstabSuccDelayTolerantAccess() {
        return ueAssocS1ConnEstabSuccDelayTolerantAccess;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSuccDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeAssocS1ConnEstabSuccDelayTolerantAccess(JAXBElement<Integer> value) {
        this.ueAssocS1ConnEstabSuccDelayTolerantAccess = value;
    }

}
