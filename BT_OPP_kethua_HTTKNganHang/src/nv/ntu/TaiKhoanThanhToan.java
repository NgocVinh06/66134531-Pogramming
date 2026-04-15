package nv.ntu;

public class TaiKhoanThanhToan extends TaiKhoan {
	private int hanMucRut;
	private double phiGiaoDich;
	public TaiKhoanThanhToan(String stk, String tenchuTK, double soDu, int hanMucRut, double phiGiaoDich) {
		super(stk, tenchuTK, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaoDich = phiGiaoDich;
	}
	public TaiKhoanThanhToan(String stk, String tenchuTK, double soDu) {
		super(stk, tenchuTK, soDu);
	}
	@Override
	public double rutTien() {
		int phi = 0;
		int soTien = 0;
		double tongTien = soTien + phi;
		if(tongTien <= soDu) {
			System.out.println("rut tien thanh cong");
		}else {
			System.out.println("khong rut duoc");
		}
		return tongTien;
	}
	@Override
		public double tinhHoaDon() {
			int soTien = 0;
			if(soTien < soDu) {
				soDu -= soTien;
				System.out.println("da thanh toan");
			}else {
				System.out.println("kh the thanh toan do tk khong du");
			}
			return soTien;
			
		}
}
		

