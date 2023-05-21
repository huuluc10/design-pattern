package behavioral.chain_of_responsibility.BoSung;

import java.util.ArrayList;
import java.util.List;

public interface IGiaiThuong {

    void giaiThapHon(IGiaiThuong giaiThuong);

    String doSo(String ve);

}
