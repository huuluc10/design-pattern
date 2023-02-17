package phan1.bt5;

public class GiaoVien extends CaNhan {
    private String monDay;
    private String toBoMon;

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "\nMôn dạy:" + monDay + "\nTổ bộ môn: " + toBoMon;
    }
}
