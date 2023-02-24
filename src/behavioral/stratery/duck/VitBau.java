package behavioral.stratery.duck;

public class VitBau extends Duck{
    @Override
    public void display() {
        System.out.println("Tôi là vịt bầu");
        performQuack();
        performFly();
        swim();
    }
}
