package Netspan.NBI_14_50.API.Backhaul;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2016-03-02T16:21:26.213+02:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "Backhaul", 
                  wsdlLocation = "http://asil-svg-nms8/ws/14.5/Backhaul.asmx?WSDL",
                  targetNamespace = "http://Airspan.Netspan.WebServices") 
public class Backhaul extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Airspan.Netspan.WebServices", "Backhaul");
    public final static QName BackhaulSoap = new QName("http://Airspan.Netspan.WebServices", "BackhaulSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://asil-svg-nms8/ws/14.5/Backhaul.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Backhaul.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://asil-svg-nms8/ws/14.5/Backhaul.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Backhaul(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Backhaul(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Backhaul() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Backhaul(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Backhaul(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Backhaul(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns BackhaulSoap
     */
    @WebEndpoint(name = "BackhaulSoap")
    public BackhaulSoap getBackhaulSoap() {
        return super.getPort(BackhaulSoap, BackhaulSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BackhaulSoap
     */
    @WebEndpoint(name = "BackhaulSoap")
    public BackhaulSoap getBackhaulSoap(WebServiceFeature... features) {
        return super.getPort(BackhaulSoap, BackhaulSoap.class, features);
    }

}
