package creational.factory.BT3;

public class Triangle extends Shape{
    protected static Triangle instance;
    protected Triangle() {}

    public static Triangle Instance() {
        if (instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Hình tam giác";
    }
}
