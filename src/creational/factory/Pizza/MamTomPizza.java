package creational.factory.Pizza;

public class MamTomPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Mắm tôm và thịt:\n");
    }

    @Override
    void bake() {
        builder.append("Nướng 20 phút\n");
    }

    @Override
    void cut() {
        builder.append("Đã cắt\n");
    }

    @Override
    void box() {
        builder.append("Đã bỏ vào hộp");
    }
}
