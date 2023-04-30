package behavioral.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{

    List<AbstractFile> tree = new ArrayList<>();
    @Override
    public String getTreeFolder(int space) {
        StringBuffer treeName = new StringBuffer();
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i <= space; i++) {
            sp.append("\t");
        }
        treeName.append(this.name);
        for (var f : tree) {
            treeName.append("\n"+ sp + "|---");
            treeName.append(f.getTreeFolder(space + 1));
        }
       return treeName.toString();
    }

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {
        tree.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        for (var f: tree) {
            if (f == file) {
                tree.remove(f);
            }
        }
    }
}
