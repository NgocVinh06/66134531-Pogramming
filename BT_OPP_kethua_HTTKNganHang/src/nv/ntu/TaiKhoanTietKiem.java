package nv.ntu;

public class TaiKhoanTietKiem extends TaiKhoan{
	private int kyHan;
	private double laiSuat;
	private int thoiGianGui;
	
	
	public TaiKhoanTietKiem(String stk, String tenchuTK, double soDu, int kyHan, double laiSuat, int thoiGianGui) {
		super(stk, tenchuTK, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
		this.thoiGianGui = thoiGianGui;
	}
	


	public TaiKhoanTietKiem(String stk, String tenchuTK, double soDu) {
		super(stk, tenchuTK, soDu);
	}


	@Override
	public double tinhLaiSuat() {
		return soDu*(laiSuat/100)*thoiGianGui;
	}
	@Override
	public double rutTien() {
		if(thoiGianGui < kyHan) {
			System.out.println("khong duoc rut truoc ky han");
		}else {
			super.rutTien();
		}
		return kyHan;
	}
}
