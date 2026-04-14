package nv.ntu;

public class run {
	public static void main(String [] args) {
		//test lớp nhân viên
		NhanVien nv1 = new NhanVien("001", "Nguyen Ngoc Vinh", 2300);
		//nv1.hienThiThongTin(); dùng cho nhập tay system
		//dùng cho toString
		System.out.println(nv1.toString());
	}
	
}
