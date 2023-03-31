package behavioral.observer.BTA3;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia);
        System.out.println("Lần 1");
        tiGia.notifyTiGia(-2);
        nhaDauTuA.huyDangKy();
        System.out.println("Lần 2");
        tiGia.notifyTiGia(5);
    }
}
