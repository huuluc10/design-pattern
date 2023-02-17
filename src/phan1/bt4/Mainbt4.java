package phan1.bt4;

import java.util.Random;
import java.util.Scanner;

public class Mainbt4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        for (int i = 0; i < 3; i++) {
            System.out.println("Tạo đối tượng xe ngoại thành:");
            Random random = new Random();
            String maSoChuyen = Integer.toString(random.nextInt(12) + 1);
            String bienSoXe = Integer.toString(random.nextInt(9999) + 1);
            int doanhThu = random.nextInt(200);
            int soNgayDiDuoc = random.nextInt(200);
            Scanner input = new Scanner(System.in);
            System.out.println("Họ tên tài xế:");
            String hoTenTaiXe = input.nextLine();
            System.out.println("Nơi đén:");
            String noiDen = input.nextLine();
            XeNgoaiThanh xeNgoaiThanh = new XeNgoaiThanh(maSoChuyen, hoTenTaiXe, bienSoXe, doanhThu, noiDen, soNgayDiDuoc);
            quanLyChuyenXe.themChuyenXe(xeNgoaiThanh);
            xeNgoaiThanh = null;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Tạo đối tượng xe nội thành:");
            Random random = new Random();
            String maSoChuyen = Integer.toString(random.nextInt(12) + 1);
            String bienSoXe = Integer.toString(random.nextInt(9999) + 1);
            int doanhThu = random.nextInt(200);
            int soKmDiDuoc = random.nextInt(200);
            int soTuyen = random.nextInt(150);
            Scanner input = new Scanner(System.in);
            System.out.println("Họ tên tài xế:");
            String hoTenTaiXe = input.nextLine();
            XeNoiThanh xeNoiThanh = new XeNoiThanh(maSoChuyen, hoTenTaiXe, bienSoXe, doanhThu, soTuyen, soKmDiDuoc);
            quanLyChuyenXe.themChuyenXe(xeNoiThanh);
            xeNoiThanh = null;
        }
        quanLyChuyenXe.inThongTin();
        System.out.println("Tổng doanh thu xe ngoại thành: " + quanLyChuyenXe.doanhThuXeNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + quanLyChuyenXe.doanhThuXeNoiThanh());
        System.out.println("Tổng doanh thu: " + quanLyChuyenXe.tongDoanhThu());
    }
}
