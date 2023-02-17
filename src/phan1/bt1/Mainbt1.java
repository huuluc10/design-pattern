package phan1.bt1;

public class Mainbt1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Nguyen Van A", 20, "ABC", 5000000, 80);
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
}
