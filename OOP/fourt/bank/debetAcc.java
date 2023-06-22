package OOP.fourt.bank;

public class debetAcc<T extends personalData> extends acc  {

    public debetAcc(personalData data, double amount) {
        super(data, amount);
        
    }
    
}
