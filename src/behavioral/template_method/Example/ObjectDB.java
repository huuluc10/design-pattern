package behavioral.template_method.Example;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    List<T> list = new ArrayList<>();

    public abstract int getId(T t);

    T findByID(int id) {
        for (T t: list) {
            if (getId(t) == id) {
                return t;
            }
        }
        return null;
    }

    public void add(T t) {
        for (T o: list) {
            if (getId(t) == getId(o)) {
                return;
            }
        }
        list.add(t);
    }

    public void update(T t) {
        for (int i = 0; i < list.size(); i++) {
            if (getId(list.get(i)) == getId(t)) {
                list.set(i, t);
                return;
            }
        }
    }

    public void deleteByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (getId(list.get(i)) == id) {
                list.remove(i);
                return;
            }
        }
    }
}
