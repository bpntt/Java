package OOP.second;

public class dog extends animal {
    private int weight;

    public dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("woof");
    }
}
