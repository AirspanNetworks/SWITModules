
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_15_2.Software;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-01-29T15:59:55.240+02:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "Software",
                      portName = "SoftwareSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://192.168.58.34/ws/15.2/Software.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_15_2.Software.SoftwareSoap")
                      
public class SoftwareSoapImpl implements SoftwareSoap {

    private static final Logger LOG = Logger.getLogger(SoftwareSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerClone(java.lang.String  cloneFromName ,)Netspan.NBI_15_2.Software.SwServerWs  softwareServer ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwServerResponse softwareServerClone(java.lang.String cloneFromName,Netspan.NBI_15_2.Software.SwServerWs softwareServer,Credentials credentials) { 
        LOG.info("Executing operation softwareServerClone");
        System.out.println(cloneFromName);
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerCreate(Netspan.NBI_15_2.Software.SwServerWs  softwareServer ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwServerResponse softwareServerCreate(Netspan.NBI_15_2.Software.SwServerWs softwareServer,Credentials credentials) { 
        LOG.info("Executing operation softwareServerCreate");
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageGet(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwImageResponse softwareImageGet(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation softwareImageGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareConfigSet(java.lang.String  nodeName ,)Netspan.NBI_15_2.Software.SwConfigSetWs  softwareDetails ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.NodeActionResult softwareConfigSet(java.lang.String nodeName,Netspan.NBI_15_2.Software.SwConfigSetWs softwareDetails,Credentials credentials) { 
        LOG.info("Executing operation softwareConfigSet");
        System.out.println(nodeName);
        System.out.println(softwareDetails);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageDelete(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwImageResponse softwareImageDelete(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation softwareImageDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerGet(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwServerResponse softwareServerGet(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation softwareServerGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerUpdate(java.lang.String  name ,)Netspan.NBI_15_2.Software.SwServerWs  softwareServer ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwServerResponse softwareServerUpdate(java.lang.String name,Netspan.NBI_15_2.Software.SwServerWs softwareServer,Credentials credentials) { 
        LOG.info("Executing operation softwareServerUpdate");
        System.out.println(name);
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageClone(java.lang.String  cloneFromName ,)Netspan.NBI_15_2.Software.SwImageWs  softwareImage ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwImageResponse softwareImageClone(java.lang.String cloneFromName,Netspan.NBI_15_2.Software.SwImageWs softwareImage,Credentials credentials) { 
        LOG.info("Executing operation softwareImageClone");
        System.out.println(cloneFromName);
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerList(Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.NameResult softwareServerList(Credentials credentials) { 
        LOG.info("Executing operation softwareServerList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageUpdate(java.lang.String  name ,)Netspan.NBI_15_2.Software.SwImageWs  softwareImage ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwImageResponse softwareImageUpdate(java.lang.String name,Netspan.NBI_15_2.Software.SwImageWs softwareImage,Credentials credentials) { 
        LOG.info("Executing operation softwareImageUpdate");
        System.out.println(name);
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareServerDelete(java.util.List<java.lang.String>  name ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwServerResponse softwareServerDelete(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation softwareServerDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageList(Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.NameResult softwareImageList(Credentials credentials) { 
        LOG.info("Executing operation softwareImageList");
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareImageCreate(Netspan.NBI_15_2.Software.SwImageWs  softwareImage ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SwImageResponse softwareImageCreate(Netspan.NBI_15_2.Software.SwImageWs softwareImage,Credentials credentials) { 
        LOG.info("Executing operation softwareImageCreate");
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_15_2.Software.SoftwareSoap#softwareStatusGet(java.util.List<java.lang.String>  nodeName ,)Netspan.NBI_15_2.Software.Credentials  credentials )*
     */
    public Netspan.NBI_15_2.Software.SoftwareStatusGetWs softwareStatusGet(java.util.List<java.lang.String> nodeName,Credentials credentials) { 
        LOG.info("Executing operation softwareStatusGet");
        System.out.println(nodeName);
        System.out.println(credentials);
        try {
            Netspan.NBI_15_2.Software.SoftwareStatusGetWs _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
