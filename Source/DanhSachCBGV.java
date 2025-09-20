package Source;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachCBGV {
    private ArrayList<CBGV> ds = new ArrayList<>();

    public void nhapCBGV(Scanner sc) {
        CBGV cbgv = new CBGV();
        cbgv.nhapThongTin(sc);
        ds.add(cbgv);
    }

    public void hienThiDanhSach() {
        System.out.println("=== DANH SACH CBGV ===");
        for (CBGV gv : ds) {
            gv.hienThiThongTin();
        }
    }

    public void hienThiLuongCaoHon8tr() {
        System.out.println("=== DANH SACH CBGV LUONG >= 8,000,000 ===");
        for (CBGV gv : ds) {
            if (gv.getLuongThucLinh() >= 8000000) {
                gv.hienThiThongTin();
            }
        }
    }
}
