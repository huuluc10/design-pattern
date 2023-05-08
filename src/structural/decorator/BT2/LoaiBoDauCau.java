package structural.decorator.BT2;

import java.util.List;

public class LoaiBoDauCau extends LoaiBo{
    @Override
    public List<String> XuLy() {
        List<String> arr = this.string.Tokenize();
        for (int i = 0; i < arr.size(); i++) {
            var str = arr.get(i);
            if (str.endsWith(".") || str.endsWith(",") || str.endsWith(";")) {
                arr.set(i, str.substring(0, str.length() - 1));
            }
        }
        return arr;
    }

    public LoaiBoDauCau(Tokenize string) {
        super(string);
    }
}
