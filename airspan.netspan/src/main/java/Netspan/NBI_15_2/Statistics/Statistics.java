package Netspan.NBI_15_2.Statistics;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-01-29T15:59:36.120+02:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "Statistics", 
                  wsdlLocation = "http://192.168.58.34/ws/15.2/Statistics.asmx?WSDL",
                  targetNamespace = "http://Airspan.Netspan.WebServices") 
public class Statistics extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Airspan.Netspan.WebServices", "Statistics");
    public final static QName StatisticsSoap = new QName("http://Airspan.Netspan.WebServices", "StatisticsSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.58.34/ws/15.2/Statistics.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Statistics.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.58.34/ws/15.2/Statistics.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Statistics(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Statistics(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Statistics() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Statistics(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Statistics(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Statistics(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns StatisticsSoap
     */
    @WebEndpoint(name = "StatisticsSoap")
    public StatisticsSoap getStatisticsSoap() {
        return super.getPort(StatisticsSoap, StatisticsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatisticsSoap
     */
    @WebEndpoint(name = "StatisticsSoap")
    public StatisticsSoap getStatisticsSoap(WebServiceFeature... features) {
        return super.getPort(StatisticsSoap, StatisticsSoap.class, features);
    }

}
