package creational.BT6;

public class Product {
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private int donGia;

    public Product(String maSanPham, String tenSanPham, int soLuong, int donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
