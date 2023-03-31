package behavioral.observer.BTA1;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    List<I_client> clients = new ArrayList<>();

    void addEvent(List<MonHoc> monHocs) {
        for (I_client client: clients) {
            client.getInfo(monHocs);
        }
    }

    void listen(Client listener) {
        clients.add(listener);
    }


    public interface I_client {
        void getInfo(List<MonHoc> monHocs);
    }
}
