package creational.builder.BT1;

public class HoaDonHeader {
    private String maHoaDon;
    private String ngayBan;
    private String tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "Hóa đơn: \n" +
                "  Mã hóa đơn: " + maHoaDon + '\n' +
                "  Ngày bán: " + ngayBan + '\n' +
                "  Tên khách hàng: " + tenKhachHang + '\n';
    }
}
