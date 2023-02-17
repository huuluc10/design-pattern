package phan1.bt1;

public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int total_working_time;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double salary, int total_working_time) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.total_working_time = total_working_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotal_working_time() {
        return total_working_time;
    }

    public void setTotal_working_time(int total_working_time) {
        this.total_working_time = total_working_time;
    }

    public String getThongTin() {
        String info = "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address + "\nSalary: " + this.salary + "\nTotal working time: " + this.total_working_time;
        return info;
    }
    public double tinhLuong() {
        if (this.total_working_time < 100) {
            return 0;
        } else if (this.total_working_time < 200) {
            return salary * 0.1;
        } else {
            return salary * 0.2;
        }
    }
}
