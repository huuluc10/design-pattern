package creational.factory.BT3;

public class Rectangle extends Shape{
    protected static Rectangle instance;
    protected Rectangle() {
    }

    public static Rectangle Instance() {
        if (instance == null) {
            instance = new Rectangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Hình chữ nhật";
    }
}
