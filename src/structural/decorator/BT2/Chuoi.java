package structural.decorator.BT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chuoi extends Tokenize{
    private String string;

    public Chuoi(String string) {
        this.string = string;
    }

    @Override
    public List<String> Tokenize() {
        return new ArrayList<>(Arrays.asList(string.split(" ")));
    }
}
