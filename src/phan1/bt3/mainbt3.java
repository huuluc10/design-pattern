package phan1.bt3;

public class mainbt3 {
    public static void main(String[] args) {
        SinhVienPoly sinhVienPoly = new SinhVienIT("ABC", "CNTT", 8.5, 8, 9);
        System.out.println("Thông tin sinh viên sinh viên poly: ");
        sinhVienPoly.xuat();
        System.out.println("Điểm: " + sinhVienPoly.getDiem());
        System.out.println("Học lục: " + sinhVienPoly.getHocLuc() + "\n");
        SinhVienIT sinhVienIT = new SinhVienIT("BCD", "CNTT", 8, 9, 7);
        System.out.println("Thông tin sinh viên IT");
        sinhVienIT.xuat();
        System.out.println("Điểm: " + sinhVienIT.getDiem());
        System.out.println("Học lục: " + sinhVienIT.getHocLuc() + "\n");
        SinhVienBiz sinhVienBiz = new SinhVienBiz("CDE", "MKT", 9, 8.5);
        System.out.println("Thông tin sinh viên MKT: ");
        sinhVienBiz.xuat();
        System.out.println("Điểm: " + sinhVienBiz.getDiem());
        System.out.println("Học lục: " + sinhVienBiz.getHocLuc());
    }
}
