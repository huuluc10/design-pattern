package creational.factory.Pizza;

abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract protected Pizza createPizza(PizzaType type);
}
