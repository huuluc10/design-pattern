package structural.composite;

public class MainFile {
    public static void main(String[] args) {
        AbstractFile folder = new Folder("Data");
        AbstractFile doc = new Folder("Documents");
        AbstractFile conn = new File("connectionString.txt");

        AbstractFile anh = new Folder("Ảnh");
        AbstractFile img = new File("anh.jpg");

        doc.add(anh);
        anh.add(img);

        folder.add(doc);
        folder.add(conn);

        System.out.println(folder.getTreeFolder(0));
    }
}
