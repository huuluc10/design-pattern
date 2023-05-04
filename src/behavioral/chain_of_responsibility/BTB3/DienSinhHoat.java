package behavioral.chain_of_responsibility.BTB3;

public class DienSinhHoat implements ITinhTienDien{

    private ITinhTienDien succesor;
    private double min;
    private double max;
    private double gia;

    private double tongTien = 0;

    public DienSinhHoat(double min, double max, double gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public void setSuccessor(ITinhTienDien succesor) {
        this.succesor = succesor;
    }

    @Override
    public void inKetQua() {
        System.out.println("Số tiền phải thanh toán: " + tongTien);
    }

    @Override
    public double TinhTienDien(double soKWh) {
        if (soKWh > max) {
            tongTien = (max - min) * gia + succesor.TinhTienDien(soKWh);
            return tongTien;
        }
        tongTien = (soKWh - min) * gia;
        return tongTien;
    }

}
