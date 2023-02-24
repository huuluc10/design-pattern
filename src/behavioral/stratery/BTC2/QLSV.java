package behavioral.stratery.BTC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> sinhViens = new ArrayList<>();

    public void sapXep() {
        sinhViens.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
    public void inDS() {
        for (SinhVien sv: sinhViens) {
            sv.info();
        }
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void addSinhVien(SinhVien sv) {
        sinhViens.add(sv);
    }
}
