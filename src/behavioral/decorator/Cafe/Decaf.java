package behavioral.decorator.Cafe;

public class Decaf extends Beverage{
    public Decaf(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 18;
    }
}
