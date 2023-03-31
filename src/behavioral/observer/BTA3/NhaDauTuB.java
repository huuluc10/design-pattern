package behavioral.observer.BTA3;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia {
    TiGia tiGia;

    public NhaDauTuB(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKy() {
        tiGia.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if (delta > 0) {
            System.out.println("B: Mua vào");
        } else {
            System.out.println("B: Bán ra");
        }
    }

}
