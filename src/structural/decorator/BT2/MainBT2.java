package structural.decorator.BT2;

public class MainBT2 {
    public static void main(String[] args) {
        Tokenize string = new Chuoi("Nếu hôm nay là tuần chẵn thì thực hành di động. Dạo này trời nắng quá nóng, nên dùng nhiều nước. ");
        string = new LoaiBoTuDung(string);
        string = new LoaiBoDauCau(string);
        System.out.println(string.Tokenize());
    }
}
