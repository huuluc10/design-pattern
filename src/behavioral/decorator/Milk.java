package behavioral.decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage, String description) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.description;
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }
}
