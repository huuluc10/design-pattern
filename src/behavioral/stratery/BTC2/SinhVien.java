package behavioral.stratery.BTC2;

import java.util.Date;

public class SinhVien {
    private String hoTen;
    private String ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
    public void info() {
        System.out.println("Họ tên: " + this.hoTen + "\nNgày sinh: " + this.ngaySinh + "\nĐiểm TB: "+ this.diemTB + "\n\n");
    }
}
