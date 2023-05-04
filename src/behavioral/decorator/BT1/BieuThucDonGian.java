package behavioral.decorator.BT1;

public class BieuThucDonGian extends BieuThuc{

    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return toanHang;
    }

    @Override
    String bieuThuc() {
        return null;
    }
}
