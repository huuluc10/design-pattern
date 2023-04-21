import java.util.ArrayList;
import java.util.List;

public class ArrayTourStorage extends TourStorageSingleton {
    private static ArrayTourStorage instance;
    private List<Tour> tours = new ArrayList<>();

    private ArrayTourStorage() {
    }

    public static TourStorageSingleton getInstance() {
        if (instance == null) {
            instance = new ArrayTourStorage();
        }
        return instance;
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public List<Tour> getTours() {
        return tours;
    }
}
