package behavioral.observer.BTA1;

import java.util.ArrayList;
import java.util.List;

public class TruyCapDuLieu {
    Stream<List<MonHoc>> stream;
    List<MonHoc> monHocs = new ArrayList<>();

    public TruyCapDuLieu(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void Them(MonHoc monHoc)
    {
        if(monHocs.contains(monHoc))
        {
            System.out.println("Môn học đã tồn tại");
            return;
        }
        monHocs.add(monHoc);
        stream.addEvent(monHocs);
    }
    void Sua(MonHoc mh, MonHoc newmh)
    {
        int index = monHocs.indexOf(mh);
        monHocs.set(index, newmh);
        stream.addEvent(monHocs);
    }
    void Xoa(MonHoc mh)
    {
        if(monHocs.contains(mh))
            monHocs.remove(mh);
        else
            System.out.println("Không tồn tại môn học, không thể xóa");
        stream.addEvent(monHocs);
    }
}
