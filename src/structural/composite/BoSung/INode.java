package structural.composite.BoSung;

import structural.composite.FolderTree.AbstractFile;

public abstract class INode {
    protected int giaTri;

    public INode(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract void add(INode node);

    public abstract void remove(INode node);

    public abstract String duyetCay(int space);
}
