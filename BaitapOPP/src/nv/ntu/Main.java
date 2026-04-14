package nv.ntu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // tạo sản phẩm
        SanPham sp1 = new SanPham("SP01", "Laptop", 15000, 2);

        // hiển thị
        sp1.hienThiThongTin();

        // test validation
        sp1.setGia(-100);
        sp1.setSoLuong(-5);
        sp1.setMaSP("");

        // hiển thị lại
        sp1.hienThiThongTin();
    }
}