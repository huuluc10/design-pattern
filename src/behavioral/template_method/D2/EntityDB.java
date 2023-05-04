package behavioral.template_method.D2;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();

    public boolean add(T t) {
        for (var o : list) {
            if (getKey(o) == getKey(t)) {

                return false;
            }
        }
        list.add(t);
        return true;
    }

    protected abstract int getKey(T t);

    public int update(T t) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (getKey(list.get(i)) == getKey(t)) {
                list.set(i, t);
                count ++;
            }
        }
        return count;
    }

    public int delete(T t) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (getKey(list.get(i)) == getKey(t)) {
                list.remove(i);
                count ++;
            }
        }
        return count;
    }

    public T findById(int id) {
        for (var o : list) {
            if (getKey(o) == id) {
                return o;
            }
        }
        return null;
    }

    public int delete(int id) {
        int count = 0;
        for (var o : list) {
            if (getKey(o) == id) {
                list.remove(o);
                count ++;
            }
        }
        return count;
    }
}
