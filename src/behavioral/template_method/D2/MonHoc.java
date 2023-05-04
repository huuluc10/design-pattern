package behavioral.template_method.D2;

public class MonHoc {
    private int id;
    private String name;
    private int creditNumber;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public MonHoc(int id, String name, int creditNumber) {
        this.id = id;
        this.name = name;
        this.creditNumber = creditNumber;
    }
}
