package nv.ntu;

public class Main {

	public static void main(String[] args) {
		TaiKhoanTietKiem tktk = new TaiKhoanTietKiem("1234", "nguyen ngoc vinh", 5000000);
		tktk.guiTien();
		tktk.rutTien();
		tktk.tinhLaiSuat();
		tktk.hienthithongtin();
		
		TaiKhoanThanhToan tktt = new TaiKhoanThanhToan("4567", "vinh nguyen ngoc", 9000000);
		tktt.guiTien();
		tktt.rutTien();
		tktt.tinhHoaDon();
		tktt.hienthithongtin();
		
		System.out.println("tinh da hinh");
		TaiKhoan tk1 = new TaiKhoanTietKiem("76286", "Nguyen van a", 7000000);
		TaiKhoan tk2 = new TaiKhoanThanhToan("234324", " tran van b", 8000000);
		
		tk1.rutTien();
		tk2.rutTien();
		
		System.out.println("tk1 co phai la tktk kh?"+ (tk1 instanceof TaiKhoanTietKiem));
		System.out.println("tk2 co phai la tktk kh?"+(tk2 instanceof TaiKhoanTietKiem));
	}

}
