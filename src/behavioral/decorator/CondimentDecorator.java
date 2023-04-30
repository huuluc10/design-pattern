package behavioral.decorator;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    String description;

    public CondimentDecorator(String description, Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
