package OOP.fourt;

public class AccounID {
    private String add;
    private int id;
    public int getId() {
        return id;
    }
    
    public AccounID(int id, String add) {
        this.id = id;
        this.add = add;
    }

    
    public String getAdd() {
        return add;
    }

    @Override
    public String toString() {
        return "AccounId{"+ "id=" + id +", add"+ add+'\''+"}";
    }
}
