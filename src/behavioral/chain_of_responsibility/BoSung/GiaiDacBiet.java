package behavioral.chain_of_responsibility.BoSung;

import behavioral.chain_of_responsibility.BTB3.ITinhTienDien;

public class GiaiDacBiet implements IGiaiThuong{
    String boSo[];
    String tenGiai = "Giải đặc biệt";
    private IGiaiThuong giaiThapHon;

    public GiaiDacBiet(String[] boSo) {
        this.boSo = boSo;
    }

    @Override
    public void giaiThapHon(IGiaiThuong giaiThuong) {
        this.giaiThapHon = giaiThuong;
    }

    @Override
    public String doSo(String ve) {
        for (String so : boSo) {
            if (ve.endsWith(so)) {
                return tenGiai;
            }
        }
        return giaiThapHon.doSo(ve);
    }
}
