package behavioral.observer.BTA1;

public class MainBTA1 {
    public static void main(String[] args) {
        MonHoc mh1 = new MonHoc("MATH01", "Đại số tuyến tính", 3);
        MonHoc mh2 = new MonHoc("MATH02", "Giải tích", 3);
        MonHoc mh3 = new MonHoc("PHY01", "Vật lý đại cương", 3);
        MonHoc mh4 = new MonHoc("ECO01", "Kinh tế học đại cương", 2);
        Stream stream = new Stream();
        Client client = new Client(stream);
        TruyCapDuLieu truyCapDL = new TruyCapDuLieu(stream);
        System.out.println("Lần 1");
        truyCapDL.Them(mh1);
        System.out.println("Lần 2");
        truyCapDL.Them(mh3);
    }
}
