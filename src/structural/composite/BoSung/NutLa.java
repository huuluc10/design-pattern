package structural.composite.BoSung;

public class NutLa extends INode{
    @Override
    public void add(INode node) {

    }

    @Override
    public void remove(INode node) {

    }

    @Override
    public String duyetCay(int space) {
        return String.valueOf(this.giaTri);
    }

    public NutLa(int giaTri) {
        super(giaTri);
    }
}
