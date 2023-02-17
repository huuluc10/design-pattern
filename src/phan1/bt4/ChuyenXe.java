package phan1.bt4;

public abstract class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String bienSoXe;
    int doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String bienSoXe, int doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.bienSoXe = bienSoXe;
        this.doanhThu = doanhThu;
    }

    public void xuat() {}

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void inThongTin() {
        System.out.println("Mã số chuyến: " + this.maSoChuyen + "\nHọ tên tài xế: " + hoTenTaiXe + "\nSố xeL " + this.bienSoXe + "\nDoanhThu: " + this.doanhThu);
    }
}
