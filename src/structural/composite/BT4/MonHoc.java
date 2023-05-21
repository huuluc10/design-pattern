package structural.composite.BT4;

public class MonHoc extends IQuanLyMonHoc{
    String tenMH;
    int soTC;
    int hocPhi;     //học phí 1 tính chỉ

    public MonHoc(String tenMH, int soTC, int hocPhi) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void addQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc) {

    }

    @Override
    public void removeQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc) {

    }

    @Override
    String getMonHoc() {
        return tenMH;
    }

    @Override
    int getSoTC() {
        return soTC;
    }

    @Override
    int getHocPhi() {
        return hocPhi * soTC;
    }
}
