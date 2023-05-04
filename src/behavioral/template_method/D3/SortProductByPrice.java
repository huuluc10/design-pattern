package behavioral.template_method.D3;

public class SortProductByPrice extends SortCollection<Product>{
    @Override
    protected int compare(Product t1, Product t2) {
        if (t1.getPrice() > t2.getPrice()) {
            return 1;
        } else if (t1.getPrice() == t2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
