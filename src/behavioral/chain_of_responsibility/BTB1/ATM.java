package behavioral.chain_of_responsibility.BTB1;

public abstract class ATM {
    public void RutTien(int tienRut, Enum anEnum) {
        IRutTien rutTien = getMenhGia(anEnum);
        rutTien.RutTien(tienRut);
        rutTien.inKetQua();
    }

    protected abstract IRutTien getMenhGia(Enum anEnum);
}
