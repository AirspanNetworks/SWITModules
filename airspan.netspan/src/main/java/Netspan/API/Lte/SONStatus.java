package Netspan.API.Lte;

import java.util.ArrayList;
import java.util.List;

public class SONStatus {
	public String nodeName = null;
	public String nodeId = null;
	public String pciStatus = null; // Manual or Automatic
	public List<PciStatusCell> PCICells = new ArrayList<PciStatusCell>();
	public List<RsiStatusCell> RSICell = new ArrayList<RsiStatusCell>();
}
