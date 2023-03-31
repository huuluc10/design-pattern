package behavioral.observer.BTA3;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia {
    TiGia tiGia;

    public NhaDauTuA(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKy() {
        tiGia.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if (delta > 0) {
            System.out.println("A: Bán ra");
        } else {
            System.out.println("A: Mua vào");
        }
    }
}
