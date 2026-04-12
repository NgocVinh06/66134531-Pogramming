package nnv.ntu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vidu {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("baitho.txt");
		
		// khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		// khai báo biến đối tượng Buffee
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		
		// đọc dữ liệu từ file, cất vào biến chuỗi
		String line1 = bufReader.readLine();
		// ỉn ra dòng đọc được
		System.out.println(line1);
		
		String line2 = bufReader.readLine();
		// ỉn ra dòng đọc được
		System.out.println(line2);
		
		
	}
	
}
