package behavioral.template_method.D1;

import java.util.ArrayList;
import java.util.List;

public class MainD1 {
    public static void main(String[] args) {
        List<SanPham> sp = new ArrayList<>();
        sp.add(new SanPham("Chuột G703", 1500000, 1));
        sp.add(new SanPham("Điện thoại Poco F4", 8000000, 2));
        KHThanThiet khThanThiet = new KHThanThiet(sp);
        khThanThiet.HienThiGioHang();
        System.out.println("------------------------------");
        KHKimCuong khKimCuong = new KHKimCuong(sp);
        khKimCuong.HienThiGioHang();
    }
}
