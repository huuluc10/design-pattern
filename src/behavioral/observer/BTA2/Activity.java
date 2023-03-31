package behavioral.observer.BTA2;

public class Activity implements Button.IActivity {
    private Button button;

    public void ganButton(Button button) {
        this.button = button;
        button.Attach(this);
    }

    public void thaoButton() {
        this.button = null;
        button.Detach();
    }

    @Override
    public void hienThiThongTin(int count) {
        System.out.println("Bạn click lần thứ " + count);
    }
}
