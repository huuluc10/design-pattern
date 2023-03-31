package creational.factory.BT3;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        if (shapeType == ShapeType.Rectangle) {
            return Rectangle.Instance();
        } else if (shapeType == ShapeType.Rectangle) {
            return Triangle.Instance();
        } else {
            return Circle.Instance();
        }
    }
}
