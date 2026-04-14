package nv.ntu;

public class ConCho extends DongVat{
	//thuoc tinh rieng
	private String giongCho;
	private boolean coTheTrongNha;
	//constructor
	public ConCho(String ten, int tuoi, double canNang, String giongCho, boolean coTheTrongNha) {
		super(ten, tuoi, canNang);
		this.giongCho = giongCho;
		this.coTheTrongNha = coTheTrongNha;
	}
	//phuong thuc rieng cua cho
	public void sua() {
		System.out.println(ten+"dang sua");
		
	}
	public void duoiMeo() {
		System.out.println(ten+ "dang duoi meo");
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("giong cho :"+giongCho);
		System.out.println("co the trong nha?"+ (coTheTrongNha? "co" : "khong"));
	}
}
