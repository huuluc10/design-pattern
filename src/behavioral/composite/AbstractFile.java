package behavioral.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFile {
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract String getTreeFolder(int space);

}
