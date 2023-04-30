package behavioral.chain_of_responsibility.BTB1;

import java.util.HashMap;
import java.util.Map;

public interface IRutTien {
    Map<Integer, Integer> ketQua = new HashMap<>();
    public void RutTien(int tienRut);

    public void setSuccessor(IRutTien succesor);

    public void inKetQua();
}
