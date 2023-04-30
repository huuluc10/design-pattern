package behavioral.decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage, String description) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.description;
    }
}
