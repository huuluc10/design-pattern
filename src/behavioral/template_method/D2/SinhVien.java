package behavioral.template_method.D2;

import java.util.Date;

public class SinhVien {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    private Date dateOfBirth;

    public SinhVien(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }
}
