package behavioral.template_method.Example;

public class MySinhVienDB extends ObjectDB<MySinhVien> {
    @Override
    public int getId(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
}
