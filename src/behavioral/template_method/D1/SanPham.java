package behavioral.template_method.D1;

public class SanPham {
     private String ten;
     private int donGia;

     private int soLuong;

    public SanPham(String ten, int donGia, int soLuong) {
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
