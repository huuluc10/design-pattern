package behavioral.chain_of_responsibility.BTB3;

import behavioral.chain_of_responsibility.BTB1.IRutTien;

public interface ITinhTienDien {
    double tongTien = 0;

    public void setSuccessor(ITinhTienDien succesor);

    public void inKetQua();

    public double TinhTienDien(int soKWh);
}
