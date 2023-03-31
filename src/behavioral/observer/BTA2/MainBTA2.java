package behavioral.observer.BTA2;

public class MainBTA2 {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity();
        activity.ganButton(button);
        button.Click();
        button.Click();
        button.Click();
    }
}
