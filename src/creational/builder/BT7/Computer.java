package creational.builder.BT7;

public class Computer {
    String CPU;
    String RAM;
    String storage;
    String screen;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.screen = builder.screen;
        this.storage = builder.storage;
    }
    public static class  Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String screen;

        public Computer build() {
            return new Computer(this);
        }

        public Builder buildCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder buildRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder buildStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder buildScreen(String screen) {
            this.screen = screen;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
