package creational.BT6;

import java.util.List;

class DataAccess2Factory extends DataAccessFactory {
    List<Product> sanPhamList2;

    public DataAccess2Factory(List<Product> sanPhamList2) {
        this.sanPhamList2 = sanPhamList2;
    }

    @Override
    public DataAccess createDataAccess() {
        return DataAccess.Instance(sanPhamList2);
    }
}
