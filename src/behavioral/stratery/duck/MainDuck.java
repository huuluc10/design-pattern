package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck vb = new VitBau();
        vb.setiFlyBehavior(new RoundFly());
        vb.setiQuackBehavior(new SQuack());
        vb.display();
        vb.setiQuackBehavior(new MuteQuack());
        vb.display();
    }
}
