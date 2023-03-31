package behavioral.observer.BTA1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    List<I_client> clients = new ArrayList<>();

    void addEvent(T t) {
        for (I_client client: clients) {
            client.getInfo(t);
        }
    }

    void listen(I_client listener) {
        clients.add(listener);
    }


    public interface I_client<T> {
        void getInfo(T t);
    }
}
