package OOP.fourt;

public class uniAcc {
    private final Object id;

    public Object getId() {
        return id;
    }

    private double amount;

    public double getAmount() {
        return amount;
    }

    public uniAcc(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }
   public String toString(){
    return String.format("ID: %s,total: %.2f ", id, amount);
   }
}
