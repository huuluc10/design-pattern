package structural.decorator.BT2;

import java.util.List;

public abstract class LoaiBo extends Tokenize{
    Tokenize string;

    public LoaiBo(Tokenize string) {
        this.string = string;
    }

    @Override
    public List<String> Tokenize() {
        return XuLy();
    }

    public abstract List<String> XuLy();
}
