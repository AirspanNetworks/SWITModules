package Netspan.NBI_17_0.Server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2019-02-28T15:40:44.790+02:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "Server",
                  wsdlLocation = "http://192.168.58.103/ws/17.0/Server.asmx?WSDL",
                  targetNamespace = "http://Airspan.Netspan.WebServices")
public class Server extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Airspan.Netspan.WebServices", "Server");
    public final static QName ServerSoap = new QName("http://Airspan.Netspan.WebServices", "ServerSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.58.103/ws/17.0/Server.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Server.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://192.168.58.103/ws/17.0/Server.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Server(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Server(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Server() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Server(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Server(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Server(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ServerSoap
     */
    @WebEndpoint(name = "ServerSoap")
    public ServerSoap getServerSoap() {
        return super.getPort(ServerSoap, ServerSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerSoap
     */
    @WebEndpoint(name = "ServerSoap")
    public ServerSoap getServerSoap(WebServiceFeature... features) {
        return super.getPort(ServerSoap, ServerSoap.class, features);
    }

}
