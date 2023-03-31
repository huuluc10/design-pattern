package behavioral.stratery.BTC3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GioHang {
    private Map<SanPham, Integer> sanPhams = new HashMap<>();
    private double tongTien = 0;
    private IKhuyenMai khuyenMai;
    private IDonViVanChuyen donViVanChuyen;
    private IThanhToan thanhToan;

    public void ThemSanPham(SanPham sanPham, int soluong) {
        sanPhams.put(sanPham, soluong);
        tongTien += sanPham.donGia*soluong;
    }

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void setVanChuyen(IDonViVanChuyen donViVanChuyen) {
        this.donViVanChuyen = donViVanChuyen;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void inThongTinDonhang() {
        double tienKhuyenMai = 0;
        double tienGiam  = tongTien*thanhToan.giamGia(tongTien);
        System.out.println("Tổng tiền giỏ hàng: " + tongTien);
        System.out.println("Số tiền giảm với hình thức thanh toán: " + tienGiam);
        if (tongTien*khuyenMai.khuyenmai()[0] <= khuyenMai.khuyenmai()[1]) {
            tienKhuyenMai = tongTien*khuyenMai.khuyenmai()[0];
        } else {
            tienKhuyenMai = khuyenMai.khuyenmai()[1];
        }
        System.out.println("Số tiền khuyến mãi: " + tienKhuyenMai);
        System.out.println("Số tiền phải thanh toán: " + (tongTien - tienKhuyenMai - tienGiam));
        System.out.println(donViVanChuyen.thoiGianGiao());
    }
}
