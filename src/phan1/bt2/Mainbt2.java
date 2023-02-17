package phan1.bt2;

public class Mainbt2 {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nguyen Huu Luc", 20,"ABC",25155515, 100);
        NhanVien nv2 = new NhanVien("Nguyen Le Tam", 20,"BCD",26284511, 120);
        NhanVien nv3 = new NhanVien("Nguyen Huu Luc", 20,"ABC",25155515, 100);
        NhanVien nv4 = new NhanVien("Nguyen Le Tam", 20,"BCD",26284511, 120);
        NhanVien nv5 = new NhanVien("Nguyen Huu Luc", 20,"ABC",25155515, 100);
        quanLyNhanVien.them(nv1);
        quanLyNhanVien.them(nv2);
        quanLyNhanVien.them(nv3);
        quanLyNhanVien.them(nv4);
        quanLyNhanVien.them(nv5);
        quanLyNhanVien.inDS();
    }
}
