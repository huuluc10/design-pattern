package creational.factory.Pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new VietNamPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.MamTom);
        System.out.println(pizza.toString());
    }
}
