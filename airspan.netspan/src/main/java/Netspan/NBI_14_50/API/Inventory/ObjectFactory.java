
package Netspan.NBI_14_50.API.Inventory;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_14_50.API.Inventory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Credentials_QNAME = new QName("http://Airspan.Netspan.WebServices", "Credentials");
    private final static QName _SnmpAgentWsActualOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActualOperationalStatus");
    private final static QName _SnmpAgentWsRequestedOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "RequestedOperationalStatus");
    private final static QName _SnmpAgentWsConnectionState_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionState");
    private final static QName _SnmpAgentWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _RFStatusPathWsOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "OperationalStatus");
    private final static QName _NodeProvisioningGetWsConfigQueued_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigQueued");
    private final static QName _NodeProvisioningGetWsActionQueued_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActionQueued");
    private final static QName _NodeProvisioningGetWsConfigPending_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigPending");
    private final static QName _NodeProvisioningGetWsActionFailed_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActionFailed");
    private final static QName _NodeProvisioningGetWsConfigFailed_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigFailed");
    private final static QName _NodeProvisioningGetWsActionPending_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActionPending");
    private final static QName _SiteGpsLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLatitude");
    private final static QName _SiteGpsUpdateEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsUpdateEnabled");
    private final static QName _SiteGpsLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLongitude");
    private final static QName _NodeDetailWsHardwareTypeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareTypeId");
    private final static QName _NodeDetailWsHardwareCategoryId_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareCategoryId");
    private final static QName _NodeDetailWsLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Latitude");
    private final static QName _NodeDetailWsLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Longitude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_14_50.API.Inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SiteCreateResponse }
     * 
     */
    public SiteCreateResponse createSiteCreateResponse() {
        return new SiteCreateResponse();
    }

    /**
     * Create an instance of {@link SiteActionResult }
     * 
     */
    public SiteActionResult createSiteActionResult() {
        return new SiteActionResult();
    }

    /**
     * Create an instance of {@link NodeResetForced }
     * 
     */
    public NodeResetForced createNodeResetForced() {
        return new NodeResetForced();
    }

    /**
     * Create an instance of {@link RegionCloneResponse }
     * 
     */
    public RegionCloneResponse createRegionCloneResponse() {
        return new RegionCloneResponse();
    }

    /**
     * Create an instance of {@link RegionActionResult }
     * 
     */
    public RegionActionResult createRegionActionResult() {
        return new RegionActionResult();
    }

    /**
     * Create an instance of {@link SiteDeleteResponse }
     * 
     */
    public SiteDeleteResponse createSiteDeleteResponse() {
        return new SiteDeleteResponse();
    }

    /**
     * Create an instance of {@link NodeRename }
     * 
     */
    public NodeRename createNodeRename() {
        return new NodeRename();
    }

    /**
     * Create an instance of {@link RegionCreateResponse }
     * 
     */
    public RegionCreateResponse createRegionCreateResponse() {
        return new RegionCreateResponse();
    }

    /**
     * Create an instance of {@link SiteDelete }
     * 
     */
    public SiteDelete createSiteDelete() {
        return new SiteDelete();
    }

    /**
     * Create an instance of {@link NodeInfoGetResponse }
     * 
     */
    public NodeInfoGetResponse createNodeInfoGetResponse() {
        return new NodeInfoGetResponse();
    }

    /**
     * Create an instance of {@link NodeDetailGetResult }
     * 
     */
    public NodeDetailGetResult createNodeDetailGetResult() {
        return new NodeDetailGetResult();
    }

    /**
     * Create an instance of {@link DiscoveryTaskDelete }
     * 
     */
    public DiscoveryTaskDelete createDiscoveryTaskDelete() {
        return new DiscoveryTaskDelete();
    }

    /**
     * Create an instance of {@link NodeReprovisionResponse }
     * 
     */
    public NodeReprovisionResponse createNodeReprovisionResponse() {
        return new NodeReprovisionResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link DiscoveryTaskAddSnmpV3Response }
     * 
     */
    public DiscoveryTaskAddSnmpV3Response createDiscoveryTaskAddSnmpV3Response() {
        return new DiscoveryTaskAddSnmpV3Response();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link SiteList }
     * 
     */
    public SiteList createSiteList() {
        return new SiteList();
    }

    /**
     * Create an instance of {@link SiteClone }
     * 
     */
    public SiteClone createSiteClone() {
        return new SiteClone();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link RegionList }
     * 
     */
    public RegionList createRegionList() {
        return new RegionList();
    }

    /**
     * Create an instance of {@link RegionDeleteResponse }
     * 
     */
    public RegionDeleteResponse createRegionDeleteResponse() {
        return new RegionDeleteResponse();
    }

    /**
     * Create an instance of {@link NodeDeleteResponse }
     * 
     */
    public NodeDeleteResponse createNodeDeleteResponse() {
        return new NodeDeleteResponse();
    }

    /**
     * Create an instance of {@link NodeRenameResponse }
     * 
     */
    public NodeRenameResponse createNodeRenameResponse() {
        return new NodeRenameResponse();
    }

    /**
     * Create an instance of {@link RegionGetResponse }
     * 
     */
    public RegionGetResponse createRegionGetResponse() {
        return new RegionGetResponse();
    }

    /**
     * Create an instance of {@link RegionDetailGetResult }
     * 
     */
    public RegionDetailGetResult createRegionDetailGetResult() {
        return new RegionDetailGetResult();
    }

    /**
     * Create an instance of {@link NodeRfStatusGet }
     * 
     */
    public NodeRfStatusGet createNodeRfStatusGet() {
        return new NodeRfStatusGet();
    }

    /**
     * Create an instance of {@link NodeLatitudeLongitudeSet }
     * 
     */
    public NodeLatitudeLongitudeSet createNodeLatitudeLongitudeSet() {
        return new NodeLatitudeLongitudeSet();
    }

    /**
     * Create an instance of {@link DiscoveryTaskAddSnmpV2 }
     * 
     */
    public DiscoveryTaskAddSnmpV2 createDiscoveryTaskAddSnmpV2() {
        return new DiscoveryTaskAddSnmpV2();
    }

    /**
     * Create an instance of {@link DiscoveryTaskAddSnmpV3 }
     * 
     */
    public DiscoveryTaskAddSnmpV3 createDiscoveryTaskAddSnmpV3() {
        return new DiscoveryTaskAddSnmpV3();
    }

    /**
     * Create an instance of {@link RegionGet }
     * 
     */
    public RegionGet createRegionGet() {
        return new RegionGet();
    }

    /**
     * Create an instance of {@link SiteCloneResponse }
     * 
     */
    public SiteCloneResponse createSiteCloneResponse() {
        return new SiteCloneResponse();
    }

    /**
     * Create an instance of {@link NodeList }
     * 
     */
    public NodeList createNodeList() {
        return new NodeList();
    }

    /**
     * Create an instance of {@link SiteUpdateResponse }
     * 
     */
    public SiteUpdateResponse createSiteUpdateResponse() {
        return new SiteUpdateResponse();
    }

    /**
     * Create an instance of {@link NodeProvisioningStatusGet }
     * 
     */
    public NodeProvisioningStatusGet createNodeProvisioningStatusGet() {
        return new NodeProvisioningStatusGet();
    }

    /**
     * Create an instance of {@link SiteUpdate }
     * 
     */
    public SiteUpdate createSiteUpdate() {
        return new SiteUpdate();
    }

    /**
     * Create an instance of {@link RegionDelete }
     * 
     */
    public RegionDelete createRegionDelete() {
        return new RegionDelete();
    }

    /**
     * Create an instance of {@link RegionListResponse }
     * 
     */
    public RegionListResponse createRegionListResponse() {
        return new RegionListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link SiteGet }
     * 
     */
    public SiteGet createSiteGet() {
        return new SiteGet();
    }

    /**
     * Create an instance of {@link NodeDelete }
     * 
     */
    public NodeDelete createNodeDelete() {
        return new NodeDelete();
    }

    /**
     * Create an instance of {@link SiteListResponse }
     * 
     */
    public SiteListResponse createSiteListResponse() {
        return new SiteListResponse();
    }

    /**
     * Create an instance of {@link RegionUpdate }
     * 
     */
    public RegionUpdate createRegionUpdate() {
        return new RegionUpdate();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link SiteCreate }
     * 
     */
    public SiteCreate createSiteCreate() {
        return new SiteCreate();
    }

    /**
     * Create an instance of {@link NodeInfoGet }
     * 
     */
    public NodeInfoGet createNodeInfoGet() {
        return new NodeInfoGet();
    }

    /**
     * Create an instance of {@link NodeLatitudeLongitudeSetResponse }
     * 
     */
    public NodeLatitudeLongitudeSetResponse createNodeLatitudeLongitudeSetResponse() {
        return new NodeLatitudeLongitudeSetResponse();
    }

    /**
     * Create an instance of {@link NodeReprovision }
     * 
     */
    public NodeReprovision createNodeReprovision() {
        return new NodeReprovision();
    }

    /**
     * Create an instance of {@link DiscoveryTaskAddSnmpV2Response }
     * 
     */
    public DiscoveryTaskAddSnmpV2Response createDiscoveryTaskAddSnmpV2Response() {
        return new DiscoveryTaskAddSnmpV2Response();
    }

    /**
     * Create an instance of {@link SiteGetResponse }
     * 
     */
    public SiteGetResponse createSiteGetResponse() {
        return new SiteGetResponse();
    }

    /**
     * Create an instance of {@link SiteDetailGetResult }
     * 
     */
    public SiteDetailGetResult createSiteDetailGetResult() {
        return new SiteDetailGetResult();
    }

    /**
     * Create an instance of {@link NodeRfStatusGetResponse }
     * 
     */
    public NodeRfStatusGetResponse createNodeRfStatusGetResponse() {
        return new NodeRfStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeRfStatusGetResult }
     * 
     */
    public NodeRfStatusGetResult createNodeRfStatusGetResult() {
        return new NodeRfStatusGetResult();
    }

    /**
     * Create an instance of {@link DiscoveryTaskListResponse }
     * 
     */
    public DiscoveryTaskListResponse createDiscoveryTaskListResponse() {
        return new DiscoveryTaskListResponse();
    }

    /**
     * Create an instance of {@link NodeResetForcedResponse }
     * 
     */
    public NodeResetForcedResponse createNodeResetForcedResponse() {
        return new NodeResetForcedResponse();
    }

    /**
     * Create an instance of {@link NodeResetResponse }
     * 
     */
    public NodeResetResponse createNodeResetResponse() {
        return new NodeResetResponse();
    }

    /**
     * Create an instance of {@link NodeProvisioningStatusGetResponse }
     * 
     */
    public NodeProvisioningStatusGetResponse createNodeProvisioningStatusGetResponse() {
        return new NodeProvisioningStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeProvisioningGetResult }
     * 
     */
    public NodeProvisioningGetResult createNodeProvisioningGetResult() {
        return new NodeProvisioningGetResult();
    }

    /**
     * Create an instance of {@link RegionClone }
     * 
     */
    public RegionClone createRegionClone() {
        return new RegionClone();
    }

    /**
     * Create an instance of {@link RegionCreate }
     * 
     */
    public RegionCreate createRegionCreate() {
        return new RegionCreate();
    }

    /**
     * Create an instance of {@link DiscoveryTaskList }
     * 
     */
    public DiscoveryTaskList createDiscoveryTaskList() {
        return new DiscoveryTaskList();
    }

    /**
     * Create an instance of {@link NodeReset }
     * 
     */
    public NodeReset createNodeReset() {
        return new NodeReset();
    }

    /**
     * Create an instance of {@link DiscoveryTaskDeleteResponse }
     * 
     */
    public DiscoveryTaskDeleteResponse createDiscoveryTaskDeleteResponse() {
        return new DiscoveryTaskDeleteResponse();
    }

    /**
     * Create an instance of {@link DiscoveryTaskActionResult }
     * 
     */
    public DiscoveryTaskActionResult createDiscoveryTaskActionResult() {
        return new DiscoveryTaskActionResult();
    }

    /**
     * Create an instance of {@link NodeListResponse }
     * 
     */
    public NodeListResponse createNodeListResponse() {
        return new NodeListResponse();
    }

    /**
     * Create an instance of {@link NodeListResult }
     * 
     */
    public NodeListResult createNodeListResult() {
        return new NodeListResult();
    }

    /**
     * Create an instance of {@link RegionUpdateResponse }
     * 
     */
    public RegionUpdateResponse createRegionUpdateResponse() {
        return new RegionUpdateResponse();
    }

    /**
     * Create an instance of {@link SiteDetailResult }
     * 
     */
    public SiteDetailResult createSiteDetailResult() {
        return new SiteDetailResult();
    }

    /**
     * Create an instance of {@link RegionDetailResult }
     * 
     */
    public RegionDetailResult createRegionDetailResult() {
        return new RegionDetailResult();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link NodeProvisioningGetWs }
     * 
     */
    public NodeProvisioningGetWs createNodeProvisioningGetWs() {
        return new NodeProvisioningGetWs();
    }

    /**
     * Create an instance of {@link SnmpAgentWs }
     * 
     */
    public SnmpAgentWs createSnmpAgentWs() {
        return new SnmpAgentWs();
    }

    /**
     * Create an instance of {@link SiteResult }
     * 
     */
    public SiteResult createSiteResult() {
        return new SiteResult();
    }

    /**
     * Create an instance of {@link NodeRfStatusResult }
     * 
     */
    public NodeRfStatusResult createNodeRfStatusResult() {
        return new NodeRfStatusResult();
    }

    /**
     * Create an instance of {@link NodeDetailWs }
     * 
     */
    public NodeDetailWs createNodeDetailWs() {
        return new NodeDetailWs();
    }

    /**
     * Create an instance of {@link RFStatusPathWs }
     * 
     */
    public RFStatusPathWs createRFStatusPathWs() {
        return new RFStatusPathWs();
    }

    /**
     * Create an instance of {@link RegionResult }
     * 
     */
    public RegionResult createRegionResult() {
        return new RegionResult();
    }

    /**
     * Create an instance of {@link NodeDetailResult }
     * 
     */
    public NodeDetailResult createNodeDetailResult() {
        return new NodeDetailResult();
    }

    /**
     * Create an instance of {@link NodeProvisioningResult }
     * 
     */
    public NodeProvisioningResult createNodeProvisioningResult() {
        return new NodeProvisioningResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActualOperationalStatus", scope = SnmpAgentWs.class)
    public JAXBElement<OperationalStatusValues> createSnmpAgentWsActualOperationalStatus(OperationalStatusValues value) {
        return new JAXBElement<OperationalStatusValues>(_SnmpAgentWsActualOperationalStatus_QNAME, OperationalStatusValues.class, SnmpAgentWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RequestedOperationalStatus", scope = SnmpAgentWs.class)
    public JAXBElement<OperationalStatusValues> createSnmpAgentWsRequestedOperationalStatus(OperationalStatusValues value) {
        return new JAXBElement<OperationalStatusValues>(_SnmpAgentWsRequestedOperationalStatus_QNAME, OperationalStatusValues.class, SnmpAgentWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpConnectionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionState", scope = SnmpAgentWs.class)
    public JAXBElement<SnmpConnectionState> createSnmpAgentWsConnectionState(SnmpConnectionState value) {
        return new JAXBElement<SnmpConnectionState>(_SnmpAgentWsConnectionState_QNAME, SnmpConnectionState.class, SnmpAgentWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = SnmpAgentWs.class)
    public JAXBElement<Integer> createSnmpAgentWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpAgentWsSnmpPort_QNAME, Integer.class, SnmpAgentWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = RFStatusPathWs.class)
    public JAXBElement<OperationalStatusValues> createRFStatusPathWsOperationalStatus(OperationalStatusValues value) {
        return new JAXBElement<OperationalStatusValues>(_RFStatusPathWsOperationalStatus_QNAME, OperationalStatusValues.class, RFStatusPathWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigQueued", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsConfigQueued(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsConfigQueued_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActionQueued", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsActionQueued(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsActionQueued_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigPending", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsConfigPending(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsConfigPending_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActionFailed", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsActionFailed(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsActionFailed_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigFailed", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsConfigFailed(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsConfigFailed_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActionPending", scope = NodeProvisioningGetWs.class)
    public JAXBElement<Integer> createNodeProvisioningGetWsActionPending(Integer value) {
        return new JAXBElement<Integer>(_NodeProvisioningGetWsActionPending_QNAME, Integer.class, NodeProvisioningGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLatitude", scope = Site.class)
    public JAXBElement<BigDecimal> createSiteGpsLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SiteGpsLatitude_QNAME, BigDecimal.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsUpdateEnabled", scope = Site.class)
    public JAXBElement<Boolean> createSiteGpsUpdateEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_SiteGpsUpdateEnabled_QNAME, Boolean.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLongitude", scope = Site.class)
    public JAXBElement<BigDecimal> createSiteGpsLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SiteGpsLongitude_QNAME, BigDecimal.class, Site.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareTypeId", scope = NodeDetailWs.class)
    public JAXBElement<Integer> createNodeDetailWsHardwareTypeId(Integer value) {
        return new JAXBElement<Integer>(_NodeDetailWsHardwareTypeId_QNAME, Integer.class, NodeDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategoryId", scope = NodeDetailWs.class)
    public JAXBElement<Integer> createNodeDetailWsHardwareCategoryId(Integer value) {
        return new JAXBElement<Integer>(_NodeDetailWsHardwareCategoryId_QNAME, Integer.class, NodeDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = NodeDetailWs.class)
    public JAXBElement<BigDecimal> createNodeDetailWsLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NodeDetailWsLatitude_QNAME, BigDecimal.class, NodeDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = NodeDetailWs.class)
    public JAXBElement<BigDecimal> createNodeDetailWsLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NodeDetailWsLongitude_QNAME, BigDecimal.class, NodeDetailWs.class, value);
    }

}
