package creational.builder.BT1;

public class MainBT1Builder {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder().buildHoaDonHeader("HD01", "16-03-2023","Nguyen Huu Luc").buildCTHDList("Laptop",1,20000000,0).build();
        System.out.println(hoaDon.toString());
    }

}
