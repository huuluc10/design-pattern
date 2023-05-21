package structural.composite.FolderTree;

public abstract class AbstractFile {
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract String getTreeFolder(int space);

}
