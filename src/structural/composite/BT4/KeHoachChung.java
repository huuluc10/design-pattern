package structural.composite.BT4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends IQuanLyMonHoc{

    List<IQuanLyMonHoc> monHocList = new ArrayList<>();
    @Override
    public void addQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc) {
        monHocList.add(quanLyMonHoc);
    }

    @Override
    public void removeQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc) {
        monHocList.remove(quanLyMonHoc);
    }

    public String getQuanLyMonHoc() {
        StringBuffer sp = new StringBuffer();
        for (IQuanLyMonHoc monhoc :
                monHocList) {
            sp.append("Tên môn học: " + monhoc.getMonHoc() + "\n");
        }
        return sp.toString();
    }

    @Override
    String getMonHoc() {
        return null;
    }

    @Override
    int getSoTC() {
        int tong = 0;
        for (IQuanLyMonHoc monhoc :
                monHocList) {
            tong += monhoc.getSoTC();
        }
        return tong;
    }

    @Override
    int getHocPhi() {
        int hocPhi = 0;
        for (IQuanLyMonHoc monhoc :
                monHocList) {
            hocPhi += monhoc.getSoTC();
        }
        return hocPhi;
    }
}
