package behavioral.chain_of_responsibility.BTB1;

public class ATMVN extends ATM {

    IRutTien menhGia500;
    IRutTien menhGia100;
    IRutTien menhGia50;
    IRutTien menhGia20;
    IRutTien menhGia10;
    RutMenhGia1 menhGia1;

    public ATMVN() {
        menhGia500 = new MenhGiaLon(500);
        menhGia100 = new MenhGiaLon(100);
        menhGia50 = new MenhGiaLon(50);
        menhGia10 = new MenhGiaLon(10);
        menhGia1 = new RutMenhGia1();

        menhGia500.setSuccessor(menhGia100);
        menhGia100.setSuccessor(menhGia50);
        menhGia50.setSuccessor(menhGia10);
        menhGia10.setSuccessor(menhGia1);
    }

    @Override
    protected IRutTien getMenhGia(Enum menhGiaViet) {
        if (menhGiaViet.equals(MenhGiaViet.menhGia500)) {
            return menhGia500;
        } else if (menhGiaViet.equals(MenhGiaViet.menhGia100)) {
            return menhGia100;
        } else if (menhGiaViet.equals(MenhGiaViet.menhGia50)) {
            return menhGia50;
        } else if (menhGiaViet.equals(MenhGiaViet.menhGia10)) {
            return menhGia10;
        } else {
            return menhGia1;
        }
    }
}
