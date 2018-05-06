package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by iagmon on 16-Nov-16.
 */
public class STCPort {
	//port = "port+<number>"
    public String port;
    private String portName;
    public ArrayList<STCStreamBlock> streams;
    private HashMap<String,String> rawData = new HashMap<String,String>();
    
    public int getIndexUE(String appName, ArrayList<LoadParam> load){
    	for(int i=0;i<load.size();i++){
    		String temp = appName.replaceAll("\\D+", "").trim();
    		StringBuilder app = new StringBuilder();
    		LoadParam lp = load.get(i);
    		String toComp = String.valueOf(lp.getUEnum())+lp.getQci();
    		if(temp.equals(toComp)){
    			return i;
    		}
    	}
    	return -1;
    }
  
    public String getPortProfile(){
    	return "Port number: "+ port;
    }
    
    public String getName(){
    	return port;
    }
    
    /**
     * UL/DL
     */
    public String getPortName(){
    	if(portName == null || portName.isEmpty()){
    		try{
    		 String temp = rawData.get("Name");
    		 this.portName = temp.substring(0,2); 
    		}catch(Exception e){
    			System.out.println("Error in parsing port Name(UL/DL) from STCPort Object");
    			return null;
    		}
    	}
    	return this.portName;
    }
    
    /**
     * this method should be used Only once!
     */
    public void setRawDataMapObject(List<String> rawData){
    	StringBuilder sb = new StringBuilder();
    	ObjectMapper mapper = new ObjectMapper();
		TypeReference<HashMap<String,String>> typeRef = new TypeReference<HashMap<String, String>>() {
		};
		for(String str : rawData){
			sb.append(str);
		}
		
		String jsonCounters = sb.toString();
		try{
			this.rawData = mapper.readValue(jsonCounters, typeRef);
		}catch(Exception e){
			System.out.println("Cannot create Strings Map from value");
		}
		 
    }
    
}


