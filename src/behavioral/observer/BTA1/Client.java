package behavioral.observer.BTA1;

import java.util.List;

public class Client implements Stream.I_client {

    Stream stream;

    public Client(Stream stream) {
        this.stream = stream;
        stream.listen(this);
    }

    @Override
    public void getInfo(List<MonHoc> monHocs) {
        for (MonHoc monhoc: monHocs) {
            System.out.println(monhoc.toString());
        }
    }
}
