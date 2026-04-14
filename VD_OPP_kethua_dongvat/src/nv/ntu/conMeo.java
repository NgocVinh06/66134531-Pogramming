package nv.ntu;

public class conMeo extends DongVat {
	private String mauLong;
	private boolean thichLeoCay;
	public conMeo(String ten, int tuoi, double canNang, String mauLong, boolean thichLeoCay) {
		super(ten, tuoi, canNang);
		this.mauLong = mauLong;
		this.thichLeoCay = thichLeoCay;
	}
	public void batChuot() {
		System.out.println(ten+"dang bat chuot");
	}
	public void keu() {
		System.out.println(ten+"dang keu meo meo");
	}
	public void an() {
		System.out.println(ten+"dang an");
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("mau long"+mauLong);
		System.out.println("thich leo cay ?"+ (thichLeoCay ? "co" : "khong"));
	}
	
}
