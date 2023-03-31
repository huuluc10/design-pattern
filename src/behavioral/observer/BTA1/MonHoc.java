package behavioral.observer.BTA1;

public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTC;

    public MonHoc(String maMonHoc, String tenMonHoc, int soTC) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMonHoc='" + maMonHoc + '\'' +
                ", tenMonHoc='" + tenMonHoc + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
