package DMTool;/*public class myMain {	public static void main(String[] args) {						DMtool dm = new DMtool("192.168.15.1");				sqnCellReselectionInfo info = dm.getSibStatus();				dm.getMeasCfgReport();		dm.end();		  /*DccInitConfig dccinit = new DccInitConfig();				  DccStdOut out = new DccStdOut();		  		  dccinit.serverIp="192.168.15.1";		  dccinit.serverPort=7772;		  dccinit.consoleOutput = out;*/		  			// DC NTF		  //dccinit.use = new DccUsing();			// Services NTF			/** Device info. */		  //dccinit.device = new DeviceInfoClient();			/** Debug. */		  //dccinit.dbg = new DbgClient();			/** Event. */		  //dccinit.evt = new EvtClient();			/** Connection. */		  //dccinit.cnx = new CnxClient();			/** DCM */		 // dccinit.dcm = new DcmClient();			/** UE info. */		 // dccinit.ue = new UeClient();			/** Has. */		  //dccinit.has = new HasClient();			/** Mts. */		 // dccinit.mts = new MtsClient();			/** Wrat. */		 // dccinit.wrat = new WratClient();		  		  		  		  /*DeviceController dc = new DeviceController(dccinit, true);		  agscUeImpl clt = new agscUeImpl();		  UeClient uec = new UeClient();		  clt.initialize(uec);*/		  		  		  		  /*agscWratImpl clt1 = new agscWratImpl();		  WratClient c = new WratClient();		  clt1.initialize(c);*/		  		  //agscDbgImpl clt2 = new agscDbgImpl();		  //DbgClient dbg = new DbgClient();		  //clt2.initialize(dbg);		  		  //DeviceController.registerClient(clt); DC initialize do it		  //DeviceController.registerClient(clt2);		  		  /*dc.startDc();		  		  try {				Thread.sleep(5000);			} catch (InterruptedException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}*/		  		  /*OutValue<sqnCellReselectionInfo> info = new OutValue<sqnCellReselectionInfo>(new sqnCellReselectionInfo());		  agscUeImpl.GetCellReselectionInfo(info);*/		  		  		  		  //DeviceController.registerClient(clt1);		  //DeviceController.registerClient(clt2);		  		  		  		  		  				  //OutValue<Integer> minFreq=new OutValue<Integer>(100); 		  //OutValue<String> result=new OutValue<String>("123"); 		 //clt2.Cli("fsmShow", minFreq, result);		//clt2.Cli("showSiConfig", minFreq, result);		//clt2.Cli("showMeasCfgReport", minFreq, result);				 /* OutValue<Integer> minFreq=new OutValue<Integer>(3400); 		  OutValue<Integer> maxFreq=new OutValue<Integer>(3600); 		  		  int x=DeviceInfo.GetRfFrequency(minFreq, maxFreq);		  System.out.println(x);		  		  OutValue<String> str1=new OutValue<String>("alBalB"); 		  x=DeviceInfo.GetBoardName(str1);		  System.out.println(str1);		  		  OutValue<String> str2=new OutValue<String>("BlaBla"); 		  x=DeviceInfo.GetPlatformName(str2);		  System.out.println(str2);		  		  /*dc.initService("GetImsConfig", 0x80040052);762efe5d		  		  		  UeClient uec = new UeClient();		  Ue.UeInitialize(uec);		  OutValue<MmUeState> _offset = new OutValue<MmUeState>();		  Ue.GetNetworkStatus(_offset);		  		  //System.out.println(a);*/			  //dc.stopDc();		  		  //dc.startDc();		  //clt2.Cli("fsmShow", minFreq, result);		  //dc.stopDc();/*		  return;			}}*/