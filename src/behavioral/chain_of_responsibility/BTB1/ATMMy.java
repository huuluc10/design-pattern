package behavioral.chain_of_responsibility.BTB1;

public class ATMMy extends ATM{

    IRutTien menhGia100;
    IRutTien menhGia50;
    IRutTien menhGia20;
    IRutTien menhGia10;
    IRutTien menhGia5;
    IRutTien menhGia2;
    RutMenhGia1 menhGia1;

    public ATMMy() {
        menhGia100 = new MenhGiaLon(100);
        menhGia50 = new MenhGiaLon(50);
        menhGia20 = new MenhGiaLon(20);
        menhGia10 = new MenhGiaLon(10);
        menhGia5 = new MenhGiaLon(5);
        menhGia2 = new MenhGiaLon(2);
        menhGia1 = new RutMenhGia1();

        menhGia100.setSuccessor(menhGia50);
        menhGia50.setSuccessor(menhGia20);
        menhGia20.setSuccessor(menhGia10);
        menhGia10.setSuccessor(menhGia5);
        menhGia5.setSuccessor(menhGia2);
        menhGia2.setSuccessor(menhGia1);
    }

    @Override
    protected IRutTien getMenhGia(Enum menhGiaMy) {
        if (menhGiaMy.equals(MenhGiaMy.menhGia100)) {
            return menhGia100;
        } else if (menhGiaMy.equals(MenhGiaMy.menhGia50)) {
            return menhGia50;
        } else if (menhGiaMy.equals(MenhGiaMy.menhGia20)) {
            return menhGia20;
        } else if (menhGiaMy.equals(MenhGiaMy.menhGia10)) {
            return menhGia10;
        } if (menhGiaMy.equals(MenhGiaMy.menhGia5)) {
            return menhGia5;
        } if (menhGiaMy.equals(MenhGiaMy.menhGia2)) {
            return menhGia2;
        } else {
            return menhGia1;
        }
    }
}
