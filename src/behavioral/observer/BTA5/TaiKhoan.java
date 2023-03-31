package behavioral.observer.BTA5;

public class TaiKhoan implements ATM.I_TaiKhoan {

    private ATM atm;
    private String ten;
    private int soDu;

    public TaiKhoan(ATM atm, String ten, int soDu) {
        this.atm = atm;
        this.ten = ten;
        this.soDu = soDu;
    }

    public void duaTheVaoMay() {
        atm.attach(this);
    }

    public void rutTheKhoiMay() {
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int tienRut) {
        return soDu > tienRut;
    }

    @Override
    public void nhanThongBao(int tienRut, boolean rutTien) {
        if (rutTien) {
            System.out.println("Tài khoản: " + ten);
            System.out.println("Rút tiền thành công");
            System.out.println("Số dư trước: " + soDu);
            System.out.println("Số tiền rút: " + tienRut);
            this.soDu -= tienRut;
            System.out.println("Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Rút tiền không thành công: Số tiền rút không được vượt quá số dư");
        }
    }
}
