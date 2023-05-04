package behavioral.template_method.D3;

import java.util.List;

public abstract class SortCollection<T> {

    protected abstract int compare(T t1, T t2);

    public void sort(List<T> list) {
        list.sort((t1, t2) -> compare(t1, t2));
    }
}
