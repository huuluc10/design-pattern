package behavioral.observer.BTA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList<>();
    public void attach(I_TheoDoiTiGia iTheoDoiTiGia) {
        observers.add(iTheoDoiTiGia);
    }

    public void detach(I_TheoDoiTiGia iTheoDoiTiGia) {
        observers.remove(iTheoDoiTiGia);
    }

    public void notifyTiGia(float delta) {
        for (I_TheoDoiTiGia iTheoDoiTiGia: observers) {
            iTheoDoiTiGia.capNhatTiGia(delta);
        }
    }

    static public interface I_TheoDoiTiGia {
        void capNhatTiGia(float delta);
    }
}
