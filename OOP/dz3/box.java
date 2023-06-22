package OOP.dz3;

import java.util.ArrayList;
import java.util.Collection;

public class box<T extends fruit> {

    private ArrayList<T> fruits;

    public float getWeight() {
        float weight = 0.0f;

        for (T o : fruits) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(box<T> another) {
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void add(Collection<T> fruit) {
        fruits.addAll(fruit);
    }

    public boolean compare(box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

    @Override
    public String toString() {
        return "box [fruits=" + fruits + "]";
    }

}
