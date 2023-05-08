package structural.decorator.BT1;

public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc() + " - " + String.valueOf(toanHang);
    }
}
