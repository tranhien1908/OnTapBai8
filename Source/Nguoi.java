package Source;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void nhapThongTin(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.printf("Ho ten: %s | Ngay sinh: %s | Que quan: %s\n",
                hoTen, ngaySinh, queQuan);
    }
}
