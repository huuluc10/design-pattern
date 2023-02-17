package phan1.bt4;

public class XeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String bienSoXe, int doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, bienSoXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
}
