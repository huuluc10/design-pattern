package behavioral.chain_of_responsibility.BoSung;

public class Giai1 implements IGiaiThuong{
    public Giai1(String[] boSo) {
        this.boSo = boSo;
    }

    IGiaiThuong giaiThapHon;
    String boSo[];
    String tenGiai = "Giải 1";
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
        if (giaiThapHon != null) {

            return giaiThapHon.doSo(ve);
        } else {
            return "Chúc bạn may mắn lần sau";
        }

    }
}
