
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_14_0.API.Backhaul;

import java.util.logging.Logger;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-07-05T12:19:04.961+03:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "Backhaul",
                      portName = "BackhaulSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://asil-svg-nms6/ws/14.0/Backhaul.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_14_0.API.Backhaul.BackhaulSoap")
                      
public class BackhaulSoapImpl implements BackhaulSoap {

    private static final Logger LOG = Logger.getLogger(BackhaulSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_14_0.API.Backhaul.BackhaulSoap#ib440ConfigGet(java.lang.String  nodeName ,)Netspan.NBI_14_0.API.Backhaul.Credentials  credentials )*
     */
    public Netspan.NBI_14_0.API.Backhaul.Ib440ConfigGetResult ib440ConfigGet(java.lang.String nodeName,Credentials credentials) { 
        LOG.info("Executing operation ib440ConfigGet");
        System.out.println(nodeName);
        System.out.println(credentials);
        try {
            Netspan.NBI_14_0.API.Backhaul.Ib440ConfigGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_14_0.API.Backhaul.BackhaulSoap#ib440ConfigSet(java.lang.String  nodeName ,)Netspan.NBI_14_0.API.Backhaul.Ib440DetailsSetWs  ib440Details ,)Netspan.NBI_14_0.API.Backhaul.Credentials  credentials )*
     */
    public Netspan.NBI_14_0.API.Backhaul.NodeActionResult ib440ConfigSet(java.lang.String nodeName,Netspan.NBI_14_0.API.Backhaul.Ib440DetailsSetWs ib440Details,Credentials credentials) { 
        LOG.info("Executing operation ib440ConfigSet");
        System.out.println(nodeName);
        System.out.println(ib440Details);
        System.out.println(credentials);
        try {
            Netspan.NBI_14_0.API.Backhaul.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
