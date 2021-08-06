package com.velociter.nikhil.chapter3;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class ReadWritePrime {

	public static void main(String[] args) throws IOException {

		int start, end, i, j, count = 0;
		BufferedWriter bufferedWriter = null;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the FileName");
		String fileName =input.nextLine();
		
		System.out.print("Enter the Range :\n");
		System.out.print("Enter Starting Number : ");
		start = input.nextInt();
		
		System.out.print("Enter Ending Number : ");
		end = input.nextInt();
		System.out.print("Prime Numbers Between " + start + " and " + end + " is :\n");
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
		try {
			
			

			FileWriter fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//Writer unicodeFileWriter = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8");
			//PrintWriter printWriter = new PrintWriter(fileName, "UTF-8");
			for (i = start; i <= end; i++) {
				count = 0;
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.print(i + " ");
					bufferedWriter.write(i);
				}
			}
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Error writing to file'" + fileName + "'");
		} finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time is :" + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");
	}
}