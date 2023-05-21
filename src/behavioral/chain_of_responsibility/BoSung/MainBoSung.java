package behavioral.chain_of_responsibility.BoSung;

public class MainBoSung {
    public static void main(String[] args) {
        String[] boSoGiai1 = {"34548"};
        String[] boSoGiaiDB = {"775469"};
        IGiaiThuong giai1 = new Giai1(boSoGiai1);
        IGiaiThuong giaiDacBiet = new GiaiDacBiet(boSoGiaiDB);
        giaiDacBiet.giaiThapHon(giai1);
        System.out.println(giaiDacBiet.doSo("34548"));
    }
}
