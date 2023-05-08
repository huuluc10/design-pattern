package structural.decorator.Cafe;

public class Espresso extends Beverage{
    public Espresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 20;
    }
}
