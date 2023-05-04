package behavioral.chain_of_responsibility.BTB3;

public class MainBT3 {
    public static void main(String[] args) {
        DienSinhHoat bac6 = new DienSinhHoat( 401, Double.POSITIVE_INFINITY, 2.927);
        DienSinhHoat bac5 = new DienSinhHoat(301, 400, 2.834);
        DienSinhHoat bac4 = new DienSinhHoat(201, 300, 2.536);
        DienSinhHoat bac3 = new DienSinhHoat(101, 200, 2.014);
        DienSinhHoat bac2 = new DienSinhHoat(51, 100, 1.734);
        DienSinhHoat bac1 = new DienSinhHoat(0, 50, 1.678);

        bac6.setSuccessor(null);
        bac5.setSuccessor(bac6);
        bac4.setSuccessor(bac5);
        bac3.setSuccessor(bac4);
        bac2.setSuccessor(bac3);
        bac1.setSuccessor(bac2);

        bac1.TinhTienDien(254);
        bac1.inKetQua();
    }
}
