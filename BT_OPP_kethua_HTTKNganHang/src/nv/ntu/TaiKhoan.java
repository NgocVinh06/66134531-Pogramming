package nv.ntu;

public class TaiKhoan {
	String stk;
	String tenchuTK;
	double soDu;
	// constructor
	public TaiKhoan(String stk, String tenchuTK, double soDu) {
		super();
		this.stk = stk;
		this.tenchuTK = tenchuTK;
		this.soDu = soDu;
	}
	public TaiKhoan() {
		super();
	}
	// phuong thuc
	public double guiTien() {
		return 0;
	}
	public double rutTien() {
		return 0;
	}
	public void hienthithongtin() {
		System.out.println("stk: "+stk);
		System.out.println("ten chu tk: "+tenchuTK);
		System.out.println("so du"+soDu);
	}
	public double tinhLaiSuat() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double rutTien(int soTien) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double tinhHoaDon() {
		// TODO Auto-generated method stub
		return 0;
	}
}
