package structural.decorator.BT1;

public class Chia extends BieuThucDecorator{
    float toanHang;

    @Override
    float giaTri() {
        return bieuThuc.giaTri() / toanHang;
    }

    @Override
    String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + ") / " + String.valueOf(toanHang);
    }

    public Chia(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }
}
