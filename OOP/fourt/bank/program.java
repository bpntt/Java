package OOP.fourt.bank;

public class program {
    public static void main(String[] args) {
        debetAcc<entity> entacc = new debetAcc<>(new entity("null", "1213"), 100000);
        creditAcc<person> perscredit=new creditAcc<>(new person("null", "123"), 15000);

        transaction<acc<?>> tr = new transaction<acc<?>>(entacc, perscredit, 10000);
        tr.execute();
        

    }
}
