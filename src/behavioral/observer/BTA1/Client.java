package behavioral.observer.BTA1;

import java.util.List;

public abstract class Client<T> implements Stream.I_client<T> {

    Stream<T> stream;

    public Client(Stream stream) {
        this.stream = stream;
        stream.listen(this);
    }

}
