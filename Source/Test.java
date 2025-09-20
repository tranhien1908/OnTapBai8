package Source;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachCBGV ds = new DanhSachCBGV();

        int choice;
        do {
            System.out.println("\n==== MENU QUAN LY CBGV ====");
            System.out.println("1. Nhap thong tin can bo giao vien");
            System.out.println("2. Hien thi danh sach can bo giao vien");
            System.out.println("3. In ra can bo co luong >= 8 trieu");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> ds.nhapCBGV(sc);
                case 2 -> ds.hienThiDanhSach();
                case 3 -> ds.hienThiLuongCaoHon8tr();
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("LLua chon khong hop le!");
            }
        } while (choice != 0);

        sc.close();
    }

    //Mã sv: 23115053122312
}
