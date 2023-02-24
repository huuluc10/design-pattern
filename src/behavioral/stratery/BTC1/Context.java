package behavioral.stratery.BTC1;

public class Context {
    Tinh tinhtoan;

    public void setTinhtoan(Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }

    public float tinh(float a, float b) {
        return tinhtoan.tinh(a,b);
    }
}
