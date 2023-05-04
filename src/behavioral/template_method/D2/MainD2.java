package behavioral.template_method.D2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainD2 {
    public static void main(String[] args) {
        SinhVienDB sinhVienDB = new SinhVienDB();
        SinhVien sinhVien1 = new SinhVien(62133901, "Nguyễn Hữu Lực", new Date(2002, 5, 10));
        SinhVien sinhVien2 = new SinhVien(60135952, "Nguyễn Phan Nhật Linh", new Date(2000, 11, 14));

        if (sinhVienDB.add(sinhVien1)) {
            System.out.println("Thêm thành công sinh viên " + sinhVien1.getName());
        } else {
            System.out.println("Thêm thất bại sinh viên " + sinhVien1.getName());
        }

        if (sinhVienDB.add(sinhVien2)) {
            System.out.println("Thêm thành công sinh viên " + sinhVien2.getName());
        } else {
            System.out.println("Thêm thất bại sinh viên " + sinhVien2.getName());
        }
        System.out.println("Đã xóa " + sinhVienDB.delete(sinhVien2) + " sinh viên có mã " + sinhVien2.getId());

        MonHocDB monHocDB = new MonHocDB();
        MonHoc monHoc1 = new MonHoc(353, "Mẫu thiết kế", 3);
        MonHoc monHoc2 = new MonHoc(356, "Lập trình thiết bị di động", 3);
        MonHoc monHoc3 = new MonHoc(355, "Phát triển ứng dụng Web", 3);

        if (monHocDB.add(monHoc1)) {
            System.out.println("Thêm thành công môn học " + monHoc1.getName());
        } else {
            System.out.println("Thêm thất bại môn học " + monHoc1.getName());
        }
        if (monHocDB.add(monHoc2)) {
            System.out.println("Thêm thành công môn học " + monHoc2.getName());
        } else {
            System.out.println("Thêm thất bại môn học " + monHoc2.getName());
        }

        System.out.println("Đã xóa " + monHocDB.delete(monHoc2) + " môn học có mã " + monHoc2.getId());
        System.out.println("Đã cập nhật " + monHocDB.update(monHoc3) + " môn học có mã " + monHoc3.getId());
    }
}
