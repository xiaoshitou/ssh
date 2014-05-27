package com.yb.local;



	import java.io.BufferedInputStream;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.FilenameFilter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.io.UnsupportedEncodingException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;

	public class FileUtils {

		/**
		 * @param args
		 * @throws FileNotFoundException
		 * @throws UnsupportedEncodingException
		 */

		public static void main(String[] args) throws Exception {
			String dir = "D:\\jilian\\workspace\\workspace2\\mobile-sys\\modules\\fraud\\src\\main\\java\\com\\gsoft\\mobile\\fraud\\web";
			File file = new File(dir);
			if(file.isDirectory()){
				File[] Ts = file.listFiles();
				for (File file2 : Ts) {
					System.out.println(file2.getName());
					readFileByLine(file2,"D:\\java\\design\\yb-utils-base\\src\\main\\java\\com\\yb\\local\\a.dox");
				}
			}
			
		
		}
		
	
		public static void readFileByLine(File inFileName, String outFileName) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName), "utf-8"));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName,true), "utf-8"));

			try {
				String tempString = null;
				while ((tempString = br.readLine()) != null) {
					bw.write(tempString);
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// 关闭流
					bw.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		
	}


