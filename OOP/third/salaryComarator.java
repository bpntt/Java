package OOP.third;

import java.util.Comparator;

public class salaryComarator implements Comparator<employee> {

    @Override
    public int compare(employee o1, employee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        
    }

   
    
}
