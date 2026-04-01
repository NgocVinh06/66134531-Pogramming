package ntu.ngocvinh;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// Tạo mới 2 HS
		HocSinh hs1 = new HocSinh();
		String tenHS1 ="Trần Văn A";
		hs1.setTenHS(tenHS1);
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 = "8A";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh();
		String tenHS2 ="Trần Văn B";
		hs2.setTenHS(tenHS2);
		short tuoiHS2 = 8;
		hs2.setTuoiHS(tuoiHS2);
		String lopHS2 = "6B";
		hs2.setLopHS(lopHS2);
		
		// In ra mh
		System.out.println(hs1.toString());
		System.out.println(hs2.toString());
		
		// Nhap dlieu ban phim
		Scanner banPhim = new Scanner(System.in);
		// Nhập dữ liệu cho HS thứ 3
		HocSinh hs3 = new HocSinh();
		System.out.println("Nhập tên học sinh thứ 3: ");
		String tenHS3 = banPhim.nextLine();
		// gói vào biến
		hs3.setTenHS(tenHS3);
		
		System.out.println("Nhập tuổi học sinh thứ 3: ");
		short tuoiHS3 = banPhim.nextShort();
		banPhim.nextLine();
		// gói vào biến
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.println("Nhập lớp học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		// gói vào biến
		hs3.setLopHS(lopHS3);
		
		// In hs ra mh
		System.out.println(hs3.toString());

	}

}
