package creational.BT6;

import java.util.List;

class DataAccess1Factory extends DataAccessFactory {
    List<Product> sanPhamList1;

    public DataAccess1Factory(List<Product> sanPhamList1) {
        this.sanPhamList1 = sanPhamList1;
    }

    @Override
    public DataAccess createDataAccess() {
        return DataAccess.Instance(sanPhamList1);
    }
}
