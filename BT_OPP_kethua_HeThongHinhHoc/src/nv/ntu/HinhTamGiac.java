package nv.ntu;

public class HinhTamGiac extends HinhHoc{
	private double canhA, canhB, canhC;
	//constructor

	public HinhTamGiac(String ten, String mauSac, double canhA, double canhB, double canhC) {
		super(ten, mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	//kiem tra
	@Override
	public boolean check() {
		return (canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA);
	}
	// phuong thuc
	@Override
	public double tinhChuVi() {
		return canhA + canhB + canhC;
	}
	@Override
	public double tinhDienTich() {
		if(!check()) return 0;
		double p = tinhChuVi()/2;
		return Math.sqrt(p*(p-canhA)+(p-canhB)*(p-canhC));
	}
}
