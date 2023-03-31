package behavioral.stratery.BTC3;

public class MainBTC3 {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.ThemSanPham(new SanPham("Áo", 200000F), 1);
        gioHang.ThemSanPham(new SanPham("Quần", 350000F), 1);
        gioHang.ThemSanPham(new SanPham("Giày", 1000000F), 1);
        gioHang.setVanChuyen(new NinjaVan());
        gioHang.setKhuyenMai(new KhuyenMaiA());
        gioHang.setThanhToan(new ThanhToanAirPay());
        gioHang.inThongTinDonhang();
    }
}
