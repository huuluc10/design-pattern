package creational.builder.BT2;

public class MyStringBuilder {
    String str = "";
    public MyStringBuilder addString(String s) {
        str = str.concat(s);
        return this;
    }
    public MyStringBuilder addFloat(float f) {
        str = str.concat(Float.toString(f));
        return this;
    }
    public MyStringBuilder addBool(boolean b) {
        str = str.concat(Boolean.toString(b));
        return this;
    }

    @Override
    public String toString() {
        return "Chuỗi str = '" + str +"'";
    }
}
