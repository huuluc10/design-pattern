package structural.decorator.BoSung;

public class WidgetCoBan extends Widget{
    public WidgetCoBan(String nameWidget) {
        super(nameWidget);
    }


    @Override
    void hienThi() {
        System.out.println(nameWidget);
    }
}
