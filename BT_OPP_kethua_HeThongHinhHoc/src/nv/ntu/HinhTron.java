package nv.ntu;

public class HinhTron extends HinhHoc{
	private double banKinh;
	//constructor
	public HinhTron(double banKinh) {
		super(mauSac, mauSac);
		this.banKinh = banKinh;
	}
	@Override
	public double tinhDienTich() {
		return Math.PI*banKinh*banKinh;
	}
	@Override
	public double tinhChuVi() {
		return 2*Math.PI*banKinh;
	}
}
