package behavioral.template_method.D1;

import java.util.List;
import java.util.Map;

public abstract class HoaDon {
    List<SanPham> dsHangHoa;

    public HoaDon(List<SanPham> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }

    public float tinhTien() {
         float tongTien = 0;
        for (var sp: dsHangHoa) {
            tongTien += sp.getDonGia() * sp.getSoLuong();
        }
         return tongTien;
    }

    public abstract float tinhChietKhau();

    public void HienThiGioHang() {
        System.out.println("Thông tin giỏ hàng: ");
        for (var sp: dsHangHoa) {
            System.out.println("Tên sản phẩm: " + sp.getTen() +
                    "\nĐơn giá: " + sp.getDonGia() + "\nSố lượng: " + sp.getSoLuong() + "\nThành tiền: " +
                    sp.getSoLuong() * sp.getDonGia());
        }
        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền cần thành toán: " + (tinhTien() - tinhChietKhau()));
    }
}
