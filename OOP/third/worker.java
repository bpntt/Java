package OOP.third;

public class worker extends employee {

    public worker(String name, String surname, double salry, int age,int time) {
        super(name, surname, salry, age,time);
        time = 150;
        
    }
    @Override
    public double calculateSalary() {
        
        return salry;
    }
    public String toString(){
        return String.format("%s %s; Worker; Age: %d;Time: %d; Salary: %.2f", surmane, name, age,time, calculateSalary());
    }
}
