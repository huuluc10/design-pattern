package behavioral.stratery.BTC1;

public class MainBTC1 {
    public static void main(String[] args) {
        Context context = new Context();
        context.setTinhtoan(new Cong());
        System.out.println(context.tinh(75, 12));
        context.setTinhtoan(new Tru());
        System.out.println(context.tinh(54, 78));
    }

}
