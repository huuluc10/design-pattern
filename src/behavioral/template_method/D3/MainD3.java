package behavioral.template_method.D3;

import java.util.ArrayList;
import java.util.List;

public class MainD3 {
    public static void main(String[] args) {
        List<Product> sanPhamList = new ArrayList<>();
        sanPhamList.add(new Product("Bút bi", 3000, 2));
        sanPhamList.add(new Product("Do choi", 100000, 10));
        sanPhamList.add(new Product("Gôm", 4000, 1));
        sanPhamList.add(new Product("Bút chì", 5000, 2));

        SortProductByName sortProductByName = new SortProductByName();
        sortProductByName.sort(sanPhamList);
        System.out.println("Sắp xếp theo tên:");
        sanPhamList.forEach(product -> System.out.println("Tên: " + product.getName() + "\nGiá: " + product.getPrice() + "\nSố lượng: " + product.getQuantity()));

        System.out.println("--------------------------------");

        System.out.println("Sắp xếp theo giá:");
        SortProductByPrice sortProductByPrice = new SortProductByPrice();
        sortProductByPrice.sort(sanPhamList);
        sanPhamList.forEach(product -> System.out.println("Tên: " + product.getName() + "\nGiá: " + product.getPrice() + "\nSố lượng: " + product.getQuantity()));
    }
}
