package phan1.bt5;

public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "\nLớp: " + lop + "\nNăng khiếu: " + nangKhieu;
    }
}
