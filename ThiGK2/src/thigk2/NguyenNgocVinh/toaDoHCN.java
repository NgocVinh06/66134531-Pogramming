package thigk2.NguyenNgocVinh;
import java.util.Scanner;
public class toaDoHCN {
	public static void main(String[] args) {
		//Cau1:
		//a
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Nhập y1: ");
		double y1 = sc.nextDouble();
		
		System.out.println("Nhập x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Nhập y2: ");
		double y2 = sc.nextDouble();
		//b
		double chieuDai = Math.abs(x2 - x1);
		double chieuRong = Math.abs(y2 - y1);
		
		if(chieuDai == 0 || chieuRong == 0) {
			System.out.println("không phải hcn hợp lệ");
		}
		
		double chuVi = 2*(chieuDai + chieuRong);
		double dienTich = chieuDai * chieuRong;
		
		System.out.println("Chu vi: " +chuVi);
		System.out.println("Diện tích: " +dienTich);
	}
}
