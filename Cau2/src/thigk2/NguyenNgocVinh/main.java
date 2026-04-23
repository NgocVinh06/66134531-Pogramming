package thigk2.NguyenNgocVinh;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> list = new ArrayList<>();
		
		//hard code 3 sp
		list.add(new SanPham("SP1", "Sua", "Thuc pham chuc nang", 100));
		list.add(new SanPham("SP2", "Banh", "Do an", 50));
		list.add(new SanPham("SP3", "Nuoc", "Giai khat", 20));
		
		//in ra danh sach
		System.out.println("Danh sach ban dau:");
		for (SanPham sp : list) {
			System.out.println(sp);
		}
		// them san pham
		System.out.println("Nhap san pham moi: ");
		System.out.println("Ma sp: ");
		String ma = sc.nextLine();
		System.out.println("ten san pham:");
		String ten = sc.nextLine();
		System.out.println("Loai: ");
		String loai= sc.nextLine();
		System.out.println("Giá");
		double gia = sc.nextDouble();
		
		list.add(new SanPham(ma, ten, loai, gia));
		
		// in lai danh sach
        System.out.println("\nDanh sach sau khi them:");
        for (SanPham sp : list) {
            System.out.println(sp);
        }

        // loc loai thuc pham chuc nang
        System.out.println("\nSan pham loai 'Thuc pham chuc nang':");
        for (SanPham sp : list) {
            if (sp.getLoaiSP().equalsIgnoreCase("Thuc pham chuc nang")) {
                System.out.println(sp);
            }
        }
    }

}

