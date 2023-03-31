package creational.builder.BT1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> cthdList;

    @Override
    public String toString() {
        return hoaDonHeader.toString() +
                cthdList.toString();
    }

    public HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthdList = builder.cthdList;
    }

    public static class Builder {
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> cthdList = new ArrayList<>();

        public HoaDon build() {
            return new HoaDon(this);
        }

        public Builder buildHoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
            this.hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }

        public Builder buildCTHDList(String sanPham, int soLuong, int donGia, float chietKhau) {
            this.cthdList.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
    }
}
