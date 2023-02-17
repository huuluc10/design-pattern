package phan1.bt3;

public class SinhVienBiz extends SinhVienPoly{
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * this.diemMarketing + diemSales) / 3;
    }
}
