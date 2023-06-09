package classwork;
import java.util.*;
public class program33 {
    public static void main(String [] args){
    
        Integer [] arr  = cs(0, 24, 1000);
        System.out.println(Arrays.toString(arr));  
        double persent = unic(arr);
        System.out.println(persent);
      }
        static Integer [] cs(int min, int max, int capacity){
            Integer [] arr = new Integer[capacity] ;
            for (int i = 0; i < capacity; i++) {
                arr [i]= (int)(Math.random()* (max-min +1) +min);
             }
            return arr;

        }
        static double unic (Integer [] arr){
            Set <Integer> set = new HashSet<>(Arrays.asList(arr));
            double persent = set.size()* 100/arr.length;
            return persent;
        } 
}

