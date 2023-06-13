package OOP.dz2;

public class plate {
    public plate(int i) {
    }

    public class Plate {
        protected int food;

        public Plate(int food) {
            this.food = food;
        }

        public void info() {
            System.out.println("plate: " + food);
        }

        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            this.food = food;
        }
    }
}
