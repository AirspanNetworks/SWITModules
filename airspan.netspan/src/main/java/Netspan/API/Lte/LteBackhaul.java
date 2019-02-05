package Netspan.API.Lte;

import Netspan.API.Enums.DuplexType;
import Netspan.API.Enums.EnabledStates;

public class LteBackhaul {
    public String name;
    public DuplexType ethernetDuplex;
    public String ethernetRate;
    public String portType;
    public EnabledStates autoNegConfig;
    public String portStatus;
    public String portSpeed;
    public EnabledStates flowControlStatus;
}