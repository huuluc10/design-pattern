package structural.composite.FolderTree;

public class File extends AbstractFile {
    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    public File(String name) {
        super(name);
    }

    @Override
    public String getTreeFolder(int space) {
        return this.name;
    }
}
