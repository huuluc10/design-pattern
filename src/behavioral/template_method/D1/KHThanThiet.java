package behavioral.template_method.D1;

import java.util.List;

public class KHThanThiet extends HoaDon{

    public KHThanThiet(List<SanPham> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public float tinhChietKhau() {
        if (tinhTien() >= 500000) {
            return tinhTien() * 0.2f;
        }

        return 0;
    }
}
