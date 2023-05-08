package structural.decorator.BT1;

public class GiaTriTuyetDoi extends BieuThucDecorator{
    @Override
    float giaTri() {
        return Math.abs(bieuThuc.giaTri());
    }

    @Override
    String bieuThuc() {
        return "|" + bieuThuc.bieuThuc() + "|";
    }

    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }
}
