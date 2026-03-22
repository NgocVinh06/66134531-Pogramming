package nv.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		// Test lop nhan vien
		NhanVien nv1 = new NhanVien("001", "Nguyen Ngoc Vinh", 2300000);
		nv1.hienthiThongTin();
		System.out.print(nv1.toString());
		
		Nhanvienvanphong nvvanphong1 = new Nhanvienvanphong();
		System.out.println(nvvanphong1.toString());

	}

}
