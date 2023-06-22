package OOP.fourt.bank;

public class transaction<T extends acc<? extends personalData>> {
    private final T from;
    private final T to;
    private final double amount;
    public transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if (from.getAmount()>amount){
            System.out.println("success");
            System.out.printf("from: %s :%f \n To: %s : %f", from.getData(), from.getAmount(),to.getData(), to.getAmount());
            from.setAmount(from.getAmount()-amount);
            to.setAmount(to.getAmount()+ amount);
            System.out.println(from);
            System.out.println(to);}
        else {
        System.out.println("not enaugt money");}
        }
    }

