package structural.decorator.BoSung;

public class WidgetDecorator extends Widget{
    public WidgetDecorator(String nameWidget, Widget child) {
        super(nameWidget);
        this.child = child;
    }

    Widget child;

    @Override
    void hienThi() {
        System.out.println(nameWidget);
        System.out.print("Child: ");
        child.hienThi();
    }
}
