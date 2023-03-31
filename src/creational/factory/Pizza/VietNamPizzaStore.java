package creational.factory.Pizza;

public class VietNamPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.MamTom)) {
            return new MamTomPizza();
        } else if (type.equals(PizzaType.MamCa)) {
            return null;
        } else if (type.equals(PizzaType.MamNem)) {
            return null;
        } else { return null; }
    }
}
