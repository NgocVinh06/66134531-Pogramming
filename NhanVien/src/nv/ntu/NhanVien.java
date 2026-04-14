package nv.ntu;

public class NhanVien {
	//1.Thuộc tính
	private String maNV;
	private String hoTen;
	private double luongCoBan;
//	//2.Hàm tạo: dùng source
//	public NhanVien(String maNhanVien, String tenNhanVien, String luongCoBan) {
//		this.maNV = maNhanVien;
//		this.hoTen = tenNhanVien;
//		this.luongCoBan = luongCoBan;
//	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
public NhanVien() {
	super();
}
	public double tinhLuong() {
		return luongCoBan;
	}
	//hien thi thong tin
	//cach1
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	//cach2
	public void hienThiThongTin() {
		System.out.println("Mã NV"+ maNV);
		System.out.println("họ và tên NV"+ hoTen);
		System.out.println("Lương cơ bản"+ luongCoBan);
	}
	
}
