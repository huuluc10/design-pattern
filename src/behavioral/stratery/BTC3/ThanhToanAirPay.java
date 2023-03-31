package behavioral.stratery.BTC3;

public class ThanhToanAirPay implements IThanhToan{
    @Override
    public double giamGia(double tongTien) {
        if (tongTien > 1000000) {
            return 0.03;
        }
        return 0;
    }
}
