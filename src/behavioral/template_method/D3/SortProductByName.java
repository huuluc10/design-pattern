package behavioral.template_method.D3;

public class SortProductByName extends SortCollection<Product>{
    @Override
    protected int compare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
