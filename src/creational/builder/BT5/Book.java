package creational.builder.BT5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String tuaDe;
    private int soTrang;
    private String tacGia;
    private List<String> chuong;

    public Book(Builder builder) {
        this.tuaDe = builder.tuaDe;
        this.soTrang = builder.soTrang;
        this.tacGia = builder.tacGia;
        this.chuong = builder.chuong;
    }

    @Override
    public String toString() {
        return "Sách\nTựa đề: " + tuaDe + '\n' +
                "Số trang: " + soTrang + '\n' +
                "Tác giả: " + tacGia + '\n' +
                "Chương: " + chuong;
    }

    public static class Builder {
        private String tuaDe;
        private int soTrang;
        private String tacGia;
        private List<String> chuong = new ArrayList<>();

        public Builder setTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;

            return this;
        }

        public Builder setSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public Builder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder addChuong(String tenChuong) {
            chuong.add(tenChuong);
            return this;
        }

        public Book builder() {
            return new Book(this);
        }
    }
}
