package behavioral.template_method.D1;

import java.util.List;

public class KHKimCuong extends HoaDon{

    public KHKimCuong(List<SanPham> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public float tinhChietKhau() {
        if (tinhTien() >= 500000) {
            return tinhTien() * 0.3f;
        } else if (tinhTien() >= 1000000) {
            return tinhTien() * 0.5f;
        } else if (tinhTien() >= 1500000){
            return tinhTien() * 0.6f;
        }
        return 0;
    }
}
