package behavioral.template_method.D1;

import java.util.List;

public class KHVang extends HoaDon{

    public KHVang(List<SanPham> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public float tinhChietKhau() {
        if (tinhTien() >= 500000) {
            return tinhTien() * 0.3f;
        } else if (tinhTien() >= 1000000) {
            return tinhTien() * 0.5f;
        }
        return 0;
    }
}
