import STCImp.STCChassis;

/**
 * Created by iagmon on 09-Nov-16.
 */
class STCTest {
    static STCChassis tg = new STCChassis();
   
    public static void main(String[] args) throws Exception
    {
    	tg.setRestMachineIP("192.168.58.201");
    	tg.setRestMachineAlts("192.168.58.200,192.168.58.201");
    	tg.init();
    	tg.setDefultConfigFile("C:\\Users\\sshahaf\\Documents\\Spirent\\SETUP19.tcc");
    	tg.Connect();
    	tg.Connect();
    	tg.Connect();
    	tg.closeAllConnections();
//    	tg.isConnected();
//    	tg.LoadConfigFile("C:\\Users\\sshahaf\\Documents\\Spirent\\SETUP19.tcc");
//    	tg.configPortLoad(new Double(10000), new Double(1000));
    }
}
