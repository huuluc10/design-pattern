package creational.BT6;
import java.util.List;

class DataAccess {
    protected static DataAccess instance;
    private List<Product> sanPhamList;

    protected DataAccess(List<Product> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    public static DataAccess Instance(List<Product> sanPhamList){
        if (instance == null) {
            instance = new DataAccess(sanPhamList);
        }
        return instance;
    }

    public void addProduct(Product product) {
        //thêm sản phẩm vào CSDL
        sanPhamList.add(product);
    }

    public void deleteProduct(Product product) {
        // xóa sản phẩm khỏi CSDL
        sanPhamList.remove(product);
    }

    public void updateProduct(Product product) {
        // cập nhật thông tin sản phẩm trong CSDL
    }
}
