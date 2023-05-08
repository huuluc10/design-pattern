package structural.decorator.BT1;

public class Cong extends BieuThucDecorator{
    float toanHang;
    public Cong(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri() + toanHang;
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " + " + String.valueOf(toanHang);
    }
}
