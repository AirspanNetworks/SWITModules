
package Netspan.NBI_15_2.Lte;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for EnbDetailsGetPnp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbDetailsGetPnp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hardware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ENodeBID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvancedConfigProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SyncProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomSyncProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbSyncProfileParams" minOccurs="0"/>
 *         &lt;element name="SecurityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SonProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MultiCellProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellToUse" type="{http://Airspan.Netspan.WebServices}CellToUseValues" minOccurs="0"/>
 *         &lt;element name="Min20MHzChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Max20MHzChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Min40MHzChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Max40MHzChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LteCell" type="{http://Airspan.Netspan.WebServices}LteCellGetWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActiveAntenna" type="{http://Airspan.Netspan.WebServices}ActiveAntenna" minOccurs="0"/>
 *         &lt;element name="LongSbaEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="LongAntennaBeam" type="{http://Airspan.Netspan.WebServices}SupportedAntennaBeams" minOccurs="0"/>
 *         &lt;element name="LongAntenna45" type="{http://Airspan.Netspan.WebServices}ActiveValues" minOccurs="0"/>
 *         &lt;element name="LongAntenna135" type="{http://Airspan.Netspan.WebServices}ActiveValues" minOccurs="0"/>
 *         &lt;element name="LongAntenna225" type="{http://Airspan.Netspan.WebServices}ActiveValues" minOccurs="0"/>
 *         &lt;element name="LongAntenna315" type="{http://Airspan.Netspan.WebServices}ActiveValues" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForManagement" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="ManagementIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsS1CInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForS1C" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="S1CIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S1CSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsS1UInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForS1U" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="S1UIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S1USubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsX2CInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForX2C" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="X2CIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X2CSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsX2UInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForX2U" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="X2UIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X2USubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCallTraceInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForCallTrace" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="CallTraceIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTraceSubNetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPtpSlaveInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForPtpSlave" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="PtpSlaveIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtpSlaveSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCSonServerInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForCSonServer" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="CSonServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSonServerSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsM2InterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForM2" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="M2IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M2SubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsM1InterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterfaceToUseForM1" type="{http://Airspan.Netspan.WebServices}InterfaceTypes" minOccurs="0"/>
 *         &lt;element name="M1IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M1SubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpRouteList" type="{http://Airspan.Netspan.WebServices}IpRouteListContainer" minOccurs="0"/>
 *         &lt;element name="IsAutoX2ControlForNeighboursEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsX2ConfigurationUpdateForNeighboursEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultX2ControlStateForNeighbours" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes" minOccurs="0"/>
 *         &lt;element name="LedMode" type="{http://Airspan.Netspan.WebServices}LedModeValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbDetailsGetPnp", propOrder = {
    "name",
    "hardware",
    "description",
    "site",
    "region",
    "latitude",
    "longitude",
    "altitude",
    "accuracy",
    "eNodeBID",
    "systemDefaultProfile",
    "advancedConfigProfile",
    "networkProfile",
    "syncProfile",
    "customSyncProfileParameters",
    "securityProfile",
    "sonProfile",
    "managementProfile",
    "multiCellProfile",
    "cellToUse",
    "min20MHzChannel",
    "max20MHzChannel",
    "min40MHzChannel",
    "max40MHzChannel",
    "lteCell",
    "activeAntenna",
    "longSbaEnable",
    "longAntennaBeam",
    "longAntenna45",
    "longAntenna135",
    "longAntenna225",
    "longAntenna315",
    "interfaceToUseForManagement",
    "managementIpAddress",
    "managementSubnetMask",
    "isS1CInterfaceEnabled",
    "interfaceToUseForS1C",
    "s1CIpAddress",
    "s1CSubnetMask",
    "isS1UInterfaceEnabled",
    "interfaceToUseForS1U",
    "s1UIpAddress",
    "s1USubnetMask",
    "isX2CInterfaceEnabled",
    "interfaceToUseForX2C",
    "x2CIpAddress",
    "x2CSubnetMask",
    "isX2UInterfaceEnabled",
    "interfaceToUseForX2U",
    "x2UIpAddress",
    "x2USubnetMask",
    "isCallTraceInterfaceEnabled",
    "interfaceToUseForCallTrace",
    "callTraceIpAddress",
    "callTraceSubNetMask",
    "isPtpSlaveInterfaceEnabled",
    "interfaceToUseForPtpSlave",
    "ptpSlaveIpAddress",
    "ptpSlaveSubnetMask",
    "isCSonServerInterfaceEnabled",
    "interfaceToUseForCSonServer",
    "cSonServerIpAddress",
    "cSonServerSubnetMask",
    "isM2InterfaceEnabled",
    "interfaceToUseForM2",
    "m2IpAddress",
    "m2SubnetMask",
    "isM1InterfaceEnabled",
    "interfaceToUseForM1",
    "m1IpAddress",
    "m1SubnetMask",
    "ipRouteList",
    "isAutoX2ControlForNeighboursEnabled",
    "isX2ConfigurationUpdateForNeighboursEnabled",
    "defaultX2ControlStateForNeighbours",
    "ledMode"
})
@XmlSeeAlso({
    EnbDetailsGet.class
})
public class EnbDetailsGetPnp {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Hardware")
    protected String hardware;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElementRef(name = "Latitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "Altitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> altitude;
    @XmlElementRef(name = "Accuracy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> accuracy;
    @XmlElementRef(name = "ENodeBID", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eNodeBID;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "AdvancedConfigProfile")
    protected String advancedConfigProfile;
    @XmlElement(name = "NetworkProfile")
    protected String networkProfile;
    @XmlElement(name = "SyncProfile")
    protected String syncProfile;
    @XmlElement(name = "CustomSyncProfileParameters")
    protected EnbSyncProfileParams customSyncProfileParameters;
    @XmlElement(name = "SecurityProfile")
    protected String securityProfile;
    @XmlElement(name = "SonProfile")
    protected String sonProfile;
    @XmlElement(name = "ManagementProfile")
    protected String managementProfile;
    @XmlElement(name = "MultiCellProfile")
    protected String multiCellProfile;
    @XmlElementRef(name = "CellToUse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CellToUseValues> cellToUse;
    @XmlElementRef(name = "Min20MHzChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> min20MHzChannel;
    @XmlElementRef(name = "Max20MHzChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> max20MHzChannel;
    @XmlElementRef(name = "Min40MHzChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> min40MHzChannel;
    @XmlElementRef(name = "Max40MHzChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> max40MHzChannel;
    @XmlElement(name = "LteCell")
    protected List<LteCellGetWs> lteCell;
    @XmlElementRef(name = "ActiveAntenna", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeAntenna;
    @XmlElementRef(name = "LongSbaEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> longSbaEnable;
    @XmlElementRef(name = "LongAntennaBeam", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SupportedAntennaBeams> longAntennaBeam;
    @XmlElementRef(name = "LongAntenna45", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveValues> longAntenna45;
    @XmlElementRef(name = "LongAntenna135", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveValues> longAntenna135;
    @XmlElementRef(name = "LongAntenna225", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveValues> longAntenna225;
    @XmlElementRef(name = "LongAntenna315", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveValues> longAntenna315;
    @XmlElementRef(name = "InterfaceToUseForManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForManagement;
    @XmlElement(name = "ManagementIpAddress")
    protected String managementIpAddress;
    @XmlElement(name = "ManagementSubnetMask")
    protected String managementSubnetMask;
    @XmlElementRef(name = "IsS1CInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isS1CInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForS1C", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForS1C;
    @XmlElement(name = "S1CIpAddress")
    protected String s1CIpAddress;
    @XmlElement(name = "S1CSubnetMask")
    protected String s1CSubnetMask;
    @XmlElementRef(name = "IsS1UInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isS1UInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForS1U", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForS1U;
    @XmlElement(name = "S1UIpAddress")
    protected String s1UIpAddress;
    @XmlElement(name = "S1USubnetMask")
    protected String s1USubnetMask;
    @XmlElementRef(name = "IsX2CInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isX2CInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForX2C", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForX2C;
    @XmlElement(name = "X2CIpAddress")
    protected String x2CIpAddress;
    @XmlElement(name = "X2CSubnetMask")
    protected String x2CSubnetMask;
    @XmlElementRef(name = "IsX2UInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isX2UInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForX2U", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForX2U;
    @XmlElement(name = "X2UIpAddress")
    protected String x2UIpAddress;
    @XmlElement(name = "X2USubnetMask")
    protected String x2USubnetMask;
    @XmlElementRef(name = "IsCallTraceInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isCallTraceInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForCallTrace", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForCallTrace;
    @XmlElement(name = "CallTraceIpAddress")
    protected String callTraceIpAddress;
    @XmlElement(name = "CallTraceSubNetMask")
    protected String callTraceSubNetMask;
    @XmlElementRef(name = "IsPtpSlaveInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isPtpSlaveInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForPtpSlave", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForPtpSlave;
    @XmlElement(name = "PtpSlaveIpAddress")
    protected String ptpSlaveIpAddress;
    @XmlElement(name = "PtpSlaveSubnetMask")
    protected String ptpSlaveSubnetMask;
    @XmlElementRef(name = "IsCSonServerInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isCSonServerInterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForCSonServer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForCSonServer;
    @XmlElement(name = "CSonServerIpAddress")
    protected String cSonServerIpAddress;
    @XmlElement(name = "CSonServerSubnetMask")
    protected String cSonServerSubnetMask;
    @XmlElementRef(name = "IsM2InterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isM2InterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForM2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForM2;
    @XmlElement(name = "M2IpAddress")
    protected String m2IpAddress;
    @XmlElement(name = "M2SubnetMask")
    protected String m2SubnetMask;
    @XmlElementRef(name = "IsM1InterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isM1InterfaceEnabled;
    @XmlElementRef(name = "InterfaceToUseForM1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceToUseForM1;
    @XmlElement(name = "M1IpAddress")
    protected String m1IpAddress;
    @XmlElement(name = "M1SubnetMask")
    protected String m1SubnetMask;
    @XmlElement(name = "IpRouteList")
    protected IpRouteListContainer ipRouteList;
    @XmlElementRef(name = "IsAutoX2ControlForNeighboursEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAutoX2ControlForNeighboursEnabled;
    @XmlElementRef(name = "IsX2ConfigurationUpdateForNeighboursEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isX2ConfigurationUpdateForNeighboursEnabled;
    @XmlElementRef(name = "DefaultX2ControlStateForNeighbours", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<X2ControlStateTypes> defaultX2ControlStateForNeighbours;
    @XmlElementRef(name = "LedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<LedModeValues> ledMode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardware(String value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<Integer> value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccuracy(JAXBElement<Integer> value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the eNodeBID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getENodeBID() {
        return eNodeBID;
    }

    /**
     * Sets the value of the eNodeBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setENodeBID(JAXBElement<Integer> value) {
        this.eNodeBID = value;
    }

    /**
     * Gets the value of the systemDefaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDefaultProfile() {
        return systemDefaultProfile;
    }

    /**
     * Sets the value of the systemDefaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDefaultProfile(String value) {
        this.systemDefaultProfile = value;
    }

    /**
     * Gets the value of the advancedConfigProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedConfigProfile() {
        return advancedConfigProfile;
    }

    /**
     * Sets the value of the advancedConfigProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedConfigProfile(String value) {
        this.advancedConfigProfile = value;
    }

    /**
     * Gets the value of the networkProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkProfile() {
        return networkProfile;
    }

    /**
     * Sets the value of the networkProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkProfile(String value) {
        this.networkProfile = value;
    }

    /**
     * Gets the value of the syncProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncProfile() {
        return syncProfile;
    }

    /**
     * Sets the value of the syncProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncProfile(String value) {
        this.syncProfile = value;
    }

    /**
     * Gets the value of the customSyncProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbSyncProfileParams }
     *     
     */
    public EnbSyncProfileParams getCustomSyncProfileParameters() {
        return customSyncProfileParameters;
    }

    /**
     * Sets the value of the customSyncProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbSyncProfileParams }
     *     
     */
    public void setCustomSyncProfileParameters(EnbSyncProfileParams value) {
        this.customSyncProfileParameters = value;
    }

    /**
     * Gets the value of the securityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityProfile() {
        return securityProfile;
    }

    /**
     * Sets the value of the securityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityProfile(String value) {
        this.securityProfile = value;
    }

    /**
     * Gets the value of the sonProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonProfile() {
        return sonProfile;
    }

    /**
     * Sets the value of the sonProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonProfile(String value) {
        this.sonProfile = value;
    }

    /**
     * Gets the value of the managementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementProfile() {
        return managementProfile;
    }

    /**
     * Sets the value of the managementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementProfile(String value) {
        this.managementProfile = value;
    }

    /**
     * Gets the value of the multiCellProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiCellProfile() {
        return multiCellProfile;
    }

    /**
     * Sets the value of the multiCellProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiCellProfile(String value) {
        this.multiCellProfile = value;
    }

    /**
     * Gets the value of the cellToUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellToUseValues }{@code >}
     *     
     */
    public JAXBElement<CellToUseValues> getCellToUse() {
        return cellToUse;
    }

    /**
     * Sets the value of the cellToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellToUseValues }{@code >}
     *     
     */
    public void setCellToUse(JAXBElement<CellToUseValues> value) {
        this.cellToUse = value;
    }

    /**
     * Gets the value of the min20MHzChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMin20MHzChannel() {
        return min20MHzChannel;
    }

    /**
     * Sets the value of the min20MHzChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMin20MHzChannel(JAXBElement<Integer> value) {
        this.min20MHzChannel = value;
    }

    /**
     * Gets the value of the max20MHzChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMax20MHzChannel() {
        return max20MHzChannel;
    }

    /**
     * Sets the value of the max20MHzChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMax20MHzChannel(JAXBElement<Integer> value) {
        this.max20MHzChannel = value;
    }

    /**
     * Gets the value of the min40MHzChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMin40MHzChannel() {
        return min40MHzChannel;
    }

    /**
     * Sets the value of the min40MHzChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMin40MHzChannel(JAXBElement<Integer> value) {
        this.min40MHzChannel = value;
    }

    /**
     * Gets the value of the max40MHzChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMax40MHzChannel() {
        return max40MHzChannel;
    }

    /**
     * Sets the value of the max40MHzChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMax40MHzChannel(JAXBElement<Integer> value) {
        this.max40MHzChannel = value;
    }

    /**
     * Gets the value of the lteCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteCellGetWs }
     * 
     * 
     */
    public List<LteCellGetWs> getLteCell() {
        if (lteCell == null) {
            lteCell = new ArrayList<LteCellGetWs>();
        }
        return this.lteCell;
    }

    /**
     * Gets the value of the activeAntenna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveAntenna() {
        return activeAntenna;
    }

    /**
     * Sets the value of the activeAntenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveAntenna(JAXBElement<String> value) {
        this.activeAntenna = value;
    }

    /**
     * Gets the value of the longSbaEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLongSbaEnable() {
        return longSbaEnable;
    }

    /**
     * Sets the value of the longSbaEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLongSbaEnable(JAXBElement<EnabledDisabledStates> value) {
        this.longSbaEnable = value;
    }

    /**
     * Gets the value of the longAntennaBeam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupportedAntennaBeams }{@code >}
     *     
     */
    public JAXBElement<SupportedAntennaBeams> getLongAntennaBeam() {
        return longAntennaBeam;
    }

    /**
     * Sets the value of the longAntennaBeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupportedAntennaBeams }{@code >}
     *     
     */
    public void setLongAntennaBeam(JAXBElement<SupportedAntennaBeams> value) {
        this.longAntennaBeam = value;
    }

    /**
     * Gets the value of the longAntenna45 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public JAXBElement<ActiveValues> getLongAntenna45() {
        return longAntenna45;
    }

    /**
     * Sets the value of the longAntenna45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public void setLongAntenna45(JAXBElement<ActiveValues> value) {
        this.longAntenna45 = value;
    }

    /**
     * Gets the value of the longAntenna135 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public JAXBElement<ActiveValues> getLongAntenna135() {
        return longAntenna135;
    }

    /**
     * Sets the value of the longAntenna135 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public void setLongAntenna135(JAXBElement<ActiveValues> value) {
        this.longAntenna135 = value;
    }

    /**
     * Gets the value of the longAntenna225 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public JAXBElement<ActiveValues> getLongAntenna225() {
        return longAntenna225;
    }

    /**
     * Sets the value of the longAntenna225 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public void setLongAntenna225(JAXBElement<ActiveValues> value) {
        this.longAntenna225 = value;
    }

    /**
     * Gets the value of the longAntenna315 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public JAXBElement<ActiveValues> getLongAntenna315() {
        return longAntenna315;
    }

    /**
     * Sets the value of the longAntenna315 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveValues }{@code >}
     *     
     */
    public void setLongAntenna315(JAXBElement<ActiveValues> value) {
        this.longAntenna315 = value;
    }

    /**
     * Gets the value of the interfaceToUseForManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForManagement() {
        return interfaceToUseForManagement;
    }

    /**
     * Sets the value of the interfaceToUseForManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForManagement(JAXBElement<String> value) {
        this.interfaceToUseForManagement = value;
    }

    /**
     * Gets the value of the managementIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementIpAddress() {
        return managementIpAddress;
    }

    /**
     * Sets the value of the managementIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementIpAddress(String value) {
        this.managementIpAddress = value;
    }

    /**
     * Gets the value of the managementSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementSubnetMask() {
        return managementSubnetMask;
    }

    /**
     * Sets the value of the managementSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementSubnetMask(String value) {
        this.managementSubnetMask = value;
    }

    /**
     * Gets the value of the isS1CInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsS1CInterfaceEnabled() {
        return isS1CInterfaceEnabled;
    }

    /**
     * Sets the value of the isS1CInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsS1CInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isS1CInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForS1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForS1C() {
        return interfaceToUseForS1C;
    }

    /**
     * Sets the value of the interfaceToUseForS1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForS1C(JAXBElement<String> value) {
        this.interfaceToUseForS1C = value;
    }

    /**
     * Gets the value of the s1CIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1CIpAddress() {
        return s1CIpAddress;
    }

    /**
     * Sets the value of the s1CIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1CIpAddress(String value) {
        this.s1CIpAddress = value;
    }

    /**
     * Gets the value of the s1CSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1CSubnetMask() {
        return s1CSubnetMask;
    }

    /**
     * Sets the value of the s1CSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1CSubnetMask(String value) {
        this.s1CSubnetMask = value;
    }

    /**
     * Gets the value of the isS1UInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsS1UInterfaceEnabled() {
        return isS1UInterfaceEnabled;
    }

    /**
     * Sets the value of the isS1UInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsS1UInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isS1UInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForS1U property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForS1U() {
        return interfaceToUseForS1U;
    }

    /**
     * Sets the value of the interfaceToUseForS1U property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForS1U(JAXBElement<String> value) {
        this.interfaceToUseForS1U = value;
    }

    /**
     * Gets the value of the s1UIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1UIpAddress() {
        return s1UIpAddress;
    }

    /**
     * Sets the value of the s1UIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1UIpAddress(String value) {
        this.s1UIpAddress = value;
    }

    /**
     * Gets the value of the s1USubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1USubnetMask() {
        return s1USubnetMask;
    }

    /**
     * Sets the value of the s1USubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1USubnetMask(String value) {
        this.s1USubnetMask = value;
    }

    /**
     * Gets the value of the isX2CInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsX2CInterfaceEnabled() {
        return isX2CInterfaceEnabled;
    }

    /**
     * Sets the value of the isX2CInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsX2CInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isX2CInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForX2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForX2C() {
        return interfaceToUseForX2C;
    }

    /**
     * Sets the value of the interfaceToUseForX2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForX2C(JAXBElement<String> value) {
        this.interfaceToUseForX2C = value;
    }

    /**
     * Gets the value of the x2CIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2CIpAddress() {
        return x2CIpAddress;
    }

    /**
     * Sets the value of the x2CIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2CIpAddress(String value) {
        this.x2CIpAddress = value;
    }

    /**
     * Gets the value of the x2CSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2CSubnetMask() {
        return x2CSubnetMask;
    }

    /**
     * Sets the value of the x2CSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2CSubnetMask(String value) {
        this.x2CSubnetMask = value;
    }

    /**
     * Gets the value of the isX2UInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsX2UInterfaceEnabled() {
        return isX2UInterfaceEnabled;
    }

    /**
     * Sets the value of the isX2UInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsX2UInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isX2UInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForX2U property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForX2U() {
        return interfaceToUseForX2U;
    }

    /**
     * Sets the value of the interfaceToUseForX2U property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForX2U(JAXBElement<String> value) {
        this.interfaceToUseForX2U = value;
    }

    /**
     * Gets the value of the x2UIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2UIpAddress() {
        return x2UIpAddress;
    }

    /**
     * Sets the value of the x2UIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2UIpAddress(String value) {
        this.x2UIpAddress = value;
    }

    /**
     * Gets the value of the x2USubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2USubnetMask() {
        return x2USubnetMask;
    }

    /**
     * Sets the value of the x2USubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2USubnetMask(String value) {
        this.x2USubnetMask = value;
    }

    /**
     * Gets the value of the isCallTraceInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsCallTraceInterfaceEnabled() {
        return isCallTraceInterfaceEnabled;
    }

    /**
     * Sets the value of the isCallTraceInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsCallTraceInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isCallTraceInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForCallTrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForCallTrace() {
        return interfaceToUseForCallTrace;
    }

    /**
     * Sets the value of the interfaceToUseForCallTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForCallTrace(JAXBElement<String> value) {
        this.interfaceToUseForCallTrace = value;
    }

    /**
     * Gets the value of the callTraceIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceIpAddress() {
        return callTraceIpAddress;
    }

    /**
     * Sets the value of the callTraceIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceIpAddress(String value) {
        this.callTraceIpAddress = value;
    }

    /**
     * Gets the value of the callTraceSubNetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceSubNetMask() {
        return callTraceSubNetMask;
    }

    /**
     * Sets the value of the callTraceSubNetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceSubNetMask(String value) {
        this.callTraceSubNetMask = value;
    }

    /**
     * Gets the value of the isPtpSlaveInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsPtpSlaveInterfaceEnabled() {
        return isPtpSlaveInterfaceEnabled;
    }

    /**
     * Sets the value of the isPtpSlaveInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsPtpSlaveInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isPtpSlaveInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForPtpSlave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForPtpSlave() {
        return interfaceToUseForPtpSlave;
    }

    /**
     * Sets the value of the interfaceToUseForPtpSlave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForPtpSlave(JAXBElement<String> value) {
        this.interfaceToUseForPtpSlave = value;
    }

    /**
     * Gets the value of the ptpSlaveIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpSlaveIpAddress() {
        return ptpSlaveIpAddress;
    }

    /**
     * Sets the value of the ptpSlaveIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpSlaveIpAddress(String value) {
        this.ptpSlaveIpAddress = value;
    }

    /**
     * Gets the value of the ptpSlaveSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpSlaveSubnetMask() {
        return ptpSlaveSubnetMask;
    }

    /**
     * Sets the value of the ptpSlaveSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpSlaveSubnetMask(String value) {
        this.ptpSlaveSubnetMask = value;
    }

    /**
     * Gets the value of the isCSonServerInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsCSonServerInterfaceEnabled() {
        return isCSonServerInterfaceEnabled;
    }

    /**
     * Sets the value of the isCSonServerInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsCSonServerInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isCSonServerInterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForCSonServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForCSonServer() {
        return interfaceToUseForCSonServer;
    }

    /**
     * Sets the value of the interfaceToUseForCSonServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForCSonServer(JAXBElement<String> value) {
        this.interfaceToUseForCSonServer = value;
    }

    /**
     * Gets the value of the cSonServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonServerIpAddress() {
        return cSonServerIpAddress;
    }

    /**
     * Sets the value of the cSonServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonServerIpAddress(String value) {
        this.cSonServerIpAddress = value;
    }

    /**
     * Gets the value of the cSonServerSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonServerSubnetMask() {
        return cSonServerSubnetMask;
    }

    /**
     * Sets the value of the cSonServerSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonServerSubnetMask(String value) {
        this.cSonServerSubnetMask = value;
    }

    /**
     * Gets the value of the isM2InterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsM2InterfaceEnabled() {
        return isM2InterfaceEnabled;
    }

    /**
     * Sets the value of the isM2InterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsM2InterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isM2InterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForM2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForM2() {
        return interfaceToUseForM2;
    }

    /**
     * Sets the value of the interfaceToUseForM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForM2(JAXBElement<String> value) {
        this.interfaceToUseForM2 = value;
    }

    /**
     * Gets the value of the m2IpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM2IpAddress() {
        return m2IpAddress;
    }

    /**
     * Sets the value of the m2IpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM2IpAddress(String value) {
        this.m2IpAddress = value;
    }

    /**
     * Gets the value of the m2SubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM2SubnetMask() {
        return m2SubnetMask;
    }

    /**
     * Sets the value of the m2SubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM2SubnetMask(String value) {
        this.m2SubnetMask = value;
    }

    /**
     * Gets the value of the isM1InterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsM1InterfaceEnabled() {
        return isM1InterfaceEnabled;
    }

    /**
     * Sets the value of the isM1InterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsM1InterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.isM1InterfaceEnabled = value;
    }

    /**
     * Gets the value of the interfaceToUseForM1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceToUseForM1() {
        return interfaceToUseForM1;
    }

    /**
     * Sets the value of the interfaceToUseForM1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceToUseForM1(JAXBElement<String> value) {
        this.interfaceToUseForM1 = value;
    }

    /**
     * Gets the value of the m1IpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM1IpAddress() {
        return m1IpAddress;
    }

    /**
     * Sets the value of the m1IpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM1IpAddress(String value) {
        this.m1IpAddress = value;
    }

    /**
     * Gets the value of the m1SubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM1SubnetMask() {
        return m1SubnetMask;
    }

    /**
     * Sets the value of the m1SubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM1SubnetMask(String value) {
        this.m1SubnetMask = value;
    }

    /**
     * Gets the value of the ipRouteList property.
     * 
     * @return
     *     possible object is
     *     {@link IpRouteListContainer }
     *     
     */
    public IpRouteListContainer getIpRouteList() {
        return ipRouteList;
    }

    /**
     * Sets the value of the ipRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRouteListContainer }
     *     
     */
    public void setIpRouteList(IpRouteListContainer value) {
        this.ipRouteList = value;
    }

    /**
     * Gets the value of the isAutoX2ControlForNeighboursEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAutoX2ControlForNeighboursEnabled() {
        return isAutoX2ControlForNeighboursEnabled;
    }

    /**
     * Sets the value of the isAutoX2ControlForNeighboursEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAutoX2ControlForNeighboursEnabled(JAXBElement<Boolean> value) {
        this.isAutoX2ControlForNeighboursEnabled = value;
    }

    /**
     * Gets the value of the isX2ConfigurationUpdateForNeighboursEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsX2ConfigurationUpdateForNeighboursEnabled() {
        return isX2ConfigurationUpdateForNeighboursEnabled;
    }

    /**
     * Sets the value of the isX2ConfigurationUpdateForNeighboursEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsX2ConfigurationUpdateForNeighboursEnabled(JAXBElement<Boolean> value) {
        this.isX2ConfigurationUpdateForNeighboursEnabled = value;
    }

    /**
     * Gets the value of the defaultX2ControlStateForNeighbours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<X2ControlStateTypes> getDefaultX2ControlStateForNeighbours() {
        return defaultX2ControlStateForNeighbours;
    }

    /**
     * Sets the value of the defaultX2ControlStateForNeighbours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public void setDefaultX2ControlStateForNeighbours(JAXBElement<X2ControlStateTypes> value) {
        this.defaultX2ControlStateForNeighbours = value;
    }

    /**
     * Gets the value of the ledMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LedModeValues }{@code >}
     *     
     */
    public JAXBElement<LedModeValues> getLedMode() {
        return ledMode;
    }

    /**
     * Sets the value of the ledMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LedModeValues }{@code >}
     *     
     */
    public void setLedMode(JAXBElement<LedModeValues> value) {
        this.ledMode = value;
    }

}
