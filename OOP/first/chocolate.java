package OOP.first;

public class chocolate extends product {
    private int weight;
    private int calories;
    public chocolate ( String brand, String name, double price, int weight, int calories){
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getCalories(){
        return calories;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    @Override
    public String displayInfo() {
        return String.format("[Chocolate] %s - %s - %f - [weight: %d, calories: %d]", brand, name, price, weight, calories);
    }
}
