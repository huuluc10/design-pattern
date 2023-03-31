package behavioral.stratery.BTC3;

public class ThanhToanCOD implements IThanhToan{
    @Override
    public double giamGia(double tongTien) {
        if (tongTien > 2000000) {
            return 0.02;
        }
        return 0;
    }
}
