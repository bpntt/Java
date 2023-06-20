package OOP.third;

public abstract class employee implements Comparable<employee> {
    protected String name;

    public String getName() {
        return name;
    }

    protected String surmane;

    public String getSurmane() {
        return surmane;
    }

    protected double salry;

    public double getSalry() {
        return salry;
    }

    protected int age;

    public int getAge() {
        return age;
    }
    protected Integer time;
    public Integer getTime() {
        return time;
    }

  

    public employee(String name, String surname, double salry, int age, int time){
        this.name = name;
        this.surmane = surname;
        this.salry = salry;
        this.age = age;
        this.time = time;

    }

    public abstract double calculateSalary();

/*     public int compareTo(employee o) {
        int res = name.compareTo(o.name);
        if (res == 0) {
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    } */
        public int compareTo(employee o) {
        int res = time.compareTo(o.time);
        if (res == 0) {
            return Double.compare(time, o.time);
        }
        return res;
    }
}
