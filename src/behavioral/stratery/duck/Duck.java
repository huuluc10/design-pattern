package behavioral.stratery.duck;

public abstract class Duck {
    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;
    public abstract void display();

    public IFlyBehavior getiFlyBehavior() {
        return iFlyBehavior;
    }

    public void swim() {

    }

    public void performQuack() {
        System.out.println(iQuackBehavior.Quack());
    }

    public void performFly() {
        System.out.println(iFlyBehavior.Fly());
    }

    public void setiFlyBehavior(IFlyBehavior iFlyBehavior) {
        this.iFlyBehavior = iFlyBehavior;
    }

    public IQuackBehavior getiQuackBehavior() {
        return iQuackBehavior;
    }

    public void setiQuackBehavior(IQuackBehavior iQuackBehavior) {
        this.iQuackBehavior = iQuackBehavior;
    }
}
