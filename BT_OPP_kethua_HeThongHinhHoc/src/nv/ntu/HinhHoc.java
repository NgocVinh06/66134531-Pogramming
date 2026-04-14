package nv.ntu;

public class HinhHoc {
	//thuoc tinh
	private String ten;
	protected static String mauSac;
	//constructor
	public HinhHoc(String ten, String mauSac) {
		super();
		this.ten = ten;
		this.mauSac = mauSac;
	}
	//phuong thuc
	public double tinhDienTich() {
		return 0;
	}
	public double tinhChuVi() {
		return 0;
	}
	public void hienthithongtin() {
		System.out.println("ten: "+ten);
		System.out.println("mau sac"+mauSac);
	}
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
}
