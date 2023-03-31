package creational.singleton.Sample;

public class SingleTon {
    protected static SingleTon instance;
    int count = 0;

    public int getCount() {
        return count;
    }

    protected SingleTon() {}

    public void tang() {
        count++;
    }

    public static SingleTon Instance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
