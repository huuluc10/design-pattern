package structural.decorator.Cafe;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage, String description) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 7 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + this.description;
    }
}
