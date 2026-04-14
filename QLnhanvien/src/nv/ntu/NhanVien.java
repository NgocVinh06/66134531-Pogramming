package nv.ntu;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	private int heSoLuong;
	//constructor
	public NhanVien(String maNV, String hoTen, double luongCoBan, int heSoLuong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	//getter/setter
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	// phuong thuc
	public double  tinhLuong() {
		return luongCoBan*heSoLuong;
	}
	public String xepLoai() {
		double luong = tinhLuong();
		if(luong>=20000000){
			return "xuat sac";
			
		}else if(luong>=15000000) {
			return "Tot";
		}else {
			return "kha";
		}
	}
	// hien thi
	public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong: " + tinhLuong());
        System.out.println("Xep loai: " + xepLoai());
    }
	
}
