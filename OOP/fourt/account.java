package OOP.fourt;

public class account <T>{
      private final T id;

    public T getId() {
        return id;
    }

    private double amount;

    public double getAmount() {
        return amount;
    }

    public account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }
   public String toString(){
    return String.format("ID: %s,total: %.2f ", id, amount);
   }
}
