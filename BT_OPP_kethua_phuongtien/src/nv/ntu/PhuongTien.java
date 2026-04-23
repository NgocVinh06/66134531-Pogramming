package nv.ntu;

public class PhuongTien {
	String hangSanXuat;
	int namSanXuat;
	double giaBan;
	//constructor
	public PhuongTien(String hangSanXuat, int namSanXuat, double giaBan) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}
	// phuong thuc
	public double layVanTocToiDa() {
		return 0;
	}
	public double laySoChoNgoi() {
		return 0;
	}
	public void hienthithongtin() {
		System.out.println("hang san xuat: "+hangSanXuat);
		System.out.println("nam san xuat: "+namSanXuat);
		System.out.println("gia ban : "+giaBan);
	}
}
