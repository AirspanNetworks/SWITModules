
package Netspan.NBI_15_2.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_2.Server package. 
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
    private final static QName _CtsGetWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _CtsGetWsProtocol_QNAME = new QName("http://Airspan.Netspan.WebServices", "Protocol");
    private final static QName _NmsUserGetWsAuthenticationType_QNAME = new QName("http://Airspan.Netspan.WebServices", "AuthenticationType");
    private final static QName _NmsUserSetWsIsWSServiceProvisioner_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsWSServiceProvisioner");
    private final static QName _NmsUserSetWsIsSSInstaller_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSSInstaller");
    private final static QName _NmsUserSetWsIsAdministrator_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAdministrator");
    private final static QName _NmsUserSetWsIsEngineer_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEngineer");
    private final static QName _NmsUserSetWsIsAAAUserProvisioner_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAAAUserProvisioner");
    private final static QName _NmsUserSetWsIsInstaller_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInstaller");
    private final static QName _NmsUserSetWsIsExpertViewer_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsExpertViewer");
    private final static QName _NmsUserSetWsIsViewer_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsViewer");
    private final static QName _NmsUserSetWsIsWSAdministrator_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsWSAdministrator");
    private final static QName _NmsUserSetWsIsServiceProvisioner_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsServiceProvisioner");
    private final static QName _NmsUserSetWsIsCallTraceUser_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCallTraceUser");
    private final static QName _NmsUserSetWsIsCallTrace_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCallTrace");
    private final static QName _NmsUserSetWsIsExpertUser_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsExpertUser");
    private final static QName _NmsUserSetWsIsAAAManager_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAAAManager");
    private final static QName _NodeFileUploadEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "Enable");
    private final static QName _NodeFileUploadUseSSL_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseSSL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_2.Server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NmsUserUpdateResponse }
     * 
     */
    public NmsUserUpdateResponse createNmsUserUpdateResponse() {
        return new NmsUserUpdateResponse();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link NmsLicenceDelete }
     * 
     */
    public NmsLicenceDelete createNmsLicenceDelete() {
        return new NmsLicenceDelete();
    }

    /**
     * Create an instance of {@link NodeFileUploadConfigSetResponse }
     * 
     */
    public NodeFileUploadConfigSetResponse createNodeFileUploadConfigSetResponse() {
        return new NodeFileUploadConfigSetResponse();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link CtsListResponse }
     * 
     */
    public CtsListResponse createCtsListResponse() {
        return new CtsListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link NmsUserGetResponse }
     * 
     */
    public NmsUserGetResponse createNmsUserGetResponse() {
        return new NmsUserGetResponse();
    }

    /**
     * Create an instance of {@link NmsUserGetResult }
     * 
     */
    public NmsUserGetResult createNmsUserGetResult() {
        return new NmsUserGetResult();
    }

    /**
     * Create an instance of {@link NodeFileUploadConfigGet }
     * 
     */
    public NodeFileUploadConfigGet createNodeFileUploadConfigGet() {
        return new NodeFileUploadConfigGet();
    }

    /**
     * Create an instance of {@link NmsLicenceAdd }
     * 
     */
    public NmsLicenceAdd createNmsLicenceAdd() {
        return new NmsLicenceAdd();
    }

    /**
     * Create an instance of {@link CtsDeleteResponse }
     * 
     */
    public CtsDeleteResponse createCtsDeleteResponse() {
        return new CtsDeleteResponse();
    }

    /**
     * Create an instance of {@link CtsResponse }
     * 
     */
    public CtsResponse createCtsResponse() {
        return new CtsResponse();
    }

    /**
     * Create an instance of {@link NmsLicenceDeleteResponse }
     * 
     */
    public NmsLicenceDeleteResponse createNmsLicenceDeleteResponse() {
        return new NmsLicenceDeleteResponse();
    }

    /**
     * Create an instance of {@link ItemActionResult }
     * 
     */
    public ItemActionResult createItemActionResult() {
        return new ItemActionResult();
    }

    /**
     * Create an instance of {@link NmsUserCreateResponse }
     * 
     */
    public NmsUserCreateResponse createNmsUserCreateResponse() {
        return new NmsUserCreateResponse();
    }

    /**
     * Create an instance of {@link CtsGet }
     * 
     */
    public CtsGet createCtsGet() {
        return new CtsGet();
    }

    /**
     * Create an instance of {@link CtsClone }
     * 
     */
    public CtsClone createCtsClone() {
        return new CtsClone();
    }

    /**
     * Create an instance of {@link CtsSetWs }
     * 
     */
    public CtsSetWs createCtsSetWs() {
        return new CtsSetWs();
    }

    /**
     * Create an instance of {@link NmsLicenceAddResponse }
     * 
     */
    public NmsLicenceAddResponse createNmsLicenceAddResponse() {
        return new NmsLicenceAddResponse();
    }

    /**
     * Create an instance of {@link CtsCloneResponse }
     * 
     */
    public CtsCloneResponse createCtsCloneResponse() {
        return new CtsCloneResponse();
    }

    /**
     * Create an instance of {@link NmsInfoGet }
     * 
     */
    public NmsInfoGet createNmsInfoGet() {
        return new NmsInfoGet();
    }

    /**
     * Create an instance of {@link CtsDelete }
     * 
     */
    public CtsDelete createCtsDelete() {
        return new CtsDelete();
    }

    /**
     * Create an instance of {@link NmsUserDeleteResponse }
     * 
     */
    public NmsUserDeleteResponse createNmsUserDeleteResponse() {
        return new NmsUserDeleteResponse();
    }

    /**
     * Create an instance of {@link NmsUserUpdate }
     * 
     */
    public NmsUserUpdate createNmsUserUpdate() {
        return new NmsUserUpdate();
    }

    /**
     * Create an instance of {@link NmsUserSetWs }
     * 
     */
    public NmsUserSetWs createNmsUserSetWs() {
        return new NmsUserSetWs();
    }

    /**
     * Create an instance of {@link CtsCreateResponse }
     * 
     */
    public CtsCreateResponse createCtsCreateResponse() {
        return new CtsCreateResponse();
    }

    /**
     * Create an instance of {@link CtsGetResponse }
     * 
     */
    public CtsGetResponse createCtsGetResponse() {
        return new CtsGetResponse();
    }

    /**
     * Create an instance of {@link CtsGetResult }
     * 
     */
    public CtsGetResult createCtsGetResult() {
        return new CtsGetResult();
    }

    /**
     * Create an instance of {@link NmsUserCreate }
     * 
     */
    public NmsUserCreate createNmsUserCreate() {
        return new NmsUserCreate();
    }

    /**
     * Create an instance of {@link CtsUpdate }
     * 
     */
    public CtsUpdate createCtsUpdate() {
        return new CtsUpdate();
    }

    /**
     * Create an instance of {@link NmsUserGet }
     * 
     */
    public NmsUserGet createNmsUserGet() {
        return new NmsUserGet();
    }

    /**
     * Create an instance of {@link CtsList }
     * 
     */
    public CtsList createCtsList() {
        return new CtsList();
    }

    /**
     * Create an instance of {@link NmsUserListResponse }
     * 
     */
    public NmsUserListResponse createNmsUserListResponse() {
        return new NmsUserListResponse();
    }

    /**
     * Create an instance of {@link NmsInfoGetResponse }
     * 
     */
    public NmsInfoGetResponse createNmsInfoGetResponse() {
        return new NmsInfoGetResponse();
    }

    /**
     * Create an instance of {@link NmsInfoResponse }
     * 
     */
    public NmsInfoResponse createNmsInfoResponse() {
        return new NmsInfoResponse();
    }

    /**
     * Create an instance of {@link CtsUpdateResponse }
     * 
     */
    public CtsUpdateResponse createCtsUpdateResponse() {
        return new CtsUpdateResponse();
    }

    /**
     * Create an instance of {@link CtsCreate }
     * 
     */
    public CtsCreate createCtsCreate() {
        return new CtsCreate();
    }

    /**
     * Create an instance of {@link NodeFileUploadConfigSet }
     * 
     */
    public NodeFileUploadConfigSet createNodeFileUploadConfigSet() {
        return new NodeFileUploadConfigSet();
    }

    /**
     * Create an instance of {@link NodeFileUpload }
     * 
     */
    public NodeFileUpload createNodeFileUpload() {
        return new NodeFileUpload();
    }

    /**
     * Create an instance of {@link NmsUserList }
     * 
     */
    public NmsUserList createNmsUserList() {
        return new NmsUserList();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link NmsUserDelete }
     * 
     */
    public NmsUserDelete createNmsUserDelete() {
        return new NmsUserDelete();
    }

    /**
     * Create an instance of {@link NodeFileUploadConfigGetResponse }
     * 
     */
    public NodeFileUploadConfigGetResponse createNodeFileUploadConfigGetResponse() {
        return new NodeFileUploadConfigGetResponse();
    }

    /**
     * Create an instance of {@link NodeFileUploadGetWs }
     * 
     */
    public NodeFileUploadGetWs createNodeFileUploadGetWs() {
        return new NodeFileUploadGetWs();
    }

    /**
     * Create an instance of {@link UserResult }
     * 
     */
    public UserResult createUserResult() {
        return new UserResult();
    }

    /**
     * Create an instance of {@link NmsUserResult }
     * 
     */
    public NmsUserResult createNmsUserResult() {
        return new NmsUserResult();
    }

    /**
     * Create an instance of {@link NmsUserGetWs }
     * 
     */
    public NmsUserGetWs createNmsUserGetWs() {
        return new NmsUserGetWs();
    }

    /**
     * Create an instance of {@link CtsGetWs }
     * 
     */
    public CtsGetWs createCtsGetWs() {
        return new CtsGetWs();
    }

    /**
     * Create an instance of {@link CtsResult }
     * 
     */
    public CtsResult createCtsResult() {
        return new CtsResult();
    }

    /**
     * Create an instance of {@link ItemResult }
     * 
     */
    public ItemResult createItemResult() {
        return new ItemResult();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = CtsGetWs.class)
    public JAXBElement<Integer> createCtsGetWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_CtsGetWsSnmpPort_QNAME, Integer.class, CtsGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Protocols }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Protocol", scope = CtsGetWs.class)
    public JAXBElement<Protocols> createCtsGetWsProtocol(Protocols value) {
        return new JAXBElement<Protocols>(_CtsGetWsProtocol_QNAME, Protocols.class, CtsGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthenticationType", scope = NmsUserGetWs.class)
    public JAXBElement<UserAuthenticationTypes> createNmsUserGetWsAuthenticationType(UserAuthenticationTypes value) {
        return new JAXBElement<UserAuthenticationTypes>(_NmsUserGetWsAuthenticationType_QNAME, UserAuthenticationTypes.class, NmsUserGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = CtsSetWs.class)
    public JAXBElement<Integer> createCtsSetWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_CtsGetWsSnmpPort_QNAME, Integer.class, CtsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Protocols }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Protocol", scope = CtsSetWs.class)
    public JAXBElement<Protocols> createCtsSetWsProtocol(Protocols value) {
        return new JAXBElement<Protocols>(_CtsGetWsProtocol_QNAME, Protocols.class, CtsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsWSServiceProvisioner", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsWSServiceProvisioner(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsWSServiceProvisioner_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSSInstaller", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsSSInstaller(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsSSInstaller_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAdministrator", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsAdministrator(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsAdministrator_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEngineer", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsEngineer(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsEngineer_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAAAUserProvisioner", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsAAAUserProvisioner(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsAAAUserProvisioner_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInstaller", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsInstaller(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsInstaller_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthenticationType", scope = NmsUserSetWs.class)
    public JAXBElement<UserAuthenticationTypes> createNmsUserSetWsAuthenticationType(UserAuthenticationTypes value) {
        return new JAXBElement<UserAuthenticationTypes>(_NmsUserGetWsAuthenticationType_QNAME, UserAuthenticationTypes.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsExpertViewer", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsExpertViewer(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsExpertViewer_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsViewer", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsViewer(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsViewer_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsWSAdministrator", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsWSAdministrator(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsWSAdministrator_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsServiceProvisioner", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsServiceProvisioner(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsServiceProvisioner_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCallTraceUser", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsCallTraceUser(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsCallTraceUser_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCallTrace", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsCallTrace(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsCallTrace_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsExpertUser", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsExpertUser(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsExpertUser_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAAAManager", scope = NmsUserSetWs.class)
    public JAXBElement<Boolean> createNmsUserSetWsIsAAAManager(Boolean value) {
        return new JAXBElement<Boolean>(_NmsUserSetWsIsAAAManager_QNAME, Boolean.class, NmsUserSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Enable", scope = NodeFileUpload.class)
    public JAXBElement<Boolean> createNodeFileUploadEnable(Boolean value) {
        return new JAXBElement<Boolean>(_NodeFileUploadEnable_QNAME, Boolean.class, NodeFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseSSL", scope = NodeFileUpload.class)
    public JAXBElement<Boolean> createNodeFileUploadUseSSL(Boolean value) {
        return new JAXBElement<Boolean>(_NodeFileUploadUseSSL_QNAME, Boolean.class, NodeFileUpload.class, value);
    }

}
