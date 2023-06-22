package OOP.fourt.bank;

public class person implements personalData{
    public person(String fIO, String inn) {
        FIO = fIO;
        this.inn = inn;
    }
    private final String FIO;
    private final String inn;
    public String getFIO() {
        return FIO;
    }
    public String getInn() {
        return inn;
    }
    @Override
    public String toString() {
        return String.format("%s; %s", inn,FIO);
    }
    @Override
    public String getinn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getinn'");
    }
}
