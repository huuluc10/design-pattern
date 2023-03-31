package behavioral.observer.BTA5;

public class ATM {
    I_TaiKhoan taiKhoan;
    
    public void attach(I_TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void detach(I_TaiKhoan taiKhoan) {
        this.taiKhoan = null;
    }

    private boolean kiemTraTienRut(int tienRut) {
        return taiKhoan.kiemTraSoDu(tienRut);
    }

    public void rutTien(int tienRut) {
        if (taiKhoan != null) {
            if (kiemTraTienRut(tienRut)) {
                taiKhoan.nhanThongBao(tienRut, true);
            } else {
                taiKhoan.nhanThongBao(tienRut, false);
            }
        } else {
            System.out.println("Không có thẻ trong máy.");
        }
    }

    public static interface I_TaiKhoan {
        boolean kiemTraSoDu(int tỉenRut);
        void nhanThongBao(int tienRut, boolean rutTien);
    }
}
