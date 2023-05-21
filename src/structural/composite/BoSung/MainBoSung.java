package structural.composite.BoSung;

public class MainBoSung {
    public static void main(String[] args) {
        INode nodeLa1 = new NutLa(25);
        INode nodeLa2 = new NutLa(68);
        INode nodeLa3 = new NutLa(50);
        INode nodeLa4 = new NutLa(94);
        INode nodeCha1 = new NutCha(17);
        nodeCha1.add(nodeLa1);
        INode nodeCha2 = new NutCha(71);
        nodeCha2.add(nodeLa2);
        nodeCha2.add(nodeLa4);
        INode nodeCha = new NutCha(66);
        nodeCha.add(nodeLa3);
        nodeCha.add(nodeCha2);
        INode root = new NutCha(34);
        root.add(nodeCha1);
        root.add(nodeCha);
        System.out.println(root.duyetCay(0));
    }
}
