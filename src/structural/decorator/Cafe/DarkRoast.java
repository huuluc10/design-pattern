package structural.decorator.Cafe;

public class DarkRoast extends Beverage{
    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 15;
    }
}
