package creational.builder.BT5;

public class MainBT5Builder {
    public static void main(String[] args) {
        Book book = new Book.Builder().setTuaDe("Cô gái đến từ hôm qua").setTacGia("Nguyễn Nhật Ánh").setSoTrang(200).
                addChuong("Chương 1").
                addChuong("Chương 2").addChuong("Chương 3").builder();
        System.out.println(book.toString());
    }
}
