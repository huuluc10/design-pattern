package behavioral.observer.BTA5;

public class MainBTA5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(atm, "Nguyễn Hữu Lực", 1000000);
        taiKhoan.duaTheVaoMay();
        atm.rutTien(500000);
        atm.rutTien(600000);
        taiKhoan.rutTheKhoiMay();
    }
}
