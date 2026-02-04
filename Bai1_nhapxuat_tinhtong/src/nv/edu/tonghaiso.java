package nv.edu;

import java.util.Scanner;

public class tonghaiso {

	public static void main(String[] args) {
		// Nhập xuất & tính tổng
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nhập số thứ 1");
		double num1 = sc.nextDouble();
		
		System.out.println("Nhập số thứ 2");
		double num2 = sc.nextDouble();
		
		double sum = num1 + num2;
		System.out.println("tổng của "+ num1 +"và "+ num2+ "là"+ sum);
		
		
		

	}

}
