package Entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public Utils(){
		
	}
	
	public String getTagFromAFile(String pathToFile,String tagPattern) throws IOException{
		String result = "";
		System.out.println("looking for subTag "+tagPattern+" in file : " + pathToFile);
		if(fileExists(pathToFile)){
			result = getXmlSubTagFromFile(pathToFile, tagPattern);
		}else{
			System.out.println("File not Exists retun empty String");
		}
		return result;
	}
	
	private boolean fileExists(String pathToFile) {
		boolean result = false;
		try{
			File file = new File(pathToFile);
			if(file.exists()){
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

	private String getXmlSubTagFromFile(String file,String tagName) throws IOException{
		System.out.println("looking for subTag "+tagName+" in file : " + file);
		// open File
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String line;
		String result = "";
		StringBuilder sb = new StringBuilder();
		
		// record File and Special Segment
		while ((line = br.readLine()) != null) {
			sb.append(line.trim());
		}
		Pattern pattern = Pattern.compile(tagName);
		Matcher matcher = pattern.matcher(sb.toString());
		if (matcher.find()) {
			result = matcher.group(1);
			System.out.println(result);
		}
		
		return result;
	}
}
