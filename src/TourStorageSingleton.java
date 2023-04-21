import java.util.*;

class Tour {
    private final String name;
    private final double price;
    private final int duration;
    private final List<Destination> destinations;

    private Tour(TourBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.duration = builder.duration;
        this.destinations = builder.destinations;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public static class TourBuilder {
        private String name;
        private double price;
        private int duration;
        private List<Destination> destinations = new ArrayList<>();

        public TourBuilder(String name, double price, int duration) {
            this.name = name;
            this.price = price;
            this.duration = duration;
        }

        public TourBuilder addDestination(String name, String address, int day) {
            this.destinations.add(new Destination(name, address, day));
            return this;
        }

        public Tour build() {
            return new Tour(this);
        }
    }

    public static class Destination {
        private final String name;
        private final String address;
        private final int day;

        public Destination(String name, String address, int day) {
            this.name = name;
            this.address = address;
            this.day = day;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getDay() {
            return day;
        }
    }
}

public abstract class TourStorageSingleton {
    private static TourStorageSingleton instance;

    protected TourStorageSingleton() {}

    public static TourStorageSingleton getInstance() {
        if (instance == null) {
            // Khởi tạo đối tượng đại diện cho hệ thống lưu trữ dữ liệu
            // ví dụ: MảngTourStorage hoặc DictionaryTourStorage
        }
        return instance;
    }

    public abstract void addTour(Tour tour);
    public abstract List<Tour> getTours();
}

public class DictionaryTourStorage extends TourStorageSingleton {
    private Map<String, Tour> tours = new HashMap<>();

    private DictionaryTourStorage() {}

    public static TourStorageSingleton getInstance() {
        if (instance == null) {
            instance = new DictionaryTourStorage();
        }
        return instance;
    }

    public void addTour(Tour tour) {
        tours.put(tour.getName(), tour);
    }

    public List<Tour> getTours() {
        return new ArrayList<>(tours.values());
    }
}
