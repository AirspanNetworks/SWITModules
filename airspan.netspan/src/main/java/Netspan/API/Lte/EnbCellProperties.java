package Netspan.API.Lte;

import Netspan.API.Enums.CellBarringPolicies;
import Netspan.API.Enums.CsgModes;

public class EnbCellProperties {
	public String cellNumber;
	public Integer cellIdForEci;
	public Integer cellIdentity28Bit;
	public Integer physicalLayerCellGroup;
	public Integer physicalLayerIdentity;
	public Integer physicalCellId;
	public Integer prachRsi;
	public Integer trackingAreaCode;
	public Integer emergencyAreaId;
	public Integer prachFreqOffset;
	public String cellAdvancedConfigurationProfile;
	public String radioProfile;
	public String mobilityProfile;
	public String embmsProfile;
	public String utranProfile;
	public String trafficManagementProfile;
	public String callTraceProfile;
	public CellBarringPolicies cellBarringPolicy;
	public CsgModes closedSubscriberGroupMode;
	public Boolean isEnabled;
}