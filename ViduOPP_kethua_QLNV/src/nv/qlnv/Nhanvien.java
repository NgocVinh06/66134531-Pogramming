package nv.qlnv;

public class Nhanvien {

		private String maNV;
		private String hoTen;
		private double luongcoBan;
//		public Nhanvien() {
	//	
	//}
	//public Nhanvien(String maNhanvien,String tenNhanvien, double luongCoBan) {
//		maNV = maNhanvien;
//		this.hoTen = tenNhanvien;
//		this.luongcoBan = luongCoBan;
	//}
		public Nhanvien(String maNV, String hoTen, double luongcoBan) {
			super();
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.luongcoBan = luongcoBan;
		}
		public Nhanvien(String maNV, String hoTen, double luongcoBan) {
			super();
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.luongcoBan = luongcoBan;
		}
		public Nhanvien() {
			super();
		}
		public double tinhLuong() {
			return luongCoBan;
		}
		@Override
		public String toString() {
			return "Nhanvien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongcoBan=" + luongcoBan + "]";
		}
		public void hienthithongtin() {
			System.out.println("Mã NV" + maNV);
			System.out.println("Họ tên" + hoTen);
			System.out.println(Lương cơ bản" + luongcoBan);
			
		}




}
