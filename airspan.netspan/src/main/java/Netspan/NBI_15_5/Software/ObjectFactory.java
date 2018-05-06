
package Netspan.NBI_15_5.Software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import Netspan.API.Enums.ImageType;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_5.Software package. 
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
    private final static QName _SwConfigSetWsRequest_QNAME = new QName("http://Airspan.Netspan.WebServices", "Request");
    private final static QName _SwServerWsProtocolType_QNAME = new QName("http://Airspan.Netspan.WebServices", "ProtocolType");
    private final static QName _NodeSoftwareStatusLastReadFromNode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastReadFromNode");
    private final static QName _SwFileInfoWsImageType_QNAME = new QName("http://Airspan.Netspan.WebServices", "ImageType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_5.Software
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoftwareImageUpdate }
     * 
     */
    public SoftwareImageUpdate createSoftwareImageUpdate() {
        return new SoftwareImageUpdate();
    }

    /**
     * Create an instance of {@link SwImageWs }
     * 
     */
    public SwImageWs createSwImageWs() {
        return new SwImageWs();
    }

    /**
     * Create an instance of {@link SoftwareImageUpdateResponse }
     * 
     */
    public SoftwareImageUpdateResponse createSoftwareImageUpdateResponse() {
        return new SoftwareImageUpdateResponse();
    }

    /**
     * Create an instance of {@link SwImageResponse }
     * 
     */
    public SwImageResponse createSwImageResponse() {
        return new SwImageResponse();
    }

    /**
     * Create an instance of {@link SoftwareConfigSetResponse }
     * 
     */
    public SoftwareConfigSetResponse createSoftwareConfigSetResponse() {
        return new SoftwareConfigSetResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link SoftwareServerGetResponse }
     * 
     */
    public SoftwareServerGetResponse createSoftwareServerGetResponse() {
        return new SoftwareServerGetResponse();
    }

    /**
     * Create an instance of {@link SwServerResponse }
     * 
     */
    public SwServerResponse createSwServerResponse() {
        return new SwServerResponse();
    }

    /**
     * Create an instance of {@link SoftwareServerListResponse }
     * 
     */
    public SoftwareServerListResponse createSoftwareServerListResponse() {
        return new SoftwareServerListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link SoftwareImageList }
     * 
     */
    public SoftwareImageList createSoftwareImageList() {
        return new SoftwareImageList();
    }

    /**
     * Create an instance of {@link SoftwareServerCreate }
     * 
     */
    public SoftwareServerCreate createSoftwareServerCreate() {
        return new SoftwareServerCreate();
    }

    /**
     * Create an instance of {@link SwServerWs }
     * 
     */
    public SwServerWs createSwServerWs() {
        return new SwServerWs();
    }

    /**
     * Create an instance of {@link SoftwareServerUpdateResponse }
     * 
     */
    public SoftwareServerUpdateResponse createSoftwareServerUpdateResponse() {
        return new SoftwareServerUpdateResponse();
    }

    /**
     * Create an instance of {@link SoftwareImageDeleteResponse }
     * 
     */
    public SoftwareImageDeleteResponse createSoftwareImageDeleteResponse() {
        return new SoftwareImageDeleteResponse();
    }

    /**
     * Create an instance of {@link SoftwareImageGet }
     * 
     */
    public SoftwareImageGet createSoftwareImageGet() {
        return new SoftwareImageGet();
    }

    /**
     * Create an instance of {@link SoftwareServerCloneResponse }
     * 
     */
    public SoftwareServerCloneResponse createSoftwareServerCloneResponse() {
        return new SoftwareServerCloneResponse();
    }

    /**
     * Create an instance of {@link SoftwareStatusGetResponse }
     * 
     */
    public SoftwareStatusGetResponse createSoftwareStatusGetResponse() {
        return new SoftwareStatusGetResponse();
    }

    /**
     * Create an instance of {@link SoftwareStatusGetWs }
     * 
     */
    public SoftwareStatusGetWs createSoftwareStatusGetWs() {
        return new SoftwareStatusGetWs();
    }

    /**
     * Create an instance of {@link SoftwareImageCloneResponse }
     * 
     */
    public SoftwareImageCloneResponse createSoftwareImageCloneResponse() {
        return new SoftwareImageCloneResponse();
    }

    /**
     * Create an instance of {@link SoftwareServerList }
     * 
     */
    public SoftwareServerList createSoftwareServerList() {
        return new SoftwareServerList();
    }

    /**
     * Create an instance of {@link SoftwareImageCreateResponse }
     * 
     */
    public SoftwareImageCreateResponse createSoftwareImageCreateResponse() {
        return new SoftwareImageCreateResponse();
    }

    /**
     * Create an instance of {@link SoftwareServerDelete }
     * 
     */
    public SoftwareServerDelete createSoftwareServerDelete() {
        return new SoftwareServerDelete();
    }

    /**
     * Create an instance of {@link SoftwareServerCreateResponse }
     * 
     */
    public SoftwareServerCreateResponse createSoftwareServerCreateResponse() {
        return new SoftwareServerCreateResponse();
    }

    /**
     * Create an instance of {@link SoftwareStatusGet }
     * 
     */
    public SoftwareStatusGet createSoftwareStatusGet() {
        return new SoftwareStatusGet();
    }

    /**
     * Create an instance of {@link SoftwareImageCreate }
     * 
     */
    public SoftwareImageCreate createSoftwareImageCreate() {
        return new SoftwareImageCreate();
    }

    /**
     * Create an instance of {@link SoftwareServerClone }
     * 
     */
    public SoftwareServerClone createSoftwareServerClone() {
        return new SoftwareServerClone();
    }

    /**
     * Create an instance of {@link SoftwareServerDeleteResponse }
     * 
     */
    public SoftwareServerDeleteResponse createSoftwareServerDeleteResponse() {
        return new SoftwareServerDeleteResponse();
    }

    /**
     * Create an instance of {@link SoftwareImageGetResponse }
     * 
     */
    public SoftwareImageGetResponse createSoftwareImageGetResponse() {
        return new SoftwareImageGetResponse();
    }

    /**
     * Create an instance of {@link SoftwareImageListResponse }
     * 
     */
    public SoftwareImageListResponse createSoftwareImageListResponse() {
        return new SoftwareImageListResponse();
    }

    /**
     * Create an instance of {@link SoftwareConfigSet }
     * 
     */
    public SoftwareConfigSet createSoftwareConfigSet() {
        return new SoftwareConfigSet();
    }

    /**
     * Create an instance of {@link SwConfigSetWs }
     * 
     */
    public SwConfigSetWs createSwConfigSetWs() {
        return new SwConfigSetWs();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link SoftwareServerUpdate }
     * 
     */
    public SoftwareServerUpdate createSoftwareServerUpdate() {
        return new SoftwareServerUpdate();
    }

    /**
     * Create an instance of {@link SoftwareImageClone }
     * 
     */
    public SoftwareImageClone createSoftwareImageClone() {
        return new SoftwareImageClone();
    }

    /**
     * Create an instance of {@link SoftwareServerGet }
     * 
     */
    public SoftwareServerGet createSoftwareServerGet() {
        return new SoftwareServerGet();
    }

    /**
     * Create an instance of {@link SoftwareImageDelete }
     * 
     */
    public SoftwareImageDelete createSoftwareImageDelete() {
        return new SoftwareImageDelete();
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
     * Create an instance of {@link SwServerResult }
     * 
     */
    public SwServerResult createSwServerResult() {
        return new SwServerResult();
    }

    /**
     * Create an instance of {@link SwFileInfoWs }
     * 
     */
    public SwFileInfoWs createSwFileInfoWs() {
        return new SwFileInfoWs();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link NodeSoftwareStatus }
     * 
     */
    public NodeSoftwareStatus createNodeSoftwareStatus() {
        return new NodeSoftwareStatus();
    }

    /**
     * Create an instance of {@link SwImageResult }
     * 
     */
    public SwImageResult createSwImageResult() {
        return new SwImageResult();
    }

    /**
     * Create an instance of {@link NodeSoftwareStatusResult }
     * 
     */
    public NodeSoftwareStatusResult createNodeSoftwareStatusResult() {
        return new NodeSoftwareStatusResult();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Request", scope = SwConfigSetWs.class)
    public JAXBElement<RequestType> createSwConfigSetWsRequest(RequestType value) {
        return new JAXBElement<RequestType>(_SwConfigSetWsRequest_QNAME, RequestType.class, SwConfigSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ProtocolType", scope = SwServerWs.class)
    public JAXBElement<ServerProtocolType> createSwServerWsProtocolType(ServerProtocolType value) {
        return new JAXBElement<ServerProtocolType>(_SwServerWsProtocolType_QNAME, ServerProtocolType.class, SwServerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastReadFromNode", scope = NodeSoftwareStatus.class)
    public JAXBElement<XMLGregorianCalendar> createNodeSoftwareStatusLastReadFromNode(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NodeSoftwareStatusLastReadFromNode_QNAME, XMLGregorianCalendar.class, NodeSoftwareStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ImageType", scope = SwFileInfoWs.class)
    public JAXBElement<ImageType> createSwFileInfoWsImageType(ImageType value) {
        return new JAXBElement<ImageType>(_SwFileInfoWsImageType_QNAME, ImageType.class, SwFileInfoWs.class, value);
    }

}
