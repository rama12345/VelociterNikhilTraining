package com.velociter.nikhil.chapter11;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFiles {
	public static void main(String[] args) throws IOException {
		
		// created file
		String filePath="myFile1.txt";
		File txtFile = new File(filePath);
		  
		  BufferedReader br = new BufferedReader(new FileReader(txtFile));
		  
		  String stringStore;
		  //reading data form file
		  while ((stringStore = br.readLine()) != null)
		    System.out.println(stringStore);
		  }
}
				


