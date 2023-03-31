package behavioral.observer.BTA2;

public class Button {
    int count = 0;
    IActivity activity;

    public void Attach(IActivity activity) {
        this.activity = activity;
    }

    public void Detach() {
        this.activity = null;
    }

    public void Click() {
        count++;
        activity.hienThiThongTin(count);
    }

    public static interface IActivity {
        void hienThiThongTin(int count);
    }
}
