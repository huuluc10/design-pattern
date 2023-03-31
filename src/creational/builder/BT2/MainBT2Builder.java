package creational.builder.BT2;

public class MainBT2Builder {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder().addString("Nguyễn Hữu Lực").addBool(true).addFloat(1062002F);
        System.out.println(myStringBuilder.toString());
    }
}
