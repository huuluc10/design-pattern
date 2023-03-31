package creational.BT6;

import java.util.ArrayList;
import java.util.List;

public class MainBT6 {
    public static void main(String[] args) {
        List<Product> list1 = new ArrayList<>();
        List<Product> list2 = new ArrayList<>();
        list1.add(new Product("lapasus", "Máy tính Asus", 12, 20000000));
        list2.add(new Product("lapdell", "Máy tính Dell", 15, 20050000));
        list2.add(new Product("mobilePixel", "Điện thoại Pixel", 12, 12000000));
        list2.add(new Product("mobileSam", "Điện thoại Samsung", 20, 25000000));
        DataAccess1Factory dataAccess1Factory = new DataAccess1Factory(list1);
        DataAccess dataAccess = dataAccess1Factory.createDataAccess();
        dataAccess.addProduct(new Product("laphp", "Máy tính HP", 10, 18000000));
        dataAccess.addProduct(new Product("lapmsi", "Máy tính MSI", 14, 19000000));
        DataAccess1Factory dataAccess2Factory = new DataAccess1Factory(list2);
        dataAccess = dataAccess1Factory.createDataAccess();
        dataAccess.addProduct(new Product("mobileApple", "Điện thoại Iphone", 14, 22000000));
        for (Product product: list1){
            System.out.println(product.toString());
        }
        System.out.println("-----------------------------------");
        for (Product product: list2){
            System.out.println(product.toString());
        }
    }
}
