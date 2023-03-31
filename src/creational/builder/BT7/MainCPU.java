package creational.builder.BT7;

public class MainCPU {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().buildCPU("Core i5 7200U").buildRAM("12GB RAM Bus 2400MHZ").buildStorage("750 GB SSD").buildScreen("15 inches IPS").build();
        System.out.println(computer.toString());
    }
}
