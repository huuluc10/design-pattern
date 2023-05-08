package structural.decorator.BT2;

import java.util.List;

public class LoaiBoTuDung extends LoaiBo{
    public LoaiBoTuDung(Tokenize string) {
        super(string);
    }

    @Override
    public List<String> XuLy() {
        List<String> arr = this.string.Tokenize();
        List<String> keyword = List.of(new String[]{"và", "hoặc", "thì", "mà", "là"});
        arr.removeAll(keyword);
        return arr;
    }
}
