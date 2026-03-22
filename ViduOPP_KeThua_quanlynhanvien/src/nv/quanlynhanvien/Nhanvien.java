package nv.quanlynhanvien;

public class Nhanvien {
 private String maNV;
 private String hoTen;
 private double luongCoBan;
 //hamtao
// public Nhanvien() {
  
// }
//   public Nhanvien( String maNhanVien, String tenNhanVien, double luongCoBan) {
//      maNV = maNhanVien;
//      hoTen = tenNhanVien;
 //     this.luongCoBan = luongCoBan;
// }
 public Nhanvien(String maNV, String hoTen, double luongCoBan) {
  super();
  this.maNV = maNV;
  this.hoTen = hoTen;
  this.luongCoBan = luongCoBan;
 }
 public Nhanvien() {
  super();
 }
 public double tinhLuong() {
  return luongCoBan;
 }
 @Override
 public String toString() {
  String chuoiXuat="";
  chuoiXuat = chuoiXuat + "MÃ NV: " + this.maNV;
  chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
  chuoiXuat = chuoiXuat + "\nLương cơ bản: " +this.luongCoBan;
  return "Nhanvien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
 }
 public void hienthiThongTin() {
       System.out.println("MÃ NV: " + maNV);
       System.out.println("Họ Tên: " + hoTen);
       System.out.println("Lương Cơ bản: " + luongCoBan);
     }
 public String getMaNV() {
  return maNV;
 }
 public void setMaNV(String maNV) {
  this.maNV = maNV;
 }
 public String getHoTen() {
  return hoTen;
 }
 public void setHoTen(String hoTen) {
  this.hoTen = hoTen;
 }
 public double getLuongCoBan() {
  return luongCoBan;
 }
 public void setLuongCoBan(double luongCoBan) {
  this.luongCoBan = luongCoBan;
 }
 
}