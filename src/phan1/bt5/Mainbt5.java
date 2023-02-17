package phan1.bt5;

import java.util.Scanner;

public class Mainbt5 {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        Scanner scanner = new Scanner(System.in);
        String hoTen;
        int tuoi;
        String diaChi;
        String sdt;
        String lop;
        String monDay;
        String toBoMon;
        for (int i = 0; i < 5; i++) {
            hoTen = scanner.nextLine();
            tuoi = scanner.nextInt();
            diaChi = scanner.nextLine();
            sdt = scanner.nextLine();
            lop = scanner.nextLine();
            HocSinh hocSinh = new HocSinh(hoTen, tuoi, diaChi, sdt, lop, null);
            lopHoc.themHocSinh(hocSinh);
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            hoTen = scanner.nextLine();
            tuoi = scanner.nextInt();
            diaChi = scanner.nextLine();
            sdt = scanner.nextLine();
            monDay = scanner.nextLine();
            toBoMon = scanner.nextLine();
            GiaoVien giaoVien = new GiaoVien(hoTen, tuoi, diaChi, sdt, monDay, toBoMon);
            lopHoc.themGVGD(giaoVien);
            System.out.println();
        }
        System.out.println("Thông tin lớp học: ");
        lopHoc.inTT();
        System.out.println("Danh sách giáo viên: ");
        lopHoc.inDSGVGD();
    }
}
