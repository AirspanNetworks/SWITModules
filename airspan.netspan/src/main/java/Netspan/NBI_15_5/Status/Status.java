package Netspan.NBI_15_5.Status;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-06-27T17:33:42.282+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "Status", 
                  wsdlLocation = "http://192.168.58.49/ws/15.5/Status.asmx?WSDL",
                  targetNamespace = "http://Airspan.Netspan.WebServices") 
public class Status extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Airspan.Netspan.WebServices", "Status");
    public final static QName StatusSoap = new QName("http://Airspan.Netspan.WebServices", "StatusSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.58.49/ws/15.5/Status.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Status.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.58.49/ws/15.5/Status.asmx?WSDL");
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
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Status(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Status(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
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
