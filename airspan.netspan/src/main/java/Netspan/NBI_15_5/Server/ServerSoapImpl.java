
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_15_5.Server;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-10-09T13:31:26.689+03:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "Server",
                      portName = "ServerSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://192.168.58.49/ws/15.5/Server.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_15_5.Server.ServerSoap")
                      
public class ServerSoapImpl implements ServerSoap {

    private static final Logger LOG = Logger.getLogger(ServerSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsLicenseList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsLicenseListResult nmsLicenseList(Credentials credentials) { 
        LOG.info("Executing operation nmsLicenseList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsLicenseListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsCreate(Netspan.NBI_15_5.Server.CtsSetWs  cts ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.CtsResponse ctsCreate(Netspan.NBI_15_5.Server.CtsSetWs cts,Credentials credentials) { 
        LOG.info("Executing operation ctsCreate");
        System.out.println(cts);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.CtsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsLicenseSummaryList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsLicenseSummaryListResult nmsLicenseSummaryList(Credentials credentials) { 
        LOG.info("Executing operation nmsLicenseSummaryList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsLicenseSummaryListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsUserList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NameResult nmsUserList(Credentials credentials) { 
        LOG.info("Executing operation nmsUserList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nodeFileUploadConfigSet(Netspan.NBI_15_5.Server.NodeFileUpload  nodeFileUpload ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.WsResponse nodeFileUploadConfigSet(Netspan.NBI_15_5.Server.NodeFileUpload nodeFileUpload,Credentials credentials) { 
        LOG.info("Executing operation nodeFileUploadConfigSet");
        System.out.println(nodeFileUpload);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NameResult fileServerList(Credentials credentials) { 
        LOG.info("Executing operation fileServerList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsUserDelete(java.util.List<java.lang.String>  userName ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.UserResponse nmsUserDelete(java.util.List<java.lang.String> userName,Credentials credentials) { 
        LOG.info("Executing operation nmsUserDelete");
        System.out.println(userName);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.UserResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsInfoGet(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsInfoResponse nmsInfoGet(Credentials credentials) { 
        LOG.info("Executing operation nmsInfoGet");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsInfoResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsDelete(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.CtsResponse ctsDelete(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation ctsDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.CtsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsUserUpdate(java.lang.String  userName ,)Netspan.NBI_15_5.Server.NmsUserSetWs  nmsUser ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.UserResponse nmsUserUpdate(java.lang.String userName,Netspan.NBI_15_5.Server.NmsUserSetWs nmsUser,Credentials credentials) { 
        LOG.info("Executing operation nmsUserUpdate");
        System.out.println(userName);
        System.out.println(nmsUser);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.UserResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerClone(java.lang.String  cloneFromName ,)Netspan.NBI_15_5.Server.FileServerWs  fileServer ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerClone(java.lang.String cloneFromName,Netspan.NBI_15_5.Server.FileServerWs fileServer,Credentials credentials) { 
        LOG.info("Executing operation fileServerClone");
        System.out.println(cloneFromName);
        System.out.println(fileServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.FileServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsUserGet(java.util.List<java.lang.String>  userName ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsUserGetResult nmsUserGet(java.util.List<java.lang.String> userName,Credentials credentials) { 
        LOG.info("Executing operation nmsUserGet");
        System.out.println(userName);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsUserGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsUserCreate(Netspan.NBI_15_5.Server.NmsUserSetWs  nmsUser ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.UserResponse nmsUserCreate(Netspan.NBI_15_5.Server.NmsUserSetWs nmsUser,Credentials credentials) { 
        LOG.info("Executing operation nmsUserCreate");
        System.out.println(nmsUser);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.UserResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsUpdate(java.lang.String  name ,)Netspan.NBI_15_5.Server.CtsSetWs  cts ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.CtsResponse ctsUpdate(java.lang.String name,Netspan.NBI_15_5.Server.CtsSetWs cts,Credentials credentials) { 
        LOG.info("Executing operation ctsUpdate");
        System.out.println(name);
        System.out.println(cts);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.CtsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NameResult ctsList(Credentials credentials) { 
        LOG.info("Executing operation ctsList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerUpdate(java.lang.String  name ,)Netspan.NBI_15_5.Server.FileServerWs  fileServer ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerUpdate(java.lang.String name,Netspan.NBI_15_5.Server.FileServerWs fileServer,Credentials credentials) { 
        LOG.info("Executing operation fileServerUpdate");
        System.out.println(name);
        System.out.println(fileServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.FileServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsLicenseNodeSummaryList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.LicenseNodeSummaryListResult nmsLicenseNodeSummaryList(Credentials credentials) { 
        LOG.info("Executing operation nmsLicenseNodeSummaryList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.LicenseNodeSummaryListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerDelete(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerDelete(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation fileServerDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.FileServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsServerIPAddressList(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsServerIPAddressListWs nmsServerIPAddressList(Credentials credentials) { 
        LOG.info("Executing operation nmsServerIPAddressList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsServerIPAddressListWs _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsGet(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.CtsGetResult ctsGet(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation ctsGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.CtsGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#ctsClone(java.lang.String  cloneFromName ,)Netspan.NBI_15_5.Server.CtsSetWs  cts ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.CtsResponse ctsClone(java.lang.String cloneFromName,Netspan.NBI_15_5.Server.CtsSetWs cts,Credentials credentials) { 
        LOG.info("Executing operation ctsClone");
        System.out.println(cloneFromName);
        System.out.println(cts);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.CtsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsLicenceDelete(java.util.List<java.lang.String>  licenceId ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.ItemActionResult nmsLicenceDelete(java.util.List<java.lang.String> licenceId,Credentials credentials) { 
        LOG.info("Executing operation nmsLicenceDelete");
        System.out.println(licenceId);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.ItemActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsServerIPAddressSet(java.lang.String  ipAddress ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.WsResponse nmsServerIPAddressSet(java.lang.String ipAddress,Credentials credentials) { 
        LOG.info("Executing operation nmsServerIPAddressSet");
        System.out.println(ipAddress);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerGet(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerGet(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation fileServerGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.FileServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#fileServerCreate(Netspan.NBI_15_5.Server.FileServerWs  fileServer ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerCreate(Netspan.NBI_15_5.Server.FileServerWs fileServer,Credentials credentials) { 
        LOG.info("Executing operation fileServerCreate");
        System.out.println(fileServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.FileServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#clientRequestInfoGet(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.ClientRequestInfoResponse clientRequestInfoGet(Credentials credentials) { 
        LOG.info("Executing operation clientRequestInfoGet");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.ClientRequestInfoResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsLicenceAdd(java.lang.String  licenceBase64 ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.WsResponse nmsLicenceAdd(java.lang.String licenceBase64,Credentials credentials) { 
        LOG.info("Executing operation nmsLicenceAdd");
        System.out.println(licenceBase64);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nmsServerIPAddressGet(Netspan.NBI_15_5.Server.IPAddressTypes  ipAddressType ,)Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NmsServerIPAddressGetWs nmsServerIPAddressGet(Netspan.NBI_15_5.Server.IPAddressTypes ipAddressType,Credentials credentials) { 
        LOG.info("Executing operation nmsServerIPAddressGet");
        System.out.println(ipAddressType);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NmsServerIPAddressGetWs _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_5.Server.ServerSoap#nodeFileUploadConfigGet(Netspan.NBI_15_5.Server.Credentials  credentials )*
     */
    public Netspan.NBI_15_5.Server.NodeFileUploadGetWs nodeFileUploadConfigGet(Credentials credentials) { 
        LOG.info("Executing operation nodeFileUploadConfigGet");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_5.Server.NodeFileUploadGetWs _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
