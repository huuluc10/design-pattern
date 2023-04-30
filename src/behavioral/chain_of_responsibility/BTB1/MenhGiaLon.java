package behavioral.chain_of_responsibility.BTB1;

public class MenhGiaLon implements IRutTien{

    int menhGia;
    IRutTien succesor;

    public MenhGiaLon(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public void RutTien(int tienRut) {
        int soTo = tienRut / menhGia;
        ketQua.put(menhGia, soTo);
        tienRut = tienRut - (soTo*menhGia);
        succesor.RutTien(tienRut);
    }

    @Override
    public void setSuccessor(IRutTien succesor) {
        this.succesor = succesor;
    }

    public void inKetQua() {
        Integer soTo = ketQua.get(menhGia);
        if(soTo > 0) {
            System.out.println(soTo + " tờ mệnh giá " + menhGia);
        }
        succesor.inKetQua();
    }
}
