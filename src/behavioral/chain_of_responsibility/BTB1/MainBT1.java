package behavioral.chain_of_responsibility.BTB1;

public class MainBT1 {
    public static void main(String[] args) {

        int tienRut = 353;
        System.out.println("Bạn rút: " + tienRut);

//        MenhGiaLon rutMenhGia500 = new MenhGiaLon(500);
//        MenhGiaLon rutMenhGia100 = new MenhGiaLon(100);
//        MenhGiaLon rutMenhGia50 = new MenhGiaLon(50);
//        MenhGiaLon rutMenhGia10 = new MenhGiaLon(10);
//        RutMenhGia1 rutMenhGia1 = new RutMenhGia1();
//
//        rutMenhGia500.setSuccessor(rutMenhGia100);
//        rutMenhGia100.setSuccessor(rutMenhGia50);
//        rutMenhGia50.setSuccessor(rutMenhGia10);
//        rutMenhGia10.setSuccessor(rutMenhGia1);
//

//        rutMenhGia100.RutTien(tienRut);
//        rutMenhGia100.inKetQua();

        ATMMy atmMy = new ATMMy();
        atmMy.RutTien(tienRut, MenhGiaMy.menhGia100);
    }
}
