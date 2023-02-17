package phan1.bt2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
    private List<NhanVien> list = new ArrayList<>();

    public QuanLyNhanVien() {
    }

    @Override
    public void them(NhanVien nv) {
        list.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv: list) {
            System.out.printf(nv.getThongTin());
        }
    }
}
