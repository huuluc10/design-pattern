package behavioral.decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 10;
    }
}
