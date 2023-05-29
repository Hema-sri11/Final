package com.in.filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilterinngFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100);//100 unicode value will be written to a file

		out.write('\n');
		out.println(100);//100 only will be written to the file
		out.println(true);
		out.println('c');
		out.println("DenisRitchie");
		out.flush();
		out.close();
		System.out.println("done");
		// removing duplicate item
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		// FileInputStream fos = new FileInputStream("index.txt");
		PrintWriter pw = new PrintWriter("output.txt");
		String target = br.readLine();
		while (target != null) {
			boolean isAvailable = false;
			BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
			String line = br1.readLine();
			while (line != null) {
				if (line.equals(target)) {
					isAvailable = true;
					break;
				}
				line = br1.readLine();
			}
			if (isAvailable == false) {
				pw.println(target);
				pw.flush();
			}
			target = br.readLine();
		}
		br.close();
		pw.close();
	}

}
