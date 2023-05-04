package behavioral.template_method.Example;

public class MySinhVien {
    private int maSV;
    private String tenSV;
    private String ngaySinh;
    private String queQUan;

    public MySinhVien(int maSV, String tenSV, String ngaySinh, String queQUan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQUan = queQUan;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQUan() {
        return queQUan;
    }

    public void setQueQUan(String queQUan) {
        this.queQUan = queQUan;
    }
}
