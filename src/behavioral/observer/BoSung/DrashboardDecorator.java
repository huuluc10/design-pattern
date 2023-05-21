package behavioral.observer.BoSung;

public abstract class DrashboardDecorator implements IDrashboard{
    IDrashboard drashboard;

    public DrashboardDecorator(IDrashboard drashboard) {
        this.drashboard = drashboard;
    }
}
