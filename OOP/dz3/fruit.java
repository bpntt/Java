package OOP.dz3;

public abstract class fruit {
    public fruit(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    private final float weight;

}
