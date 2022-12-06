package com.kh.chap03_Map.part02_Properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
	
		Properties prop = new Properties(); // 비어있는 상태
		
		
		// 5. load(InputStream is)
		// 6. loadFromXML
//		try {
//			prop.load(new FileInputStream("test.properties"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(prop.getProperty("map"));
//		
//		
		try {
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("List");
		
		
		
	}

}
