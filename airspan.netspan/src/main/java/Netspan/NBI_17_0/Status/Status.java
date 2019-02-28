package Netspan.NBI_17_0.Status;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2019-02-28T15:40:39.476+02:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "Status",
                  wsdlLocation = "http://192.168.58.103/ws/17.0/Status.asmx?WSDL",
                  targetNamespace = "http://Airspan.Netspan.WebServices")
public class Status extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Airspan.Netspan.WebServices", "Status");
    public final static QName StatusSoap = new QName("http://Airspan.Netspan.WebServices", "StatusSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.58.103/ws/17.0/Status.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Status.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://192.168.58.103/ws/17.0/Status.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Status(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Status(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Status() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Status(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Status(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Status(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns StatusSoap
     */
    @WebEndpoint(name = "StatusSoap")
    public StatusSoap getStatusSoap() {
        return super.getPort(StatusSoap, StatusSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatusSoap
     */
    @WebEndpoint(name = "StatusSoap")
    public StatusSoap getStatusSoap(WebServiceFeature... features) {
        return super.getPort(StatusSoap, StatusSoap.class, features);
    }

}
