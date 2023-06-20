package OOP.third;

public class freelacer extends employee{


    private Integer moneyPerHour;

    public freelacer(String name, String surname, double salry, int age, int time, int moneyPerHour) {
        super(name, surname, salry, age,time);
        this.moneyPerHour = moneyPerHour;
    }
    public String toString(){
        return String.format("%s %s; FreeLancer; Age: %d; Salary: %.2f; Time: %d; Salary Per hour: %d ", surmane, name,age , calculateSalary(), time, moneyPerHour);
    }
    public int getMoneyPerHour() {
        return moneyPerHour;
    }
    public Integer getTime() {
        return time;
    }
    @Override
    public double calculateSalary() {
        return super.salry;
    }
    public Integer compareTo(freelacer o) {
        Integer res = moneyPerHour.compareTo(o.moneyPerHour);
        if (res == 0) {
            return Double.compare(moneyPerHour, o.moneyPerHour);
        }
        return res;
    }
 
}
