
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_18_0.Software;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2020-08-06T14:58:51.589+03:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "Software",
                      portName = "SoftwareSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "https://Asil-ACP-18/ws/18.0/Software.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_18_0.Software.SoftwareSoap")

public class SoftwareSoapImpl implements SoftwareSoap {

    private static final Logger LOG = Logger.getLogger(SoftwareSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowList(Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.NameResult softwareWindowList(Credentials credentials) {
        LOG.info("Executing operation softwareWindowList");
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwServerWs softwareServer, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwServerResponse softwareServerClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwServerWs softwareServer, Credentials credentials) {
        LOG.info("Executing operation softwareServerClone");
        System.out.println(cloneFromName);
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowCreate(Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwWindowResponse softwareWindowCreate(Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Credentials credentials) {
        LOG.info("Executing operation softwareWindowCreate");
        System.out.println(softwareWindow);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwWindowResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerCreate(Netspan.NBI_18_0.Software.SwServerWs softwareServer, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwServerResponse softwareServerCreate(Netspan.NBI_18_0.Software.SwServerWs softwareServer, Credentials credentials) {
        LOG.info("Executing operation softwareServerCreate");
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowGet(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwWindowResponse softwareWindowGet(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareWindowGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwWindowResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwWindowResponse softwareWindowUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Credentials credentials) {
        LOG.info("Executing operation softwareWindowUpdate");
        System.out.println(name);
        System.out.println(softwareWindow);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwWindowResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageGet(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwImageResponse softwareImageGet(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareImageGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareConfigSet(java.lang.String nodeName, Netspan.NBI_18_0.Software.SwConfigSetWs softwareDetails, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.NodeActionResult softwareConfigSet(java.lang.String nodeName, Netspan.NBI_18_0.Software.SwConfigSetWs softwareDetails, Credentials credentials) {
        LOG.info("Executing operation softwareConfigSet");
        System.out.println(nodeName);
        System.out.println(softwareDetails);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageDelete(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwImageResponse softwareImageDelete(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareImageDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerGet(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwServerResponse softwareServerGet(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareServerGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwWindowResponse softwareWindowClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwWindowWs softwareWindow, Credentials credentials) {
        LOG.info("Executing operation softwareWindowClone");
        System.out.println(cloneFromName);
        System.out.println(softwareWindow);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwWindowResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwServerWs softwareServer, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwServerResponse softwareServerUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwServerWs softwareServer, Credentials credentials) {
        LOG.info("Executing operation softwareServerUpdate");
        System.out.println(name);
        System.out.println(softwareServer);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwImageWs softwareImage, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwImageResponse softwareImageClone(java.lang.String cloneFromName, Netspan.NBI_18_0.Software.SwImageWs softwareImage, Credentials credentials) {
        LOG.info("Executing operation softwareImageClone");
        System.out.println(cloneFromName);
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareWindowDelete(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwWindowResponse softwareWindowDelete(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareWindowDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwWindowResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerList(Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.NameResult softwareServerList(Credentials credentials) {
        LOG.info("Executing operation softwareServerList");
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwImageWs softwareImage, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwImageResponse softwareImageUpdate(java.lang.String name, Netspan.NBI_18_0.Software.SwImageWs softwareImage, Credentials credentials) {
        LOG.info("Executing operation softwareImageUpdate");
        System.out.println(name);
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareServerDelete(java.util.List<java.lang.String> name, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwServerResponse softwareServerDelete(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation softwareServerDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwServerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageList(Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.NameResult softwareImageList(Credentials credentials) {
        LOG.info("Executing operation softwareImageList");
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareImageCreate(Netspan.NBI_18_0.Software.SwImageWs softwareImage, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SwImageResponse softwareImageCreate(Netspan.NBI_18_0.Software.SwImageWs softwareImage, Credentials credentials) {
        LOG.info("Executing operation softwareImageCreate");
        System.out.println(softwareImage);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SwImageResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_18_0.Software.SoftwareSoap#softwareStatusGet(java.util.List<java.lang.String> nodeName, Netspan.NBI_18_0.Software.Credentials credentials)*
     */
    public Netspan.NBI_18_0.Software.SoftwareStatusGetWs softwareStatusGet(java.util.List<java.lang.String> nodeName, Credentials credentials) {
        LOG.info("Executing operation softwareStatusGet");
        System.out.println(nodeName);
        System.out.println(credentials);
        try {
            Netspan.NBI_18_0.Software.SoftwareStatusGetWs _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
