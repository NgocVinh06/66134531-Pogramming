package nv.ntu;

public class SanPham {
    // thuộc tính
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    // constructor không tham số
    public SanPham() {
    }

    // constructor có tham số (dùng setter để validation)
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.setMaSP(maSP);
        this.setTenSP(tenSP);
        this.setGia(gia);
        this.setSoLuong(soLuong);
    }

    // getter/setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Ma SP khong hop le!");
        }
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Gia phai > 0!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong phai >= 0!");
        }
    }

    // tính thành tiền
    public double tinhThanhTien() {
        return gia * soLuong;
    }

    // hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia: " + gia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}