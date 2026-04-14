package nv.ntu;

public class HinhChuNhat extends HinhHoc {
	private double chieuDai;
	private double chieuRong;
	//constructor
	public HinhChuNhat(String ten, String mauSac, double chieuDai, double chieuRong) {
		super(ten, mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	@Override
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}
	@Override
	public double tinhChuVi() {
		return (chieuDai+chieuRong)*2;
	}
}
