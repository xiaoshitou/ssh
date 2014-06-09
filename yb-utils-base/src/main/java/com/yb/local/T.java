package com.yb.local;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

public class T {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
//		Process process = Runtime.getRuntime().exec("ping -c 2 www.baidu.com ");
//		InputStream in = process.getInputStream(); 
//        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//        
//        String c;  
//        while ((c = reader.readLine()) != null) { 
//         	System.out.println(c);
//        }    
System.out.println("asd.asd.qwe".replaceAll("\\.", File.separator));
		
	}

}
