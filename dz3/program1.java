package dz3;

import java.util.List;
import java.util.ArrayList;


public class program1 {
    public static void main(String [] args) {
        List<Integer> list = createList(10, 3, 10);
        System.out.println(list);
        check(list);
        System.out.println(list);
    }
    static void check(List<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            int even = list.get(i) % 2;
            if (even == 0) {}
                
            else {
                list.remove(i);
            }
        }
        }
    
    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)( Math.random()*(max-min+1)+ min));
            
        }
        return result;
    }
}
