package creational.factory.Pizza;

abstract class Pizza {
    StringBuffer builder = new StringBuffer();
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    @Override
    public String toString() {
        return builder.toString();
    }
}
