package behavioral.chain_of_responsibility.BTB1;

public class RutMenhGia1 implements IRutTien {
    @Override
    public void RutTien(int tienRut) {
        int soTo = tienRut;
        ketQua.put(1, soTo);
    }

    @Override
    public void setSuccessor(IRutTien succesor) {
    }

    @Override
    public void inKetQua() {
        Integer soTo = ketQua.get(1);
        if(soTo!= null) {
            System.out.println(soTo + " tờ mệnh giá " + 1);
        }
    }
}
