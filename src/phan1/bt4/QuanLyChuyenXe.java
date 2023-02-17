package phan1.bt4;
import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> chuyenXeList = new ArrayList<ChuyenXe>();
    public void themChuyenXe(ChuyenXe chuyenXe) {
        chuyenXeList.add(chuyenXe);
    }
    public int doanhThuXeNoiThanh() {
        int sum = 0;
        for (ChuyenXe i: chuyenXeList) {
            if (i instanceof XeNoiThanh) {
                sum += i.getDoanhThu();
            }
        }
        return sum;
    }
    public int doanhThuXeNgoaiThanh() {
        int sum = 0;
        for (ChuyenXe i: chuyenXeList) {
            if (i instanceof XeNgoaiThanh) {
                sum += i.getDoanhThu();
            }
        }
        return sum;
    }
    public int tongDoanhThu() {
        int sum = 0;
        for (ChuyenXe i: chuyenXeList) {
            sum += i.getDoanhThu();
        }
        return sum;
    }
    public void inThongTin() {
        for (ChuyenXe i: chuyenXeList) {
            i.inThongTin();
            if (i instanceof XeNgoaiThanh) {
                System.out.println("Noi đến:" + ((XeNgoaiThanh) i).getNoiDen() + "\nSố ngày đi dươc: " + ((XeNgoaiThanh) i).getSoNgayDiDuoc() + "\n\n");
            } else {
                System.out.println("Số tuyến: " + ((XeNoiThanh) i).getSoTuyen() + "\nSố km đi được: " + ((XeNoiThanh) i).getSoKmDiDuoc() + "\n\n");
            }
        }
    }
}
