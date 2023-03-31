package creational.factory.BT3;

public class Circle extends Shape{
    protected static Circle instance;
    protected Circle() {}

    public static Circle Instance() {
        if (instance == null) {
            instance = new Circle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Hình tròn";
    }
}
