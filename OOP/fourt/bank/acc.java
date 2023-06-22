package OOP.fourt.bank;

public abstract class acc<T extends personalData> {
    private final T data;
    public T getData() {
        return data;
    }
    public double getAmount() {
        return amount;
        
    }
    private double amount;
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public acc(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "acc [data=" + data + ", amount=" + amount + "]";
    }
    
}
