package creational.singleton.Sample;

public class MainSingleton {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.Instance();
        SingleTon s2 = SingleTon.Instance();
        s1.tang();
        System.out.println(s1.getCount());
        s2.tang();
        s1.tang();
        System.out.println(s1.getCount());
        System.out.println(s2.getCount());

    }
}
