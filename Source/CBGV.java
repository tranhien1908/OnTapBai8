package Source;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung;
    private double thuong;
    private double phat;
    private double luongThucLinh;

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap luong cung: ");
        luongCung = sc.nextDouble();
        System.out.print("Nhap tien thuong: ");
        thuong = sc.nextDouble();
        System.out.print("Nhap tien phat: ");
        phat = sc.nextDouble();
        tinhLuong();
    }

    private void tinhLuong() {
        luongThucLinh = luongCung + thuong - phat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("Luong cung: %.2f | Thuong: %.2f | Phat: %.2f | Thuc linh: %.2f\n",
                luongCung, thuong, phat, luongThucLinh);
    }
}
