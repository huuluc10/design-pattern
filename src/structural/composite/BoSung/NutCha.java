package structural.composite.BoSung;

import java.util.ArrayList;
import java.util.List;

public class NutCha extends INode{
    public NutCha(int giaTri) {
        super(giaTri);
    }

    List<INode> listNutCon = new ArrayList<>();

    @Override
    public void add(INode node) {
     listNutCon.add(node);
    }

    @Override
    public void remove(INode node) {
        listNutCon.remove(node);
    }

    @Override
    public String duyetCay(int space) {
        StringBuffer treeNode = new StringBuffer();
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i <= space; i++) {
            sp.append("\t");
        }
        treeNode.append(this.giaTri);
        for (var f : listNutCon) {
            treeNode.append("\n"+ sp + "|---");
            treeNode.append(f.duyetCay(space + 1));
        }
        return treeNode.toString();
    }
}
