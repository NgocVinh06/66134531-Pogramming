package nv.ntu;

public class Main {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat("hinh chu nhat", "do", 16, 20);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.hienthithongtin();
		
		HinhTron ht = new HinhTron(4);
		ht.tinhChuVi();
		ht.tinhDienTich();
		ht.hienthithongtin();
		
		HinhTamGiac htg = new HinhTamGiac("htg", "trang", 3, 4, 3);
		htg.tinhChuVi();
		htg.tinhDienTich();
		htg.hienthithongtin();
		
		//dung tinh da hinh
		System.out.println("su dung tinh da hinh");
		HinhHoc hh1 = new HinhChuNhat("hcnhat", "trang", 12, 16);
		HinhHoc hh2 = new HinhTamGiac("htgiac", "do", 3, 2, 3);
		HinhHoc hh3 = new HinhTron(2);
		
		System.out.println("hh1 co phai la hinh chu nhat hay khong ?"+ (hh1 instanceof HinhChuNhat));
		System.out.println("hh2 co phai la hinh chu nhat hay khong ?"+ (hh2 instanceof HinhChuNhat));
		System.out.println("hh3 co phai la hinh chu nhat hay khong ?"+ (hh3 instanceof HinhChuNhat));
		

	}

}
