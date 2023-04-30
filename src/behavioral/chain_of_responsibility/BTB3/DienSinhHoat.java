package behavioral.chain_of_responsibility.BTB3;

public class DienSinhHoat implements ITinhTienDien{

    ITinhTienDien succesor;
    @Override
    public void setSuccessor(ITinhTienDien succesor) {
        this.succesor = succesor;
    }

    @Override
    public void inKetQua() {
        System.out.println("Số tiền phải thanh toán: " + tongTien);
    }

    @Override
    public double TinhTienDien(int soKWh) {
        if (soKWh > 50) {
            //tongTien = (50 * 1.678) + succesor.TinhTienDien(soKWh);
        }
        return 0;
    }
}
