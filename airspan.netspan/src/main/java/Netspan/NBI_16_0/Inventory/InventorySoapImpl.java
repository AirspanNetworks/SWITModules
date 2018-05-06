
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_16_0.Inventory;

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
 * 2017-10-02T12:10:53.509+03:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "Inventory",
                      portName = "InventorySoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://192.168.58.240/ws/16.0/Inventory.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_16_0.Inventory.InventorySoap")
                      
public class InventorySoapImpl implements InventorySoap {

    private static final Logger LOG = Logger.getLogger(InventorySoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteList(Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NameResult siteList(Credentials credentials) { 
        LOG.info("Executing operation siteList");
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeResetForcedCold(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeResetForcedCold(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeResetForcedCold");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeProvisioningStatusGet(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeProvisioningGetResult nodeProvisioningStatusGet(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeProvisioningStatusGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeProvisioningGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeReset(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)java.lang.Boolean  isResetRequired ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeReset(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,java.lang.Boolean isResetRequired,Credentials credentials) { 
        LOG.info("Executing operation nodeReset");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(isResetRequired);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeRfStatusGet(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeRfStatusGetResult nodeRfStatusGet(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeRfStatusGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeRfStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteUpdate(java.lang.String  name ,)Netspan.NBI_16_0.Inventory.Site  site ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.SiteActionResult siteUpdate(java.lang.String name,Netspan.NBI_16_0.Inventory.Site site,Credentials credentials) { 
        LOG.info("Executing operation siteUpdate");
        System.out.println(name);
        System.out.println(site);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.SiteActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeResetForced(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)java.lang.Boolean  isResetRequired ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeResetForced(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,java.lang.Boolean isResetRequired,Credentials credentials) { 
        LOG.info("Executing operation nodeResetForced");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(isResetRequired);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeManagementModeSet(java.util.List<Netspan.NBI_16_0.Inventory.NodeManagementMode>  nodeDetail ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeManagementModeSet(java.util.List<Netspan.NBI_16_0.Inventory.NodeManagementMode> nodeDetail,Credentials credentials) { 
        LOG.info("Executing operation nodeManagementModeSet");
        System.out.println(nodeDetail);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteDelete(java.util.List<java.lang.String>  siteName ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.SiteActionResult siteDelete(java.util.List<java.lang.String> siteName,Credentials credentials) { 
        LOG.info("Executing operation siteDelete");
        System.out.println(siteName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.SiteActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionList(Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NameResult regionList(Credentials credentials) { 
        LOG.info("Executing operation regionList");
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskUpdate(java.lang.String  name ,)Netspan.NBI_16_0.Inventory.DiscoveryTaskParameters  discoveryTask ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult discoveryTaskUpdate(java.lang.String name,Netspan.NBI_16_0.Inventory.DiscoveryTaskParameters discoveryTask,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskUpdate");
        System.out.println(name);
        System.out.println(discoveryTask);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionClone(java.lang.String  cloneFromName ,)Netspan.NBI_16_0.Inventory.Region  region ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.RegionActionResult regionClone(java.lang.String cloneFromName,Netspan.NBI_16_0.Inventory.Region region,Credentials credentials) { 
        LOG.info("Executing operation regionClone");
        System.out.println(cloneFromName);
        System.out.println(region);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.RegionActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeList(Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeListResult nodeList(Credentials credentials) { 
        LOG.info("Executing operation nodeList");
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeLatitudeLongitudeSet(java.lang.String  nodeName ,)java.math.BigDecimal  latitude ,)java.math.BigDecimal  longitude ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeLatitudeLongitudeSet(java.lang.String nodeName,java.math.BigDecimal latitude,java.math.BigDecimal longitude,Credentials credentials) { 
        LOG.info("Executing operation nodeLatitudeLongitudeSet");
        System.out.println(nodeName);
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeReprovision(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeReprovision(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeReprovision");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionCreate(Netspan.NBI_16_0.Inventory.Region  region ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.RegionActionResult regionCreate(Netspan.NBI_16_0.Inventory.Region region,Credentials credentials) { 
        LOG.info("Executing operation regionCreate");
        System.out.println(region);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.RegionActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeManagementModeGet(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeManagementModeGetResult nodeManagementModeGet(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeManagementModeGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeManagementModeGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteClone(java.lang.String  cloneFromName ,)Netspan.NBI_16_0.Inventory.Site  site ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.SiteActionResult siteClone(java.lang.String cloneFromName,Netspan.NBI_16_0.Inventory.Site site,Credentials credentials) { 
        LOG.info("Executing operation siteClone");
        System.out.println(cloneFromName);
        System.out.println(site);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.SiteActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskList(Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NameResult discoveryTaskList(Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskList");
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NameResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskGet(java.util.List<java.lang.String>  discoveryTaskName ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.DiscoveryTaskDetailGetResult discoveryTaskGet(java.util.List<java.lang.String> discoveryTaskName,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskGet");
        System.out.println(discoveryTaskName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.DiscoveryTaskDetailGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeInfoGet(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeDetailGetResult nodeInfoGet(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeInfoGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeDetailGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionGet(java.util.List<java.lang.String>  regionName ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.RegionDetailGetResult regionGet(java.util.List<java.lang.String> regionName,Credentials credentials) { 
        LOG.info("Executing operation regionGet");
        System.out.println(regionName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.RegionDetailGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskClone(java.lang.String  cloneFromName ,)Netspan.NBI_16_0.Inventory.DiscoveryTaskParameters  discoveryTask ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult discoveryTaskClone(java.lang.String cloneFromName,Netspan.NBI_16_0.Inventory.DiscoveryTaskParameters discoveryTask,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskClone");
        System.out.println(cloneFromName);
        System.out.println(discoveryTask);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionDelete(java.util.List<java.lang.String>  regionName ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.RegionActionResult regionDelete(java.util.List<java.lang.String> regionName,Credentials credentials) { 
        LOG.info("Executing operation regionDelete");
        System.out.println(regionName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.RegionActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeRename(java.lang.String  nodeNameOld ,)java.lang.String  nodeNameNew ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.WsResponse nodeRename(java.lang.String nodeNameOld,java.lang.String nodeNameNew,Credentials credentials) { 
        LOG.info("Executing operation nodeRename");
        System.out.println(nodeNameOld);
        System.out.println(nodeNameNew);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskAddSnmpV2(java.lang.String  name ,)java.lang.String  ipAddress ,)java.lang.Integer  port ,)java.lang.String  readCommunity ,)java.lang.String  writeCommunity ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.WsResponse discoveryTaskAddSnmpV2(java.lang.String name,java.lang.String ipAddress,java.lang.Integer port,java.lang.String readCommunity,java.lang.String writeCommunity,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskAddSnmpV2");
        System.out.println(name);
        System.out.println(ipAddress);
        System.out.println(port);
        System.out.println(readCommunity);
        System.out.println(writeCommunity);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskDelete(java.util.List<java.lang.String>  name ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult discoveryTaskDelete(java.util.List<java.lang.String> name,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskDelete");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.DiscoveryTaskActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#discoveryTaskAddSnmpV3(java.lang.String  name ,)java.lang.String  ipAddress ,)java.lang.Integer  port ,)Netspan.NBI_16_0.Inventory.Snmpv3UserNames  snmpUsername ,)java.lang.String  snmpPassword ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.WsResponse discoveryTaskAddSnmpV3(java.lang.String name,java.lang.String ipAddress,java.lang.Integer port,Netspan.NBI_16_0.Inventory.Snmpv3UserNames snmpUsername,java.lang.String snmpPassword,Credentials credentials) { 
        LOG.info("Executing operation discoveryTaskAddSnmpV3");
        System.out.println(name);
        System.out.println(ipAddress);
        System.out.println(port);
        System.out.println(snmpUsername);
        System.out.println(snmpPassword);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.WsResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#regionUpdate(java.lang.String  name ,)Netspan.NBI_16_0.Inventory.Region  region ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.RegionActionResult regionUpdate(java.lang.String name,Netspan.NBI_16_0.Inventory.Region region,Credentials credentials) { 
        LOG.info("Executing operation regionUpdate");
        System.out.println(name);
        System.out.println(region);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.RegionActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeTamperDetectReset(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeTamperDetectReset(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeTamperDetectReset");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteCreate(Netspan.NBI_16_0.Inventory.Site  site ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.SiteActionResult siteCreate(Netspan.NBI_16_0.Inventory.Site site,Credentials credentials) { 
        LOG.info("Executing operation siteCreate");
        System.out.println(site);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.SiteActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#siteGet(java.util.List<java.lang.String>  siteName ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.SiteDetailGetResult siteGet(java.util.List<java.lang.String> siteName,Credentials credentials) { 
        LOG.info("Executing operation siteGet");
        System.out.println(siteName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.SiteDetailGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_0.Inventory.InventorySoap#nodeDelete(java.util.List<java.lang.String>  nodeName ,)java.util.List<java.lang.String>  nodeId ,)Netspan.NBI_16_0.Inventory.Credentials  credentials )*
     */
    public Netspan.NBI_16_0.Inventory.NodeActionResult nodeDelete(java.util.List<java.lang.String> nodeName,java.util.List<java.lang.String> nodeId,Credentials credentials) { 
        LOG.info("Executing operation nodeDelete");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_0.Inventory.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
