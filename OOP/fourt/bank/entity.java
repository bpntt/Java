package OOP.fourt.bank;

public class entity implements personalData {
    public entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    private final String name;
    private final String inn;

    public String getFIO() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, name);
    }

    @Override
    public String getinn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getinn'");
    }
}
