package structural.decorator.BT1;

public abstract class BieuThucDecorator extends BieuThuc{
    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    BieuThuc bieuThuc;
    @Override
    abstract float giaTri();

    @Override
    abstract String bieuThuc();
}
