package thigk2.NguyenNgocVinh;
import java.io.*;
import java.util.*;

public class Cau3 {
	public static void main(String[] args) {
		/*
		Doc file data.txt chua cac so thuc
		Luu vao ArrayList
		Nhap X tu ban phim
		Kiem tra X co trong danh sach hay khong
		*/
		// mang luu danh sach so
		 ArrayList<Double> list = new ArrayList<>();
		 
		 //doc file 
		 try {
	            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                list.add(Double.parseDouble(line));
	            }

	            br.close();
	        } catch (Exception e) {
	            System.out.println("Loi doc file");
	        }
		 //nhap x
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Nhap X: ");
		 double X = sc.nextDouble();
		 
		 //kiem tra
		 boolean found = false;

		 for (double num : list) {
		     if (Math.abs(num - X) < 0.0001) {
		         found = true;
		         break;
		     }
		 }

		 if (found) {
		     System.out.println("Co trong danh sach");
		 } else {
		     System.out.println("Khong co trong danh sach");
		 }


	}
}
