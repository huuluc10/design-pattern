package structural.decorator.Cafe;

public class MainDecorator {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend("House Blend");
        houseBlend = new Milk(houseBlend, "with milk");
        houseBlend = new Mocha(houseBlend, "with mocha");
        houseBlend = new Soy(houseBlend, "with soy");
        System.out.println(houseBlend.getDescription() +": " + houseBlend.cost());
    }
}
