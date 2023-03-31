package creational.builder.BT1;

public class CTHD {
    private String sanPham;
    private int soLuong;
    private int donGia;
    private float chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return " Tên sản phẩm: " + sanPham + '\n' +
                "  Số lượng: " + soLuong + '\n' +
                "  Đơn giá: " + donGia + '\n' +
                "  Chiết khẩu: " + chietKhau + "% \n";
    }
}
