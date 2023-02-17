package phan1.bt5;

public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public String HienThiTT() {
        return "Họ tên: " + hoTen + "\nTuổi: " + tuoi + "\nĐịa chỉ: " + diaChi + "\nSố điện thoại: " + sdt;
    }
}
