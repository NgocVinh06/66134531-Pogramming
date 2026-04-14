package nv.ntu;

public class DongVat {
	// thuoc tinh
	protected String ten;
	protected int tuoi;
	protected double canNang;
	//constructor
	public DongVat(String ten, int tuoi, double canNang) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.canNang = canNang;
	}
	//phuong thuc
	public void an() {
		System.out.println(ten+ "dang an");
	}
	public void ngu() {
		System.out.println(ten+"dang ngu");
	}
	public void hienthithongtin() {
		System.out.println("ten: "+ten);
		System.out.println("tuoi: "+tuoi);
		System.out.println("can nang: "+canNang);
	}

}
