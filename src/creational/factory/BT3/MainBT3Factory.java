package creational.factory.BT3;

public class MainBT3Factory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape.draw());
    }
}
