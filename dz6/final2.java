package dz6;

public class final2 {
    public static class Notebook {

        public String model;
        public Integer amountRAM;
        public String os;
        public Integer ssd;
        public String col;

        public void getInfo() {
            System.out.println(this.model + ":\n\tЦвет: " + this.col + "\n\tОЗУ: " + this.amountRAM + "\n\tОбъем ЖД: "
                    + this.ssd + "\n\tОперационная система: " + this.os + "\n");
        }

        @Override
        public String toString() {
            return "Notebook [model=" + this.model + ", col=" + this.col + ", ram=" + this.amountRAM + ", rom = "
                    + this.ssd + ", os=" + this.os + "]";
        }

        public Notebook() {
            this.model = null;
            this.col = null;
            this.amountRAM = 0;
            this.ssd = 0;
            this.os = null;
        }

        public Notebook(String model, String col, Integer amountRAM, Integer ssd, String os) {
            this.model = model;
            this.col = col;
            this.amountRAM = amountRAM;
            this.ssd = ssd;
            this.os = os;
        }
    }

}