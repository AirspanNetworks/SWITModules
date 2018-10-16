
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_16_5.Status;

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
 * 2018-10-14T13:44:05.503+03:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "Status",
                      portName = "StatusSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://192.168.58.233/ws/16.5/Status.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_16_5.Status.StatusSoap")

public class StatusSoapImpl implements StatusSoap {

    private static final Logger LOG = Logger.getLogger(StatusSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbResetRequiredStatusGet(java.util.List<java.lang.String> name, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.EnbResetRequiredStatusGetResult enbResetRequiredStatusGet(java.util.List<java.lang.String> name, Credentials credentials) {
        LOG.info("Executing operation enbResetRequiredStatusGet");
        System.out.println(name);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.EnbResetRequiredStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonDynamicIcicUnmanagedInterferenceStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonDynamicIcicUnmanagedInterferenceGetResult enbSonDynamicIcicUnmanagedInterferenceStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonDynamicIcicUnmanagedInterferenceStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonDynamicIcicUnmanagedInterferenceGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCSonStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonMcimGetResult enbCSonStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbCSonStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonMcimGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbMaintenanceWindowStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteMaintenanceWindowGetResult enbMaintenanceWindowStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbMaintenanceWindowStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteMaintenanceWindowGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#ib440RfStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.Ib440RfGetResult ib440RfStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation ib440RfStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.Ib440RfGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#ib440CommissionedPropertiesGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.Ib440CommissionedPropertiesGetResult ib440CommissionedPropertiesGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation ib440CommissionedPropertiesGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.Ib440CommissionedPropertiesGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodePtpGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodePtpGetResult nodePtpGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodePtpGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodePtpGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#iBridgeTermRfStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.IBridgeTermRfGetResult iBridgeTermRfStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation iBridgeTermRfStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.IBridgeTermRfGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonPciStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonPciGetResult enbSonPciStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonPciStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonPciGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCbrsStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteCbrsGetResult enbCbrsStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbCbrsStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteCbrsGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCachedCellStatusGet(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteCellStatusCachedListResult enbCachedCellStatusGet(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Credentials credentials) {
        LOG.info("Executing operation enbCachedCellStatusGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteCellStatusCachedListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbEmbmsStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeEmbmsGetResult enbEmbmsStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbEmbmsStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeEmbmsGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeGpsGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeGpsGetResult nodeGpsGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeGpsGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeGpsGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodePowerGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSensorGetResult nodePowerGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodePowerGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSensorGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#relayBulkStatusGet(java.util.List<java.lang.String> nodeName, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.RelayStatusGetResult relayBulkStatusGet(java.util.List<java.lang.String> nodeName, Credentials credentials) {
        LOG.info("Executing operation relayBulkStatusGet");
        System.out.println(nodeName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.RelayStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeVoltageGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSensorGetResult nodeVoltageGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeVoltageGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSensorGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbBackhaulInterfaceStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteBackhaulIfGetResult enbBackhaulInterfaceStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbBackhaulInterfaceStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteBackhaulIfGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeBatteryGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSensorGetResult nodeBatteryGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeBatteryGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSensorGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbConnectedUeStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteUeGetResult enbConnectedUeStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbConnectedUeStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteUeGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#relayEnbWifiStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.RelayEnbWifiGetResult relayEnbWifiStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation relayEnbWifiStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.RelayEnbWifiGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonRsiStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonRsiGetResult enbSonRsiStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonRsiStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonRsiGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#relayBulkCandidateDonorCellsListGet(java.util.List<java.lang.String> nodeName, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.RelayDonorCellListGetResult relayBulkCandidateDonorCellsListGet(java.util.List<java.lang.String> nodeName, Credentials credentials) {
        LOG.info("Executing operation relayBulkCandidateDonorCellsListGet");
        System.out.println(nodeName);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.RelayDonorCellListGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbNetworkElementStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteNetworkElementGetResult enbNetworkElementStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbNetworkElementStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteNetworkElementGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeCurrentGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSensorGetResult nodeCurrentGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeCurrentGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSensorGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#ib440InterfaceStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.Ib440InterfaceGetResult ib440InterfaceStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation ib440InterfaceStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.Ib440InterfaceGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeTimeGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeTimeStatusGetResult nodeTimeGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeTimeGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeTimeStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonAnrStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonAnrGetResult enbSonAnrStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonAnrStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonAnrGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbTwampStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteTwampGetResult enbTwampStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbTwampStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteTwampGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#locationAndSyncStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LocationAndSyncStatusResult locationAndSyncStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation locationAndSyncStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LocationAndSyncStatusResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeNlSyncStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeNLSyncStatusGetResult nodeNlSyncStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeNlSyncStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeNLSyncStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCellAcBarringStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteCellAcBarringGetResult enbCellAcBarringStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbCellAcBarringStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteCellAcBarringGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbIpThroughputStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteIpThroughputGetResult enbIpThroughputStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbIpThroughputStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteIpThroughputGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCachedUtraNeighbourStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.EnbUtraNeighbourStatusGetResult enbCachedUtraNeighbourStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbCachedUtraNeighbourStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.EnbUtraNeighbourStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonTpmStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonTpmGetResult enbSonTpmStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonTpmStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonTpmGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbBhQosStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteBhQosGetResult enbBhQosStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbBhQosStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteBhQosGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeSoftwareStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSoftwareGetResult nodeSoftwareStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeSoftwareStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSoftwareGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbRfStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteRfGetResult enbRfStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbRfStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteRfGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbEthernetPerPortStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteEthernetPerPortStatusGetResult enbEthernetPerPortStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbEthernetPerPortStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteEthernetPerPortStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonDynamicIcicStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonDynamicIcicGetResult enbSonDynamicIcicStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonDynamicIcicStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonDynamicIcicGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbWifiStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteWifiGetResult enbWifiStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbWifiStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteWifiGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSfpStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSfpStatusGetResult enbSfpStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSfpStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSfpStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbCachedAnrStatusGet(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteCachedAnrListResult enbCachedAnrStatusGet(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Credentials credentials) {
        LOG.info("Executing operation enbCachedAnrStatusGet");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteCachedAnrListResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#relayCandidateDonorCellsListGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.RelayDonorCellListGetResult relayCandidateDonorCellsListGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation relayCandidateDonorCellsListGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.RelayDonorCellListGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#nodeTemperatureGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.NodeSensorGetResult nodeTemperatureGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation nodeTemperatureGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.NodeSensorGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#iBridgeBaseRfStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.IBridgeBaseRfGetResult iBridgeBaseRfStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation iBridgeBaseRfStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.IBridgeBaseRfGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbUtraNeighbourStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.EnbUtraNeighbourStatusGetResult enbUtraNeighbourStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbUtraNeighbourStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.EnbUtraNeighbourStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#relayStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.RelayStatusGetResult relayStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation relayStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.RelayStatusGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_16_5.Status.StatusSoap#enbSonRachStatusGet(java.lang.String nodeNameOrId, Netspan.NBI_16_5.Status.Credentials credentials)*
     */
    public Netspan.NBI_16_5.Status.LteSonRachGetResult enbSonRachStatusGet(java.lang.String nodeNameOrId, Credentials credentials) {
        LOG.info("Executing operation enbSonRachStatusGet");
        System.out.println(nodeNameOrId);
        System.out.println(credentials);
        try {
            Netspan.NBI_16_5.Status.LteSonRachGetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
