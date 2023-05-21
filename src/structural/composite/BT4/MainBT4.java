package structural.composite.BT4;

public class MainBT4 {
    public static void main(String[] args) {
        IQuanLyMonHoc monHoc = new MonHoc("Mẫu thiết kế", 3, 350000);
        IQuanLyMonHoc monHoc1 = new MonHoc("Lập trình thiết bị di động", 3, 350000);
        IQuanLyMonHoc keHoachChung = new KeHoachChung();
        keHoachChung.addQuanLyMonHoc(monHoc);
        keHoachChung.addQuanLyMonHoc(monHoc1);
        System.out.println(keHoachChung.getSoTC());
    }
}
