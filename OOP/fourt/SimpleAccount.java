package OOP.fourt;

public class SimpleAccount {
    private final int id;
    public int getId() {
        return id;
    }
    private double amount;
    public double getAmount() {
        return amount;
    }
    public SimpleAccount(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }
   public String toString(){
    return String.format("ID: %d,total: %.2f ", id, amount);
   }
}
