package phan1.bt5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc{
    private List<HocSinh> hocSinh = new ArrayList<HocSinh>();
    private GiaoVien giaoVienCN = new GiaoVien(null, 20, null, null, null, null);
    private List<GiaoVien> giaoVienGD = new ArrayList<GiaoVien>();
    private QLDS qldsGVGD = new QLDS();
    private QLDS qldsHS = new QLDS();
    public int themHocSinh(HocSinh hs) {
        try {
            hocSinh.add(hs);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    public int themGVGD(GiaoVien gv) {
       try {
           giaoVienGD.add(gv);
           return 1;
       } catch (Exception e) {
           return 0;
       }
    }
    public int inDSHS() {
        try {
            for (HocSinh i: hocSinh) {
                System.out.println(i.HienThiTT() + "\n\n");
            }
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    public int inDSGVGD() {
        try {
            for (GiaoVien i: giaoVienGD) {
                System.out.println(i.HienThiTT() + "\n\n");
            }
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public void inTT() {
        System.out.println("Thông tin giáo viên chủ nhiệm: \n" + giaoVienCN.HienThiTT() + "\nThông tin học sinh: \n" + inDSHS());
    }
}
