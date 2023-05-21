package structural.composite.BT4;

public abstract class IQuanLyMonHoc {
    private IQuanLyMonHoc quanLyMonHoc;

    public abstract void addQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc);

    public abstract void removeQuanLyMonHoc(IQuanLyMonHoc quanLyMonHoc);

    abstract String getMonHoc();
    abstract int getSoTC();
    abstract int getHocPhi();
}
