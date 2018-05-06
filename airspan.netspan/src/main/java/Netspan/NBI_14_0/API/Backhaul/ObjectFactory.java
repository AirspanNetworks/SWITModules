
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_14_0.API.Backhaul package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_14_0.API.Backhaul
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ib440ConfigGetResponse }
     * 
     */
    public Ib440ConfigGetResponse createIb440ConfigGetResponse() {
        return new Ib440ConfigGetResponse();
    }

    /**
     * Create an instance of {@link Ib440ConfigGetResult }
     * 
     */
    public Ib440ConfigGetResult createIb440ConfigGetResult() {
        return new Ib440ConfigGetResult();
    }

    /**
     * Create an instance of {@link Ib440ConfigSet }
     * 
     */
    public Ib440ConfigSet createIb440ConfigSet() {
        return new Ib440ConfigSet();
    }

    /**
     * Create an instance of {@link Ib440DetailsSetWs }
     * 
     */
    public Ib440DetailsSetWs createIb440DetailsSetWs() {
        return new Ib440DetailsSetWs();
    }

    /**
     * Create an instance of {@link Ib440ConfigGet }
     * 
     */
    public Ib440ConfigGet createIb440ConfigGet() {
        return new Ib440ConfigGet();
    }

    /**
     * Create an instance of {@link Ib440ConfigSetResponse }
     * 
     */
    public Ib440ConfigSetResponse createIb440ConfigSetResponse() {
        return new Ib440ConfigSetResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link Ib440DetailsGetWs }
     * 
     */
    public Ib440DetailsGetWs createIb440DetailsGetWs() {
        return new Ib440DetailsGetWs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

}
