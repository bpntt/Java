package OOP.third;

import java.util.*;

public class program {

    static Random random = new Random();

    static  employee genirateWorker(int i){
        String []names = new String[]{"a", "b"/* , "c","d","e"  */};
        String [] surnames  = new String[]{"f","g"/* ,"h", "l", "m" */};
        int age = random.nextInt(18,65);
        int salary = random.nextInt(40000,80000);
        int time =150;
        int time1 = random.nextInt(10,35);
        int MPH = random.nextInt(900,1200);
        int salary1 = time1*MPH;
        if (i%2 == 0){
        return new worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age,time);}
        else return new freelacer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary1,age, time1, MPH);
    
    }
        
    
public static void main(String [] Args) {
    employee[] employees = new employee[10];
    for (int i =0; i < employees.length; i++ ){
        if ( i%2 == 0){
        employees[i] = genirateWorker(i);}
        else employees[i] =genirateWorker(i);
    }
    Arrays.sort(employees);
    for (employee employee : employees) {
        System.out.println(employee);
    }
    /* worker worker = genirateWorker();
    System.out.println(worker); */
}
}
