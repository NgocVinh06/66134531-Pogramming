package nv.ntu;

public class Main {

	public static void main(String[] args) {
		ConCho cho1 = new ConCho("luccy", 7, 12.3, "husky", true);
		cho1.hienthithongtin();
		cho1.an();
		cho1.sua();
		cho1.duoiMeo();
		
		ConCho cho2 = new ConCho("Lulu", 8, 14, "phoc", true);
		cho2.hienthithongtin();
		cho2.an();
		cho2.sua();
		cho2.duoiMeo();
		
		conMeo meo1 = new conMeo("Mino", 3, 5, "vang", true);
		meo1.hienthithongtin();
		meo1.batChuot();
		meo1.keu();
		meo1.an();
		conMeo meo2 = new conMeo("Osin", 6, 7, "den", false);
		meo2.hienthithongtin();
		meo1.batChuot();
		meo1.keu();
		meo1.an();
		
		System.out.println("su dung tinh da hinh");
		DongVat dv1 = new ConCho("Max", 4, 12.0, "Poodle", false);
		DongVat dv2 = new conMeo("Tom", 1, 3.5, "Đen", false);
		
		dv1.an();
		dv2.an();
		
		System.out.println("check doi tuong");
		System.out.println("doi tuong 1 co phai cho?"+(dv1 instanceof ConCho));
		System.out.println("doi tuong 2 co phai dong vat?"+(dv1 instanceof DongVat));
		
		
		

	}

}
