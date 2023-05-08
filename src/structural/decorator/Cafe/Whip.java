package structural.decorator.Cafe;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage, String description) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 9 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.description;
    }
}
