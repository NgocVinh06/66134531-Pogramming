package nv.ntu;

public class hinhchunhat extends hinhhoc{
	private double chieuDai;
	private double chieuRong;

	public hinhchunhat(String ten, String mausac, double chieuDai, double chieuRong) {
		super(ten, mausac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	@Override
	public double chuvi() {
		return (chieuDai + chieuRong)*2 ;
	}
	@Override
	public double dientich() {
		return chieuDai*chieuRong;
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Chiều dài: " + chieuDai);
		System.out.println("Chiều rộng: " + chieuRong);
		System.out.println("Diện tích hình chử nhật là: " + this.dientich());
		System.out.println("Chu vi hình chử nhật là: " + this.chuvi());
		
		
	}

}