package Netspan.API.Lte;

import Netspan.API.Enums.DuplexType;
import Netspan.API.Enums.EnabledDisabledStates;

public class LteBackhaul {
    public String name;
    public DuplexType ethernetDuplex;
    public String ethernetRate;
    public String portType;
    public EnabledDisabledStates autoNegConfig;
    public String portStatus;
    public String portSpeed;
    public EnabledDisabledStates flowControlStatus;
}