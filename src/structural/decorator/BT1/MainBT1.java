package structural.decorator.BT1;

public class MainBT1 {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(6);
        bieuThuc = new Cong(9, bieuThuc);
        bieuThuc = new Nhan(8, bieuThuc);
        System.out.println(bieuThuc.bieuThuc() + " = " + bieuThuc.giaTri());
        BieuThuc bieuThuc1 = new BieuThucDonGian(8);
        bieuThuc1 = new Cong(6, bieuThuc1);
        bieuThuc1 = new Chia(2, bieuThuc1);
        bieuThuc1 = new Nhan(5, bieuThuc1);
        bieuThuc1 = new Cong(8, bieuThuc1);
        bieuThuc1 = new Tru(4, bieuThuc1);
        System.out.println(bieuThuc1.bieuThuc() + " = " + bieuThuc1.giaTri());
    }
}
