package behavioral.template_method.D2;

public class SinhVienDB extends EntityDB<SinhVien> {
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.getId();
    }
}
