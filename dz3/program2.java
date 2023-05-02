package dz3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class program2 {
    public static void main(String [] args) {
        List<Integer> list = createList(10, 3, 10);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        middle(list);
    }
    static void middle(List<Integer> list){
        double summ = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            summ = summ + list.get(i); }
        System.out.println(summ);
        System.out.println(summ/list.size());
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)( Math.random()*(max-min+1)+ min));
            
        }
        return result;
    }
}
