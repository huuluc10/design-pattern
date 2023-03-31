package behavioral.stratery.BTC2;

public class MainBTC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.addSinhVien(new SinhVien("Nguyễn Lê Tâm","12/03/2002", 9.1F));
        qlsv.addSinhVien(new SinhVien("Nguyễn Hữu Lực", "10/06/2002", 9F));
        qlsv.addSinhVien(new SinhVien("Ngô Tuấn Lam","25/01/2002", 8F));
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
