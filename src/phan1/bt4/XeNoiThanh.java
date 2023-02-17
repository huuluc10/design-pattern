package phan1.bt4;

public class XeNoiThanh extends ChuyenXe{
    int soTuyen;
    int soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String bienSoXe, int doanhThu) {
        super(maSoChuyen, hoTenTaiXe, bienSoXe, doanhThu);
    }

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String bienSoXe, int doanhThu, int soTuyen, int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, bienSoXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
}
