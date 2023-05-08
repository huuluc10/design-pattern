package structural.decorator.BT1;

public class Nhan extends BieuThucDecorator{
    float toanHang;
    @Override
    float giaTri() {
        return bieuThuc.giaTri() * toanHang;
    }

    @Override
    String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + ") * " + String.valueOf(toanHang);
    }

    public Nhan(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }
}
