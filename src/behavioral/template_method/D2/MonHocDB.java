package behavioral.template_method.D2;

public class MonHocDB extends EntityDB<MonHoc>{
    @Override
    protected int getKey(MonHoc monHoc) {
        return monHoc.getId();
    }
}
