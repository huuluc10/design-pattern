package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer o = iterator.next();
            System.out.print(o);
        }
    }
}
